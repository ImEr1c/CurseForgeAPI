package com.imer1c.enums;

public enum GameVersionStatus {
    APPROVED,
    DELETED,
    NEW;

    public static GameVersionStatus byId(int ordinal) {
        return GameVersionStatus.values()[ordinal - 1];
    }
}
