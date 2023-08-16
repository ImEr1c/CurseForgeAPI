package com.imer1c.requests.curse;

import com.google.common.collect.Lists;
import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetVersionTypesResponse;

import java.util.List;

public class GetVersionTypesRequest extends AbstractResponseRequest<GetVersionTypesResponse> {
    private static final String GET_VERSION_TYPES_LINK_TEMPLATE = "/v1/games/%s/version-types";

    private final int gameId;

    public GetVersionTypesRequest(int gameId, IProperty<?>... properties) {
        super(properties);
        this.gameId = gameId;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return String.format(GET_VERSION_TYPES_LINK_TEMPLATE, gameId);
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetVersionTypesResponse> getResponseClass() {
        return GetVersionTypesResponse.class;
    }
}
