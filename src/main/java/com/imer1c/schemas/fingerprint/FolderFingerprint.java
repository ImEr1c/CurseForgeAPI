package com.imer1c.schemas.fingerprint;

import java.util.List;

public class FolderFingerprint {
    private final String folderName;
    private final List<Integer> fingerprints;

    public FolderFingerprint(String folderName, List<Integer> fingerprints) {
        this.folderName = folderName;
        this.fingerprints = fingerprints;
    }

    public String getFolderName() {
        return folderName;
    }

    public List<Integer> getFingerprints() {
        return fingerprints;
    }
}
