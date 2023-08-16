package com.imer1c.schemas.responses;

import com.imer1c.schemas.games.minecraft.MinecraftModLoaderVersion;

public class ApiResponseOfMinecraftModLoaderVersion implements IResponse {
    private final MinecraftModLoaderVersion data;

    public ApiResponseOfMinecraftModLoaderVersion(MinecraftModLoaderVersion data) {
        this.data = data;
    }

    public MinecraftModLoaderVersion getData() {
        return data;
    }
}
