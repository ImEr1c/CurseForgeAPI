package com.imer1c.requests.minecraft;

import com.google.common.collect.Lists;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.requests.body.GetFeaturedModsRequestBody;
import com.imer1c.requests.body.IBody;
import com.imer1c.schemas.responses.GetFeaturedModsResponse;

import java.util.List;

public class GetFeaturedModsRequest extends AbstractResponseRequest<GetFeaturedModsResponse> {

    private static final String GET_FEATURED_MODS_LINK_TEMPLATE = "/v1/mods/featured";
    private final GetFeaturedModsRequestBody body;

    public GetFeaturedModsRequest(GetFeaturedModsRequestBody body) {
        this.body = body;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return GET_FEATURED_MODS_LINK_TEMPLATE;
    }

    @Override
    public boolean isGetRequest() {
        return false;
    }

    @Override
    protected Class<GetFeaturedModsResponse> getResponseClass() {
        return GetFeaturedModsResponse.class;
    }

    @Override
    protected IBody getPostRequestBody() {
        return body;
    }
}
