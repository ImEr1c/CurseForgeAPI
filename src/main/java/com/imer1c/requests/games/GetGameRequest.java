package com.imer1c.requests.games;

import com.google.common.collect.Lists;
import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetGameResponse;

import java.util.List;

public class GetGameRequest extends AbstractResponseRequest<GetGameResponse> {
    private static final String GET_GAME_LINK_TEMPLATE = "/v1/games/%s";

    private final int gameId;

    public GetGameRequest(int gameId, IProperty<?>... properties) {
        super(properties);
        this.gameId = gameId;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return String.format(GET_GAME_LINK_TEMPLATE, gameId);
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetGameResponse> getResponseClass() {
        return GetGameResponse.class;
    }
}
