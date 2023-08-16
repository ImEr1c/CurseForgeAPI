package com.imer1c.schemas.fingerprint;

import java.util.List;

public class FingerprintFuzzyMatchResult {
    private final List<FingerprintFuzzyMatch> fuzzyMatches;

    public FingerprintFuzzyMatchResult(List<FingerprintFuzzyMatch> fuzzyMatches) {
        this.fuzzyMatches = fuzzyMatches;
    }

    public List<FingerprintFuzzyMatch> getFuzzyMatches() {
        return fuzzyMatches;
    }
}
