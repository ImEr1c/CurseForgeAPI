package com.imer1c.schemas.games.minecraft;

import com.imer1c.enums.GameVersionStatus;
import com.imer1c.enums.GameVersionTypeStatus;

public class MinecraftGameVersion {
    private final int id;
    private final int gameVersionId;
    private final String versionString;
    private final String jarDownloadUrl;
    private final String jsonDownloadUrl;
    private final boolean approved;
    private final String dateModified;
    private final int gameVersionTypeId;
    private final GameVersionStatus gameVersionStatus;
    private final GameVersionTypeStatus gameVersionTypeStatus;

    public MinecraftGameVersion(int id, int gameVersionId, String versionString, String jarDownloadUrl, String jsonDownloadUrl, boolean approved, String dateModified, int gameVersionTypeId, GameVersionStatus gameVersionStatus, GameVersionTypeStatus gameVersionTypeStatus) {
        this.id = id;
        this.gameVersionId = gameVersionId;
        this.versionString = versionString;
        this.jarDownloadUrl = jarDownloadUrl;
        this.jsonDownloadUrl = jsonDownloadUrl;
        this.approved = approved;
        this.dateModified = dateModified;
        this.gameVersionTypeId = gameVersionTypeId;
        this.gameVersionStatus = gameVersionStatus;
        this.gameVersionTypeStatus = gameVersionTypeStatus;
    }

    public int getId() {
        return id;
    }

    public int getGameVersionId() {
        return gameVersionId;
    }

    public String getVersionString() {
        return versionString;
    }

    public String getJarDownloadUrl() {
        return jarDownloadUrl;
    }

    public String getJsonDownloadUrl() {
        return jsonDownloadUrl;
    }

    public boolean isApproved() {
        return approved;
    }

    public String getDateModified() {
        return dateModified;
    }

    public int getGameVersionTypeId() {
        return gameVersionTypeId;
    }

    public GameVersionStatus getGameVersionStatus() {
        return gameVersionStatus;
    }

    public GameVersionTypeStatus getGameVersionTypeStatus() {
        return gameVersionTypeStatus;
    }
}
