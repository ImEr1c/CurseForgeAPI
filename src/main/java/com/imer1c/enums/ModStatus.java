package com.imer1c.enums;

public enum ModStatus {
    NEW,
    CHANGES_REQUIRED,
    UNDER_SOFT_REVIEW,
    APPROVED,
    REJECTED,
    CHANGES_MADE,
    INACTIVE,
    ABANDONED,
    DELETED,
    UNDER_REVIEW;

    public static ModStatus byId(int ordinal) {
        return ModStatus.values()[ordinal - 1];
    }
}
