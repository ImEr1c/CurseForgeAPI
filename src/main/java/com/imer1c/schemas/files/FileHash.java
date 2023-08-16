package com.imer1c.schemas.files;

import com.imer1c.enums.HashAlgo;

public class FileHash {
    private final String value;
    private final int algo;

    public FileHash(String value, int algo) {
        this.value = value;
        this.algo = algo;
    }

    public String getValue() {
        return value;
    }

    public HashAlgo getAlgo() {
        return HashAlgo.byId(algo);
    }
}
