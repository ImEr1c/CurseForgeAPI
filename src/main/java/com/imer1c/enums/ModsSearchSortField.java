package com.imer1c.enums;

public enum ModsSearchSortField {
    FEATURED,
    POPULARITY,
    LAST_UPDATED,
    NAME,
    AUTHOR,
    TOTAL_DOWNLOADS,
    CATEGORY,
    GAME_VERSION;

    public static ModsSearchSortField byId(int ordinal) {
        return ModsSearchSortField.values()[ordinal - 1];
    }
}
