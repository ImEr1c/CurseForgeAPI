package com.imer1c.enums;

public enum FileRelationType {
    EMBEDDED_LIBRARY,
    OPTIONAL_DEPENDENCY,
    REQUIRED_DEPENDENCY,
    TOOL,
    INCOMPATIBLE,
    INCLUDE;

    public static FileRelationType byId(int ordinal) {
        return FileRelationType.values()[ordinal - 1];
    }
}
