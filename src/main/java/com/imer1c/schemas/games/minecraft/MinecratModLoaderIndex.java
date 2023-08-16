package com.imer1c.schemas.games.minecraft;

import com.imer1c.enums.ModLoaderType;

public class MinecratModLoaderIndex {
    private final String name;
    private final String gameVersion;
    private final boolean latest;
    private final boolean recommended;
    private final String dateModified;
    private final ModLoaderType type;

    public MinecratModLoaderIndex(String name, String gameVersion, boolean latest, boolean recommended, String dateModified, ModLoaderType type) {
        this.name = name;
        this.gameVersion = gameVersion;
        this.latest = latest;
        this.recommended = recommended;
        this.dateModified = dateModified;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public boolean isLatest() {
        return latest;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public String getDateModified() {
        return dateModified;
    }

    public ModLoaderType getType() {
        return type;
    }
}
