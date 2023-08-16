package com.imer1c.requests.mods;

import com.google.common.collect.Lists;
import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetStringResponse;

import java.util.List;

public class GetModFileChangelogRequest extends AbstractResponseRequest<GetStringResponse> {

    private static final String GET_MOD_FILE_CHANGELOG_LINK_TEMPLATE = "/v1/mods/%s/files/%s/changelog";

    private final int modId;
    private final int fileId;

    public GetModFileChangelogRequest(int modId, int fileId, IProperty<?>... properties) {
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
        return String.format(GET_MOD_FILE_CHANGELOG_LINK_TEMPLATE, modId, fileId);
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetStringResponse> getResponseClass() {
        return GetStringResponse.class;
    }
}
