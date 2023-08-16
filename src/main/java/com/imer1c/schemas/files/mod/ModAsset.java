package com.imer1c.schemas.files.mod;

public class ModAsset {
    private final int id;
    private final int modId;
    private final String title;
    private final String description;
    private final String thumbnailUrl;
    private final String url;

    public ModAsset(int id, int modId, String title, String description, String thumbnailUrl, String url) {
        this.id = id;
        this.modId = modId;
        this.title = title;
        this.description = description;
        this.thumbnailUrl = thumbnailUrl;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public int getModId() {
        return modId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getUrl() {
        return url;
    }
}
