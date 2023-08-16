package com.imer1c.requests.curse;

import com.google.common.collect.Lists;
import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetVersionsResponse;

import java.util.List;

public class GetVersionsRequest extends AbstractResponseRequest<GetVersionsResponse> {

    private static final String GET_GAME_VERSIONS_LINK_TEMPLATE = "/v1/games/%s/versions";

    private final int gameId;

    public GetVersionsRequest(int gameId, IProperty<?>... properties) {
        super(properties);
        this.gameId = gameId;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return String.format(GET_GAME_VERSIONS_LINK_TEMPLATE, gameId);
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetVersionsResponse> getResponseClass() {
        return GetVersionsResponse.class;
    }
}
