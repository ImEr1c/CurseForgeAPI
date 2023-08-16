package com.imer1c.schemas.games;

public class GameVersionType {
    private final int id;
    private final int gameId;
    private final String name;
    private final String slug;

    public GameVersionType(int id, int gameId, String name, String slug) {
        this.id = id;
        this.gameId = gameId;
        this.name = name;
        this.slug = slug;
    }

    public int getId() {
        return id;
    }

    public int getGameId() {
        return gameId;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }
}
