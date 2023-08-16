package com.imer1c.requests.mods;

import com.google.common.collect.Lists;
import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetModFileResponse;

import java.util.List;

public class GetModFileRequest extends AbstractResponseRequest<GetModFileResponse> {
    private static final String GET_MOD_FILE_LINK_TEMPLATE = "/v1/mods/%s/files/%s";

    private final int modId;
    private final int fileId;

    public GetModFileRequest(int modId, int fileId, IProperty<?>... properties) {
        super(properties);
        this.modId = modId;
        this.fileId = fileId;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return String.format(GET_MOD_FILE_LINK_TEMPLATE, modId, fileId);
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetModFileResponse> getResponseClass() {
        return GetModFileResponse.class;
    }
}
