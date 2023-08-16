package com.imer1c.schemas.responses;

import com.imer1c.schemas.games.minecraft.MinecraftGameVersion;

import java.util.List;

public class ApiResponseOfListOfMinecraftGameVersion implements IResponse {
    private final List<MinecraftGameVersion> data;

    public ApiResponseOfListOfMinecraftGameVersion(List<MinecraftGameVersion> data) {
        this.data = data;
    }

    public List<MinecraftGameVersion> getData() {
        return data;
    }
}
