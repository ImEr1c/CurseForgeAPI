package com.imer1c.profile;

import java.util.List;

public class ProfileMinecraftGameVersion {
    private final String version;
    private final List<ProfileMinecraftModLoader> modLoaders;

    public ProfileMinecraftGameVersion(String version, List<ProfileMinecraftModLoader> modLoaders) {
        this.version = version;
        this.modLoaders = modLoaders;
    }

    public String getVersion() {
        return version;
    }

    public List<ProfileMinecraftModLoader> getModLoaders() {
        return modLoaders;
    }
}
