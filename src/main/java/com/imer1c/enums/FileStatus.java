package com.imer1c.enums;

public enum FileStatus {
    PROCESSING,
    CHANGES_REQUIRED,
    UNDER_REVIEW,
    APPROVED,
    REJECTED,
    MALWARE_DETECTED,
    DELETED,
    ARCHIVED,
    TESTING,
    RELEASED,
    READY_FOR_REVIEW,
    DEPRECATED,
    BAKING,
    AWAITING_PUBLISHING,
    FAILED_PUBLISHING;

    public static FileStatus byId(int ordinal) {
        return FileStatus.values()[ordinal - 1];
    }
}
