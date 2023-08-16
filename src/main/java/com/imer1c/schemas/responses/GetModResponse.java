package com.imer1c.schemas.responses;

import com.imer1c.schemas.files.mod.Mod;

public class GetModResponse implements IResponse {
    private final Mod data;

    public GetModResponse(Mod data) {
        this.data = data;
    }

    public Mod getData() {
        return data;
    }
}
