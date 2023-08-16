package com.imer1c.requests.body;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetModsByIdsListRequestBody implements IBody {
    private final List<Integer> modIds;

    private GetModsByIdsListRequestBody(List<Integer> modIds) {
        this.modIds = modIds;
    }

    public List<Integer> getModIds() {
        return modIds;
    }

    public static class Builder {
        private final List<Integer> modIds = new ArrayList<>();

        public Builder addModId(int modId) {
            this.modIds.add(modId);
            return this;
        }

        public Builder addModIds(Integer... modIds) {
            this.modIds.addAll(Arrays.asList(modIds));
            return this;
        }

        public GetModsByIdsListRequestBody build() {
            return new GetModsByIdsListRequestBody(this.modIds);
        }
    }
}
