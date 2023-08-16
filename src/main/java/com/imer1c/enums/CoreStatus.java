package com.imer1c.enums;

public enum CoreStatus {
    DRAFT,
    TEST,
    PENDING_REVIEW,
    REJECTED,
    APPROVED,
    LIVE;

    public static CoreStatus byId(int ordinal) {
        return CoreStatus.values()[ordinal - 1];
    }
}
