package com.imer1c.requests.body;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetFeaturedModsRequestBody implements IBody {

    private static final GetFeaturedModsRequestBody NULL = new GetFeaturedModsRequestBody(0, Lists.newArrayList(), 0);

    private final int gameId;
    private final List<Integer> excludedModIds;
    private final int gameVersionTypeId;

    private GetFeaturedModsRequestBody(int gameId, List<Integer> excludedModIds, int gameVersionTypeId) {
        this.gameId = gameId;
        this.excludedModIds = excludedModIds;
        this.gameVersionTypeId = gameVersionTypeId;
    }

    public int getGameId() {
        return gameId;
    }

    public List<Integer> getExcludedModIds() {
        return excludedModIds;
    }

    public int getGameVersionTypeId() {
        return gameVersionTypeId;
    }

    public static class Builder {
        private final List<Integer> excludedMods = new ArrayList<>();
        private final int gameId;
        private int gameVersionTypeId;

        public Builder(int gameId) {
            this.gameId = gameId;
        }

        public Builder excludeModId(int modId) {
            this.excludedMods.add(modId);
            return this;
        }

        public Builder excludeModIds(Integer... modIds) {
            this.excludedMods.addAll(Arrays.asList(modIds));
            return this;
        }

        public Builder gameVersionTypeId(int gameVersionTypeId) {
            this.gameVersionTypeId = gameVersionTypeId;
            return this;
        }

        public GetFeaturedModsRequestBody build() {
            return new GetFeaturedModsRequestBody(this.gameId, this.excludedMods, this.gameVersionTypeId);
        }
    }
}
