package com.imer1c.requests.minecraft;

import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.ApiResponseOfListOfMinecraftGameVersion;

import java.util.List;

import static com.imer1c.properties.Properties.SORT_DESCENDING;

public class GetMinecraftVersionsRequest extends AbstractResponseRequest<ApiResponseOfListOfMinecraftGameVersion> {

    private static final String GET_MINECRAFT_VERSIONS_LINK_TEMPLATE = "/v1/minecraft/version";

    public GetMinecraftVersionsRequest(IProperty<?>... properties) {
        super(properties);
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return List.of(SORT_DESCENDING);
    }

    @Override
    protected String createLink() {
        return GET_MINECRAFT_VERSIONS_LINK_TEMPLATE;
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<ApiResponseOfListOfMinecraftGameVersion> getResponseClass() {
        return ApiResponseOfListOfMinecraftGameVersion.class;
    }
}
