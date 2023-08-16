package com.imer1c.schemas.games;

import com.imer1c.enums.CoreAPIStatus;
import com.imer1c.enums.CoreStatus;

public class Game {
    private final int id;
    private final String name;
    private final String slug;
    private final String dateModified;
    private final GameAssets assets;
    private final int status;
    private final int apiStatus;

    public Game(int id, String name, String slug, String dateModified, GameAssets assets, int status, int apiStatus) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.dateModified = dateModified;
        this.assets = assets;
        this.status = status;
        this.apiStatus = apiStatus;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSlug() {
        return slug;
    }

    public String getDateModified() {
        return dateModified;
    }

    public GameAssets getAssets() {
        return assets;
    }

    public CoreStatus getStatus() {
        return CoreStatus.byId(status);
    }

    public CoreAPIStatus getApiStatus() {
        return CoreAPIStatus.byId(apiStatus);
    }
}
