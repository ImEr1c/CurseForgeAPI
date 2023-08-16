package com.imer1c.schemas.responses;

import com.imer1c.schemas.Pagination;
import com.imer1c.schemas.files.mod.Mod;

import java.util.List;

public class GetSearchModsResponse implements IResponse {
    private final List<Mod> data;
    private final Pagination pagination;

    public GetSearchModsResponse(List<Mod> data, Pagination pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public List<Mod> getData() {
        return data;
    }

    public Pagination getPagination() {
        return pagination;
    }
}
