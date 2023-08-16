package com.imer1c.requests.mods;

import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetModFilesResponse;

import java.util.List;

import static com.imer1c.properties.Properties.*;

public class GetModFilesRequest extends AbstractResponseRequest<GetModFilesResponse> {
    private static final String GET_MOD_FILES_TEMPLATE = "/v1/mods/%s/files";

    private final int modid;

    public GetModFilesRequest(int modid, IProperty<?>... properties) {
        super(properties);
        this.modid = modid;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return List.of(GAME_VERSION, MOD_LOADER_TYPE, GAME_VERSION_TYPE_ID, INDEX, PAGE_SIZE);
    }

    @Override
    protected String createLink() {
        return String.format(GET_MOD_FILES_TEMPLATE, modid);
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetModFilesResponse> getResponseClass() {
        return GetModFilesResponse.class;
    }
}
