package com.imer1c.schemas.responses;

import com.imer1c.schemas.games.GameVersionsByType;

import java.util.List;

public class GetVersionsResponse implements IResponse {
    private final List<GameVersionsByType> data;

    public GetVersionsResponse(List<GameVersionsByType> data) {
        this.data = data;
    }

    public List<GameVersionsByType> getData() {
        return data;
    }
}
