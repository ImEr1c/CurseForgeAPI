package com.imer1c.schemas.responses;

import com.imer1c.schemas.fingerprint.FingerprintFuzzyMatchResult;

public class GetFingerprintsFuzzyMatchesResponse implements IResponse {
    private final FingerprintFuzzyMatchResult data;

    public GetFingerprintsFuzzyMatchesResponse(FingerprintFuzzyMatchResult data) {
        this.data = data;
    }

    public FingerprintFuzzyMatchResult getData() {
        return data;
    }
}
