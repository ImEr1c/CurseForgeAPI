package com.imer1c.schemas.files;

import com.imer1c.enums.FileRelationType;

import java.util.Map;

public class FileDependency {
    private final int modId;
    private final int relationType;

    public FileDependency(int modId, int relationType) {
        this.modId = modId;
        this.relationType = relationType;
    }

    public int getModId() {
        return modId;
    }

    public FileRelationType getRelationType() {
        return FileRelationType.byId(relationType);
    }

    public static FileDependency parse(Map<String, ?> data) {
        int modid = (int) data.get("modId");
        int relationType = (int) data.get("relationType");

        return new FileDependency(modid, relationType);
    }
}
