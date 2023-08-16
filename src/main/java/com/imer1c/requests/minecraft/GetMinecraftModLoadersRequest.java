package com.imer1c.requests.minecraft;

import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.ApiResponseOfListOfMinecraftModLoaderIndex;

import java.util.List;

import static com.imer1c.properties.Properties.INCLUDE_ALL;
import static com.imer1c.properties.Properties.VERSION;

public class GetMinecraftModLoadersRequest extends AbstractResponseRequest<ApiResponseOfListOfMinecraftModLoaderIndex> {

    private static final String GET_MINECRAFT_MOD_LOADERS_LINK_TEMPLATE = "/v1/minecraft/modloader";

    public GetMinecraftModLoadersRequest(IProperty<?>... properties) {
        super(properties);
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return List.of(VERSION, INCLUDE_ALL);
    }

    @Override
    protected String createLink() {
        return GET_MINECRAFT_MOD_LOADERS_LINK_TEMPLATE;
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<ApiResponseOfListOfMinecraftModLoaderIndex> getResponseClass() {
        return ApiResponseOfListOfMinecraftModLoaderIndex.class;
    }
}
