package com.imer1c.schemas.games;

public class GameAssets {
    private final String iconUrl;
    private final String tileUrl;
    private final String coverUrl;

    public GameAssets(String iconUrl, String tileUrl, String coverUrl) {
        this.iconUrl = iconUrl;
        this.tileUrl = tileUrl;
        this.coverUrl = coverUrl;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getTileUrl() {
        return tileUrl;
    }

    public String getCoverUrl() {
        return coverUrl;
    }
}
