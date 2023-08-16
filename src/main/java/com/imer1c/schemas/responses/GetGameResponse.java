package com.imer1c.schemas.responses;

import com.imer1c.schemas.games.Game;

public class GetGameResponse implements IResponse {
    private final Game data;

    public GetGameResponse(Game data) {
        this.data = data;
    }

    public Game getData() {
        return data;
    }
}
