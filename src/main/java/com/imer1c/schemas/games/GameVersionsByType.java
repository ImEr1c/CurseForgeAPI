package com.imer1c.schemas.games;

import java.util.List;

public class GameVersionsByType {
    private final int type;
    private final List<String> versions;

    public GameVersionsByType(int type, List<String> versions) {
        this.type = type;
        this.versions = versions;
    }

    public int getType() {
        return type;
    }

    public List<String> getVersion() {
        return versions;
    }
}
