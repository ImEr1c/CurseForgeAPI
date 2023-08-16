package com.imer1c.schemas.responses;

import com.imer1c.schemas.Category;

import java.util.List;

public class GetCategoriesResponse implements IResponse {
    private final List<Category> data;

    public GetCategoriesResponse(List<Category> data) {
        this.data = data;
    }

    public List<Category> getData() {
        return data;
    }
}
