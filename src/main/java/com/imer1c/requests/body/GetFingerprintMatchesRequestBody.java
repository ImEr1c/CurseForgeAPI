package com.imer1c.requests.body;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetFingerprintMatchesRequestBody implements IBody {
    private final List<Integer> fingerprints;

    private GetFingerprintMatchesRequestBody(List<Integer> fingerprints) {
        this.fingerprints = fingerprints;
    }

    public List<Integer> getFingerprints() {
        return fingerprints;
    }

    public static class Builder {
        private final List<Integer> fingerprints = new ArrayList<>();

        public Builder addFingerprint(int fingerprint) {
            this.fingerprints.add(fingerprint);
            return this;
        }

        public Builder addFingerprints(Integer... fingerprints) {
            this.fingerprints.addAll(Arrays.asList(fingerprints));
            return this;
        }

        public GetFingerprintMatchesRequestBody build() {
            return new GetFingerprintMatchesRequestBody(this.fingerprints);
        }
    }
}
