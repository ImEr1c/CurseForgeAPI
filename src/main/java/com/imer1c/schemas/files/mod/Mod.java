package com.imer1c.schemas.files.mod;

import com.imer1c.enums.ModStatus;
import com.imer1c.schemas.Category;
import com.imer1c.schemas.files.CurseFile;
import com.imer1c.schemas.files.FileIndex;

import java.util.List;

public class Mod {
    private final int id;
    private final int gameId;
    private final String name;
    private final String slug;
    private final ModLinks links;
    private final String summary;
    private final int status;
    private final long downloadCount;
    private final boolean isFeatured;
    private final int primaryCategoryId;
    private final List<Category> categories;
    private final int classId;
    private final List<ModAuthor> authors;
    private final ModAsset logo;
    private final List<ModAsset> screenshots;
    private final int mainFileId;
    private final List<CurseFile> latestFiles;
    private final List<FileIndex> latestFilesIndexes;
    private final String dateCreated;
    private final String dateModified;
    private final String dateReleased;
    private final boolean allowModDistribution;
    private final int gamePopularityRank;
    private final boolean isAvailable;
    private final int thumbsUpCount;

    public Mod(int id, int gameId, String name, String slug, ModLinks links, String summary, int status, long downloadCount, boolean isFeatured, int primaryCategoryId, List<Category> categories, int classId, List<ModAuthor> authors, ModAsset logo, List<ModAsset> screenshots, int mainFileId, List<CurseFile> latestFiles, List<FileIndex> latestFilesIndexes, String dateCreated, String dateModified, String dateReleased, boolean allowModDistribution, int gamePopularityRank, boolean isAvailable, int thumbsUpCount) {
        this.id = id;
        this.gameId = gameId;
        this.name = name;
        this.slug = slug;
        this.links = links;
        this.summary = summary;
        this.status = status;
        this.downloadCount = downloadCount;
        this.isFeatured = isFeatured;
        this.primaryCategoryId = primaryCategoryId;
        this.categories = categories;
        this.classId = classId;
        this.authors = authors;
        this.logo = logo;
        this.screenshots = screenshots;
        this.mainFileId = mainFileId;
        this.latestFiles = latestFiles;
        this.latestFilesIndexes = latestFilesIndexes;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.dateReleased = dateReleased;
        this.allowModDistribution = allowModDistribution;
        this.gamePopularityRank = gamePopularityRank;
        this.isAvailable = isAvailable;
        this.thumbsUpCount = thumbsUpCount;
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

    public ModLinks getLinks() {
        return links;
    }

    public String getSummary() {
        return summary;
    }

    public ModStatus getStatus() {
        return ModStatus.byId(status);
    }

    public long getDownloadCount() {
        return downloadCount;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public int getPrimaryCategoryId() {
        return primaryCategoryId;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public int getClassId() {
        return classId;
    }

    public List<ModAuthor> getAuthors() {
        return authors;
    }

    public ModAsset getLogo() {
        return logo;
    }

    public List<ModAsset> getScreenshots() {
        return screenshots;
    }

    public int getMainFileId() {
        return mainFileId;
    }

    public List<CurseFile> getLatestFiles() {
        return latestFiles;
    }

    public List<FileIndex> getLatestFilesIndexes() {
        return latestFilesIndexes;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getDateModified() {
        return dateModified;
    }

    public String getDateReleased() {
        return dateReleased;
    }

    public boolean isAllowModDistribution() {
        return allowModDistribution;
    }

    public int getGamePopularityRank() {
        return gamePopularityRank;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public int getThumbsUpCount() {
        return thumbsUpCount;
    }
}
