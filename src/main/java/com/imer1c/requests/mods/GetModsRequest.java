package com.imer1c.requests.mods;

import com.google.common.collect.Lists;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.requests.body.GetModsByIdsListRequestBody;
import com.imer1c.requests.body.IBody;
import com.imer1c.schemas.responses.GetModsResponse;

import java.util.List;

public class GetModsRequest extends AbstractResponseRequest<GetModsResponse> {
    private static final String GET_MODS_LINK_TEMPLATE = "/v1/mods";

    private final GetModsByIdsListRequestBody body;

    public GetModsRequest(GetModsByIdsListRequestBody body) {
        this.body = body;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return GET_MODS_LINK_TEMPLATE;
    }

    @Override
    public boolean isGetRequest() {
        return false;
    }

    @Override
    protected Class<GetModsResponse> getResponseClass() {
        return GetModsResponse.class;
    }

    @Override
    protected IBody getPostRequestBody() {
        return body;
    }
}
