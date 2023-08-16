package com.imer1c.requests.body;

import com.imer1c.schemas.fingerprint.FolderFingerprint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetFuzzyMatchesRequestBody implements IBody {
    private final int gameId;
    private final List<FolderFingerprint> fingerprints;

    private GetFuzzyMatchesRequestBody(int gameId, List<FolderFingerprint> fingerprints) {
        this.gameId = gameId;
        this.fingerprints = fingerprints;
    }

    public int getGameId() {
        return gameId;
    }

    public List<FolderFingerprint> getFingerprints() {
        return fingerprints;
    }

    public static class Builder {
        private final List<FolderFingerprint> fingerprints = new ArrayList<>();
        private final int gameId;

        public Builder(int gameId) {
            this.gameId = gameId;
        }

        public Builder addFingerprint(FolderFingerprint folderFingerprint) {
            this.fingerprints.add(folderFingerprint);
            return this;
        }

        public Builder addFingerprints(FolderFingerprint... folderFingerprints) {
            this.fingerprints.addAll(Arrays.asList(folderFingerprints));
            return this;
        }

        public GetFuzzyMatchesRequestBody build() {
            return new GetFuzzyMatchesRequestBody(this.gameId, this.fingerprints);
        }
    }
}
