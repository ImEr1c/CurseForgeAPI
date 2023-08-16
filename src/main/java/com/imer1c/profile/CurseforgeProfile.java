package com.imer1c.profile;

import com.imer1c.CurseforgeAPI;
import com.imer1c.requests.body.GetModFilesRequestBody;
import com.imer1c.schemas.files.CurseFile;

import java.util.List;

public class CurseforgeProfile {
    private final ProfileMinecraftGameVersion minecraft;
    private final String manifestType;
    private final int manifestVersion;
    private final String name;
    private final String author;
    private final List<ProfileCurseFile> files;
    private final String overrides;

    public CurseforgeProfile(ProfileMinecraftGameVersion minecraft, String manifestType, int manifestVersion, String name, String author, List<ProfileCurseFile> files, String overrides) {
        this.minecraft = minecraft;
        this.manifestType = manifestType;
        this.manifestVersion = manifestVersion;
        this.name = name;
        this.author = author;
        this.files = files;
        this.overrides = overrides;
    }

    public ProfileMinecraftGameVersion getMinecraft() {
        return minecraft;
    }

    public String getManifestType() {
        return manifestType;
    }

    public int getManifestVersion() {
        return manifestVersion;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public List<ProfileCurseFile> getFiles() {
        return files;
    }

    public String getOverrides() {
        return overrides;
    }

    public List<CurseFile> getFilesDownloadLinks(CurseforgeAPI api) {
        GetModFilesRequestBody body = new GetModFilesRequestBody.Builder().addFileIds(files.stream().map(ProfileCurseFile::getFileID).toArray(Integer[]::new)).build();

        return api.getFiles(body);
    }
}
