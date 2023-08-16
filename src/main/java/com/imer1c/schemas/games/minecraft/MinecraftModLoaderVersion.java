package com.imer1c.schemas.games.minecraft;

import com.imer1c.enums.GameVersionStatus;
import com.imer1c.enums.GameVersionTypeStatus;
import com.imer1c.enums.ModLoaderInstallMethod;
import com.imer1c.enums.ModLoaderType;

public class MinecraftModLoaderVersion {
    private final int id;
    private final int gameVersionId;
    private final int minecraftGameVersionId;
    private final String forgeVersion;
    private final String name;
    private final ModLoaderType type;
    private final String downloadUrl;
    private final String filename;
    private final int installMethod;
    private final boolean latest;
    private final boolean recommended;
    private final boolean approved;
    private final String dateModified;
    private final String mavenVersionString;
    private final String versionJson;
    private final String librariesInstallLocation;
    private final String minecraftVersion;
    private final String additionalFilesJson;
    private final int modLoaderGameVersionId;
    private final int modLoaderGameVersionTypeId;
    private final int modLoaderGameVersionStatus;
    private final int modLoaderGameVersionTypeStatus;
    private final int mcGameVersionId;
    private final int mcGameVersionTypeId;
    private final int mcGameVersionStatus;
    private final int mcGameVersionTypeStatus;
    private final String installProfileJson;

    public MinecraftModLoaderVersion(int id, int gameVersionId, int minecraftGameVersionId, String forgeVersion, String name, ModLoaderType type, String downloadUrl, String filename, int installMethod, boolean latest, boolean recommended, boolean approved, String dateModified, String mavenVersionString, String versionJson, String librariesInstallLocation, String minecraftVersion, String additionalFilesJson, int modLoaderGameVersionId, int modLoaderGameVersionTypeId, int modLoaderGameVersionStatus, int modLoaderGameVersionTypeStatus, int mcGameVersionId, int mcGameVersionTypeId, int mcGameVersionStatus, int mcGameVersionTypeStatus, String installProfileJson) {
        this.id = id;
        this.gameVersionId = gameVersionId;
        this.minecraftGameVersionId = minecraftGameVersionId;
        this.forgeVersion = forgeVersion;
        this.name = name;
        this.type = type;
        this.downloadUrl = downloadUrl;
        this.filename = filename;
        this.installMethod = installMethod;
        this.latest = latest;
        this.recommended = recommended;
        this.approved = approved;
        this.dateModified = dateModified;
        this.mavenVersionString = mavenVersionString;
        this.versionJson = versionJson;
        this.librariesInstallLocation = librariesInstallLocation;
        this.minecraftVersion = minecraftVersion;
        this.additionalFilesJson = additionalFilesJson;
        this.modLoaderGameVersionId = modLoaderGameVersionId;
        this.modLoaderGameVersionTypeId = modLoaderGameVersionTypeId;
        this.modLoaderGameVersionStatus = modLoaderGameVersionStatus;
        this.modLoaderGameVersionTypeStatus = modLoaderGameVersionTypeStatus;
        this.mcGameVersionId = mcGameVersionId;
        this.mcGameVersionTypeId = mcGameVersionTypeId;
        this.mcGameVersionStatus = mcGameVersionStatus;
        this.mcGameVersionTypeStatus = mcGameVersionTypeStatus;
        this.installProfileJson = installProfileJson;
    }

    public int getId() {
        return id;
    }

    public int getGameVersionId() {
        return gameVersionId;
    }

    public int getMinecraftGameVersionId() {
        return minecraftGameVersionId;
    }

    public String getForgeVersion() {
        return forgeVersion;
    }

    public String getName() {
        return name;
    }

    public ModLoaderType getType() {
        return type;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public String getFilename() {
        return filename;
    }

    public ModLoaderInstallMethod getInstallMethod() {
        return ModLoaderInstallMethod.byId(installMethod);
    }

    public boolean isLatest() {
        return latest;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public boolean isApproved() {
        return approved;
    }

    public String getDateModified() {
        return dateModified;
    }

    public String getMavenVersionString() {
        return mavenVersionString;
    }

    public String getVersionJson() {
        return versionJson;
    }

    public String getLibrariesInstallLocation() {
        return librariesInstallLocation;
    }

    public String getMinecraftVersion() {
        return minecraftVersion;
    }

    public String getAdditionalFilesJson() {
        return additionalFilesJson;
    }

    public int getModLoaderGameVersionId() {
        return modLoaderGameVersionId;
    }

    public int getModLoaderGameVersionTypeId() {
        return modLoaderGameVersionTypeId;
    }

    public GameVersionStatus getModLoaderGameVersionStatus() {
        return GameVersionStatus.byId(modLoaderGameVersionStatus);
    }

    public GameVersionTypeStatus getModLoaderGameVersionTypeStatus() {
        return GameVersionTypeStatus.byId(modLoaderGameVersionTypeStatus);
    }

    public int getMcGameVersionId() {
        return mcGameVersionId;
    }

    public int getMcGameVersionTypeId() {
        return mcGameVersionTypeId;
    }

    public GameVersionStatus getMcGameVersionStatus() {
        return GameVersionStatus.byId(mcGameVersionStatus);
    }

    public GameVersionTypeStatus getMcGameVersionTypeStatus() {
        return GameVersionTypeStatus.byId(mcGameVersionTypeStatus);
    }

    public String getInstallProfileJson() {
        return installProfileJson;
    }
}
