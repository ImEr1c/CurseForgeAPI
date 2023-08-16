package com.imer1c.requests.games;

import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.properties.Properties;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetGamesResponse;

import java.util.List;

import static com.imer1c.properties.Properties.INDEX;
import static com.imer1c.properties.Properties.PAGE_SIZE;

public class GetGamesRequest extends AbstractResponseRequest<GetGamesResponse> {

    private static final String GET_GAMES_LINK_TEMPLATE = "/v1/games";

    public GetGamesRequest(IProperty<?>... properties) {
        super(properties);
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return List.of(PAGE_SIZE, INDEX);
    }

    @Override
    protected String createLink() {
        return GET_GAMES_LINK_TEMPLATE;
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetGamesResponse> getResponseClass() {
        return GetGamesResponse.class;
    }
}
