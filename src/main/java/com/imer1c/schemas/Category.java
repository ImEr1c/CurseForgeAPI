package com.imer1c.schemas;

public class Category {
    private final int id;
    private final int gameId;
    private final String name;
    private final String slug;
    private final String url;
    private final String iconUrl;
    private final String dateModified;
    private final boolean isClass;
    private final int classId;
    private final int parentCategoryId;
    private final int displayIndex;

    public Category(int id, int gameId, String name, String slug, String url, String iconUrl, String dateModified, boolean isClass, int classId, int parentCategoryId, int displayIndex) {
        this.id = id;
        this.gameId = gameId;
        this.name = name;
        this.slug = slug;
        this.url = url;
        this.iconUrl = iconUrl;
        this.dateModified = dateModified;
        this.isClass = isClass;
        this.classId = classId;
        this.parentCategoryId = parentCategoryId;
        this.displayIndex = displayIndex;
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

    public String getUrl() {
        return url;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getDateModified() {
        return dateModified;
    }

    public boolean isClass() {
        return isClass;
    }

    public int getClassId() {
        return classId;
    }

    public int getParentCategoryId() {
        return parentCategoryId;
    }

    public int getDisplayIndex() {
        return displayIndex;
    }
}
