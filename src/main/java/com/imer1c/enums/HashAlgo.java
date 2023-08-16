package com.imer1c.enums;

public enum HashAlgo {
    SHA1,
    MD5;

    public static HashAlgo byId(int ordinal) {
        return HashAlgo.values()[ordinal - 1];
    }
}
