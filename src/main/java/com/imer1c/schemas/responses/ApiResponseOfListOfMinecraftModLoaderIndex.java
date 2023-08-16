package com.imer1c.schemas.responses;

import com.imer1c.schemas.games.minecraft.MinecratModLoaderIndex;

import java.util.List;

public class ApiResponseOfListOfMinecraftModLoaderIndex implements IResponse {
    private final List<MinecratModLoaderIndex> data;

    public ApiResponseOfListOfMinecraftModLoaderIndex(List<MinecratModLoaderIndex> data) {
        this.data = data;
    }

    public List<MinecratModLoaderIndex> getData() {
        return data;
    }
}
