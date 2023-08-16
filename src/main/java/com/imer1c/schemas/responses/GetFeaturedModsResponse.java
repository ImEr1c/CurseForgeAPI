package com.imer1c.schemas.responses;

import com.imer1c.schemas.files.mod.Mod;

import java.util.List;

public class GetFeaturedModsResponse implements IResponse {
    private final List<Mod> featured;
    private final List<Mod> popular;
    private final List<Mod> recentlyUpdated;

    public GetFeaturedModsResponse(List<Mod> featured, List<Mod> popular, List<Mod> recentlyUpdated) {
        this.featured = featured;
        this.popular = popular;
        this.recentlyUpdated = recentlyUpdated;
    }

    public List<Mod> getFeatured() {
        return featured;
    }

    public List<Mod> getPopular() {
        return popular;
    }

    public List<Mod> getRecentlyUpdated() {
        return recentlyUpdated;
    }
}
