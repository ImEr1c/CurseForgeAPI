package com.imer1c.requests.minecraft;

import com.google.common.collect.Lists;
import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.ApiResponseOfMinecraftModLoaderVersion;

import java.util.List;

public class GetSpecificMinecraftModLoaderRequest extends AbstractResponseRequest<ApiResponseOfMinecraftModLoaderVersion> {
    private static final String GET_SPECIFIC_MINECRAT_MOD_LOADER_LINK_TEMPLATE = "/v1/minecraft/modloader/%s";

    private final String modLoaderName;

    public GetSpecificMinecraftModLoaderRequest(String modLoaderName, IProperty<?>... properties) {
        super(properties);
        this.modLoaderName = modLoaderName;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return String.format(GET_SPECIFIC_MINECRAT_MOD_LOADER_LINK_TEMPLATE, modLoaderName);
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<ApiResponseOfMinecraftModLoaderVersion> getResponseClass() {
        return ApiResponseOfMinecraftModLoaderVersion.class;
    }
}
