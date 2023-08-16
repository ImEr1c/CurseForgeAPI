package com.imer1c.requests.curse;

import com.google.common.collect.Lists;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.requests.body.GetModFilesRequestBody;
import com.imer1c.requests.body.IBody;
import com.imer1c.schemas.responses.GetFilesResponse;

import java.util.List;

public class GetFilesRequest extends AbstractResponseRequest<GetFilesResponse> {

    private static final String GET_FILES_LINK_TEMPLATE = "/v1/mods/files";

    private final GetModFilesRequestBody body;

    public GetFilesRequest(GetModFilesRequestBody body) {
        this.body = body;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return GET_FILES_LINK_TEMPLATE;
    }

    @Override
    public boolean isGetRequest() {
        return false;
    }

    @Override
    protected Class<GetFilesResponse> getResponseClass() {
        return GetFilesResponse.class;
    }

    @Override
    protected IBody getPostRequestBody() {
        return body;
    }
}
