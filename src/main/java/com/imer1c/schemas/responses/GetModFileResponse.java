package com.imer1c.schemas.responses;

import com.imer1c.schemas.files.CurseFile;

public class GetModFileResponse implements IResponse {
    private final CurseFile data;

    public GetModFileResponse(CurseFile data) {
        this.data = data;
    }

    public CurseFile getData() {
        return data;
    }
}
