package com.imer1c.schemas.fingerprint;

import com.imer1c.schemas.files.CurseFile;

import java.util.List;

public class FingerprintFuzzyMatch {
    private final int id;
    private final CurseFile file;
    private final List<CurseFile> latestFiles;
    private final List<Integer> fingerprints;

    public FingerprintFuzzyMatch(int id, CurseFile file, List<CurseFile> latestFiles, List<Integer> fingerprints) {
        this.id = id;
        this.file = file;
        this.latestFiles = latestFiles;
        this.fingerprints = fingerprints;
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

    public List<Integer> getFingerprints() {
        return fingerprints;
    }
}
