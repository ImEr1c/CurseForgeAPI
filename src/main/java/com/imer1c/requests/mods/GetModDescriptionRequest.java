package com.imer1c.requests.mods;

import com.google.common.collect.Lists;
import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetStringResponse;

import java.util.List;

public class GetModDescriptionRequest extends AbstractResponseRequest<GetStringResponse> {
    private static final String GET_MOD_DESCRIPTION_LINK_TEMPLATE = "/v1/mods/%s/description";

    private final int modId;

    public GetModDescriptionRequest(int modId, IProperty<?>... properties) {
        super(properties);
        this.modId = modId;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return String.format(GET_MOD_DESCRIPTION_LINK_TEMPLATE, modId);
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetStringResponse> getResponseClass() {
        return GetStringResponse.class;
    }
}
