package com.imer1c.schemas.responses;

import com.imer1c.schemas.games.minecraft.MinecraftGameVersion;

public class ApiResponseOfMinecraftGameVersion implements IResponse {
    private final MinecraftGameVersion data;

    public ApiResponseOfMinecraftGameVersion(MinecraftGameVersion data) {
        this.data = data;
    }

    public MinecraftGameVersion getData() {
        return data;
    }
}
