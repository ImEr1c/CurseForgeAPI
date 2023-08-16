package com.imer1c.schemas.files.mod;

public class ModLinks {
    private final String websiteUrl;
    private final String wikiUrl;
    private final String issuesUrl;
    private final String sourceUrl;

    public ModLinks(String websiteUrl, String wikiUrl, String issuesUrl, String sourceUrl) {
        this.websiteUrl = websiteUrl;
        this.wikiUrl = wikiUrl;
        this.issuesUrl = issuesUrl;
        this.sourceUrl = sourceUrl;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public String getWikiUrl() {
        return wikiUrl;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }
}
