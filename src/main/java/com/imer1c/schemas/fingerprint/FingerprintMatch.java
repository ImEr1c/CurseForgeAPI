package com.imer1c.schemas.fingerprint;

import com.imer1c.schemas.files.CurseFile;

import java.util.List;

public class FingerprintMatch {
    private final int id;
    private final CurseFile file;
    private final List<CurseFile> latestFiles;

    public FingerprintMatch(int id, CurseFile file, List<CurseFile> latestFiles) {
        this.id = id;
        this.file = file;
        this.latestFiles = latestFiles;
    }

    public int getId() {
        return id;
    }

    public CurseFile getFile() {
        return file;
    }

    public List<CurseFile> getLatestFiles() {
        return latestFiles;
    }
}
