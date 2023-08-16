package com.imer1c.requests.minecraft;

import com.google.common.collect.Lists;
import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.ApiResponseOfMinecraftGameVersion;

import java.util.List;

public class GetSpecificMinecraftVersionRequest extends AbstractResponseRequest<ApiResponseOfMinecraftGameVersion> {

    private static final String GET_SPECIFIC_MINECRAFT_VERSION_LINK_TEMPLATE = "/v1/minecraft/version/%s";

    private final String gameVersion;

    public GetSpecificMinecraftVersionRequest(String gameVersion, IProperty<?>... properties) {
        super(properties);
        this.gameVersion = gameVersion;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return String.format(GET_SPECIFIC_MINECRAFT_VERSION_LINK_TEMPLATE, gameVersion);
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<ApiResponseOfMinecraftGameVersion> getResponseClass() {
        return ApiResponseOfMinecraftGameVersion.class;
    }
}
