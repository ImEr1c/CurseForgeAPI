package com.imer1c.schemas.responses;

import com.imer1c.schemas.fingerprint.FingerprintsMatchesResult;

public class GetFingerprintsMatchesResponse implements IResponse {
    private final FingerprintsMatchesResult data;

    public GetFingerprintsMatchesResponse(FingerprintsMatchesResult data) {
        this.data = data;
    }

    public FingerprintsMatchesResult getData() {
        return data;
    }
}
