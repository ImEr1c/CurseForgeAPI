package com.imer1c.enums;

public enum FileReleaseType {
    RELEASE,
    BETA,
    ALPHA;

    public static FileReleaseType byId(int ordinal) {
        return FileReleaseType.values()[ordinal - 1];
    }
}
