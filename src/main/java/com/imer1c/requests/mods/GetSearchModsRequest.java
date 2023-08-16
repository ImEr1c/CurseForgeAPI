package com.imer1c.requests.mods;

import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetSearchModsResponse;

import java.util.List;

import static com.imer1c.properties.Properties.*;

public class GetSearchModsRequest extends AbstractResponseRequest<GetSearchModsResponse> {
    private static final String GET_SEARCH_LINK_TEMPLATE = "/v1/mods/search";

    public GetSearchModsRequest(IProperty<?>... properties) {
        super(properties);
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return List.of(GAME_ID, CLASS_ID, CATEGORY_ID, GAME_VERSION, SEARCH_FILTER, SORT_FIELD, SORT_ORDER, MOD_LOADER_TYPE, GAME_VERSION_TYPE_ID, SLUG, INDEX, PAGE_SIZE);
    }

    @Override
    protected String createLink() {
        return GET_SEARCH_LINK_TEMPLATE;
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetSearchModsResponse> getResponseClass() {
        return GetSearchModsResponse.class;
    }
}
