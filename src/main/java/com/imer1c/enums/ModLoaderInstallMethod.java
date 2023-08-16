package com.imer1c.enums;

public enum ModLoaderInstallMethod {
    FORGE_INSTALLER,
    FORGE_JAR_INSTALLER,
    FORGE_INSTALLER_V2;

    public static ModLoaderInstallMethod byId(int ordinal) {
        return ModLoaderInstallMethod.values()[ordinal - 1];
    }
}
