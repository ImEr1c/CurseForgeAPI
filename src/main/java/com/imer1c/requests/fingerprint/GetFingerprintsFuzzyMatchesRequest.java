package com.imer1c.requests.fingerprint;

import com.google.common.collect.Lists;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.requests.body.GetFuzzyMatchesRequestBody;
import com.imer1c.requests.body.IBody;
import com.imer1c.schemas.responses.GetFingerprintsFuzzyMatchesResponse;

import java.util.List;

public class GetFingerprintsFuzzyMatchesRequest extends AbstractResponseRequest<GetFingerprintsFuzzyMatchesResponse> {

    private static final String GET_FINGERPRINTS_FUZZY_MATCHES_LINK_TEMPLATE = "/v1/fingerprints/fuzzy";

    private final GetFuzzyMatchesRequestBody body;

    public GetFingerprintsFuzzyMatchesRequest(GetFuzzyMatchesRequestBody body) {
        this.body = body;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return GET_FINGERPRINTS_FUZZY_MATCHES_LINK_TEMPLATE;
    }

    @Override
    public boolean isGetRequest() {
        return false;
    }

    @Override
    protected Class<GetFingerprintsFuzzyMatchesResponse> getResponseClass() {
        return GetFingerprintsFuzzyMatchesResponse.class;
    }

    @Override
    protected IBody getPostRequestBody() {
        return body;
    }
}
