package com.imer1c.schemas.responses;

import com.imer1c.schemas.files.CurseFile;

import java.io.File;
import java.util.List;

public class GetFilesResponse implements IResponse {
    private final List<CurseFile> data;

    public GetFilesResponse(List<CurseFile> data) {
        this.data = data;
    }

    public List<CurseFile> getData() {
        return data;
    }
}
