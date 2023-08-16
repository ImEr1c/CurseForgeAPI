package com.imer1c.schemas.fingerprint;

import java.util.List;

public class FingerprintsMatchesResult {
    private final boolean isCacheBuilt;
    private final List<FingerprintMatch> exactMatches;
    private final List<Integer> exactFingerprints;
    private final List<FingerprintMatch> partialMatches;
    private final Object partialMatchFingerprints;
    private final List<Integer> additionalProperties;
    private final List<Integer> installedFingerprints;
    private final List<Integer> unmatchedFingerprints;

    public FingerprintsMatchesResult(boolean isCacheBuilt, List<FingerprintMatch> exactMatches, List<Integer> exactFingerprints, List<FingerprintMatch> partialMatches, Object partialMatchFingerprints, List<Integer> additionalProperties, List<Integer> installedFingerprints, List<Integer> unmatchedFingerprints) {
        this.isCacheBuilt = isCacheBuilt;
        this.exactMatches = exactMatches;
        this.exactFingerprints = exactFingerprints;
        this.partialMatches = partialMatches;
        this.partialMatchFingerprints = partialMatchFingerprints;
        this.additionalProperties = additionalProperties;
        this.installedFingerprints = installedFingerprints;
        this.unmatchedFingerprints = unmatchedFingerprints;
    }

    public boolean isCacheBuilt() {
        return isCacheBuilt;
    }

    public List<FingerprintMatch> getExactMatches() {
        return exactMatches;
    }

    public List<Integer> getExactFingerprints() {
        return exactFingerprints;
    }

    public List<FingerprintMatch> getPartialMatches() {
        return partialMatches;
    }

    public Object getPartialMatchFingerprints() {
        return partialMatchFingerprints;
    }

    public List<Integer> getAdditionalProperties() {
        return additionalProperties;
    }

    public List<Integer> getInstalledFingerprints() {
        return installedFingerprints;
    }

    public List<Integer> getUnmatchedFingerprints() {
        return unmatchedFingerprints;
    }
}
