package com.imer1c.schemas.files;

import com.imer1c.enums.FileReleaseType;
import com.imer1c.enums.ModLoaderType;

public class FileIndex {
    private final String gameVersion;
    private final int fileId;
    private final String filename;
    private final int releaseType;
    private final int gameVersionTypeId;
    private final int modLoader;

    public FileIndex(String gameVersion, int fileId, String filename, int releaseType, int gameVersionTypeId, int modLoader) {
        this.gameVersion = gameVersion;
        this.fileId = fileId;
        this.filename = filename;
        this.releaseType = releaseType;
        this.gameVersionTypeId = gameVersionTypeId;
        this.modLoader = modLoader;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public int getFileId() {
        return fileId;
    }

    public String getFilename() {
        return filename;
    }

    public FileReleaseType getReleaseType() {
        return FileReleaseType.byId(releaseType);
    }

    public int getGameVersionTypeId() {
        return gameVersionTypeId;
    }

    public ModLoaderType getModLoader() {
        return ModLoaderType.values()[modLoader];
    }
}
