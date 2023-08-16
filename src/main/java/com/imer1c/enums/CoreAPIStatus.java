package com.imer1c.enums;

public enum CoreAPIStatus {
    PRIVATE,
    PUBLIC;

    public static CoreAPIStatus byId(int ordinal) {
        return CoreAPIStatus.values()[ordinal - 1];
    }
}
