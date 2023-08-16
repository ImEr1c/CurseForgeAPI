package com.imer1c.schemas.responses;

import com.imer1c.schemas.files.CurseFile;
import com.imer1c.schemas.Pagination;

import java.util.List;

public class GetModFilesResponse implements IResponse {
    private final List<CurseFile> data;
    private final Pagination pagination;

    public GetModFilesResponse(List<CurseFile> data, Pagination pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public List<CurseFile> getData() {
        return data;
    }

    public Pagination getPagination() {
        return pagination;
    }
}
