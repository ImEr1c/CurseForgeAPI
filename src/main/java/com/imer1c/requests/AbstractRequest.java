package com.imer1c.requests;

import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.body.IBody;
import com.imer1c.util.HttpUtil;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractRequest {
    private final List<IProperty<?>> properties = new ArrayList<>();

    public AbstractRequest(IProperty<?>... properties) {
        List<String> acceptedProperties = this.acceptedProperties().stream().map(IPropertyFactory::getId).toList();

        for (IProperty<?> property : properties)
        {
            if (!acceptedProperties.contains(property.getId()))
            {
                throw new IllegalArgumentException("Property " + property.getId() + " isn't accepted in " + this.getClass());
            }
            else
            {
                this.properties.add(property);
            }
        }
    }

    protected abstract List<IPropertyFactory<?>> acceptedProperties();

    protected abstract String createLink();

    public abstract boolean isGetRequest();

    private String createGetRequestURL() {
        StringBuilder urlBuilder = new StringBuilder("https://api.curseforge.com").append(this.createLink());

        if (properties.isEmpty())
        {
            return urlBuilder.toString();
        }

        urlBuilder.append("?");

        for (int i = 0; i < properties.size(); i++)
        {
            if (i != 0)
            {
                urlBuilder.append("&");
            }

            IProperty<?> property = properties.get(i);

            urlBuilder.append(property.formatAsGet());
        }

        return urlBuilder.toString();
    }

    public String execute(String apiKey) {
        if (isGetRequest())
        {
            return HttpUtil.sendGetRequest(apiKey, this.createGetRequestURL());
        }
        else
        {
            return HttpUtil.sendPostRequest(apiKey, this.createGetRequestURL(), this.getPostRequestBody());
        }
    }

    protected IBody getPostRequestBody() {
        return null;
    }
}
