package com.imer1c.schemas.responses;

import com.imer1c.schemas.games.GameVersionType;

import java.util.List;

public class GetVersionTypesResponse implements IResponse {
    private final List<GameVersionType> data;

    public GetVersionTypesResponse(List<GameVersionType> data) {
        this.data = data;
    }

    public List<GameVersionType> getData() {
        return data;
    }
}
