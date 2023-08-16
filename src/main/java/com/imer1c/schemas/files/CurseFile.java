package com.imer1c.schemas.files;

import com.imer1c.enums.FileReleaseType;
import com.imer1c.enums.FileStatus;
import com.imer1c.schemas.games.SortableGameVersion;

import java.util.List;

public class CurseFile {
    private final int id;
    private final int gameId;
    private final int modId;
    private final boolean isAvailable;
    private final String displayName;
    private final String fileName;
    private final int releaseType;
    private final int fileStatus;
    private final List<FileHash> hashes;
    private final String fileDate;
    private final long fileLength;
    private final long downloadCount;
    private final String downloadUrl;
    private final List<String> gameVersions;
    private final List<SortableGameVersion> sortableGameVersions;
    private final List<FileDependency> dependencies;
    private final boolean exposeAsAlternative;
    private final int parentProjectFileId;
    private final int alternateFileId;
    private final boolean isServerPack;
    private final int serverPackFileId;
    private final long fileFingerprint;
    private final List<FileModule> modules;

    public CurseFile(int id, int gameId, int modId, boolean isAvailable, String displayName, String fileName, int releaseType, int fileStatus, List<FileHash> hashes, String fileDate, long fileLength, long downloadCount, String downloadUrl, List<String> gameVersions, List<SortableGameVersion> sortableGameVersions, List<FileDependency> dependencies, boolean exposeAsAlternative, int parentProjectFileId, int alternateFileId, boolean isServerPack, int serverPackFileId, long fileFingerprint, List<FileModule> modules) {
        this.id = id;
        this.gameId = gameId;
        this.modId = modId;
        this.isAvailable = isAvailable;
        this.displayName = displayName;
        this.fileName = fileName;
        this.releaseType = releaseType;
        this.fileStatus = fileStatus;
        this.hashes = hashes;
        this.fileDate = fileDate;
        this.fileLength = fileLength;
        this.downloadCount = downloadCount;
        this.downloadUrl = downloadUrl;
        this.gameVersions = gameVersions;
        this.sortableGameVersions = sortableGameVersions;
        this.dependencies = dependencies;
        this.exposeAsAlternative = exposeAsAlternative;
        this.parentProjectFileId = parentProjectFileId;
        this.alternateFileId = alternateFileId;
        this.isServerPack = isServerPack;
        this.serverPackFileId = serverPackFileId;
        this.fileFingerprint = fileFingerprint;
        this.modules = modules;
    }

    public int getId() {
        return id;
    }

    public int getGameId() {
        return gameId;
    }

    public int getModId() {
        return modId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getFileName() {
        return fileName;
    }

    public FileReleaseType getReleaseType() {
        return FileReleaseType.byId(releaseType);
    }

    public FileStatus getFileStatus() {
        return FileStatus.byId(fileStatus);
    }

    public List<FileHash> getHashes() {
        return hashes;
    }

    public String getFileDate() {
        return fileDate;
    }

    public long getFileLength() {
        return fileLength;
    }

    public long getDownloadCount() {
        return downloadCount;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public List<String> getGameVersions() {
        return gameVersions;
    }

    public List<SortableGameVersion> getSortableGameVersions() {
        return sortableGameVersions;
    }

    public List<FileDependency> getDependencies() {
        return dependencies;
    }

    public boolean isExposeAsAlternative() {
        return exposeAsAlternative;
    }

    public int getParentProjectFileId() {
        return parentProjectFileId;
    }

    public int getAlternateFileId() {
        return alternateFileId;
    }

    public boolean isServerPack() {
        return isServerPack;
    }

    public int getServerPackFileId() {
        return serverPackFileId;
    }

    public long getFileFingerprint() {
        return fileFingerprint;
    }

    public List<FileModule> getModules() {
        return modules;
    }
}
