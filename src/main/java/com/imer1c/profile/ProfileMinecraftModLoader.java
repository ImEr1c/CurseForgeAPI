package com.imer1c.profile;

public class ProfileMinecraftModLoader {
    private final String id;
    private final boolean primary;

    public ProfileMinecraftModLoader(String id, boolean primary) {
        this.id = id;
        this.primary = primary;
    }

    public String getId() {
        return id;
    }

    public boolean isPrimary() {
        return primary;
    }
}
