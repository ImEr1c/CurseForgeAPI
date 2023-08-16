package com.imer1c.requests.mods;

import com.google.common.collect.Lists;
import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetModResponse;

import java.util.List;

public class GetModRequest extends AbstractResponseRequest<GetModResponse> {
    public static final String GET_MOD_LINK_TEMPLATE = "/v1/mods/%s";

    private final int modId;

    public GetModRequest(int modId, IProperty<?>... properties) {
        super(properties);
        this.modId = modId;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return String.format(GET_MOD_LINK_TEMPLATE, modId);
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetModResponse> getResponseClass() {
        return GetModResponse.class;
    }
}
