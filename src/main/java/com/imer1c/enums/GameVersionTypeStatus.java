package com.imer1c.enums;

public enum GameVersionTypeStatus {
    NORMAL,
    DELETED;

    public static GameVersionTypeStatus byId(int ordinal) {
        return GameVersionTypeStatus.values()[ordinal - 1];
    }
}
