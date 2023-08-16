package com.imer1c.schemas.responses;

import com.imer1c.schemas.Pagination;
import com.imer1c.schemas.games.Game;

import java.util.List;

public class GetGamesResponse implements IResponse {
    private final List<Game> data;
    private final Pagination pagination;

    public GetGamesResponse(List<Game> data, Pagination pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public List<Game> getData() {
        return data;
    }

    public Pagination getPagination() {
        return pagination;
    }
}
