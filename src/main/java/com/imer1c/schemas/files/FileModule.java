package com.imer1c.schemas.files;

public class FileModule {
    private final String name;
    private final long fingerprint;

    public FileModule(String name, long fingerprint) {
        this.name = name;
        this.fingerprint = fingerprint;
    }

    public String getName() {
        return name;
    }

    public long getFingerprint() {
        return fingerprint;
    }
}
