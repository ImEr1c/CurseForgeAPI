package com.imer1c.schemas.responses;

import com.imer1c.schemas.files.mod.Mod;

import java.util.List;

public class GetModsResponse implements IResponse {
    private final List<Mod> data;

    public GetModsResponse(List<Mod> data) {
        this.data = data;
    }

    public List<Mod> getData() {
        return data;
    }
}
