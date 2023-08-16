package com.imer1c.requests.fingerprint;

import com.google.common.collect.Lists;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.requests.body.GetFingerprintMatchesRequestBody;
import com.imer1c.requests.body.IBody;
import com.imer1c.schemas.responses.GetFingerprintsMatchesResponse;

import java.util.List;

public class GetFingerprintsMatchesRequest extends AbstractResponseRequest<GetFingerprintsMatchesResponse> {

    private static final String GET_FINGERPRINTS_MATCHES_LINK_TEMPLATE = "/v1/fingerprints";

    private final GetFingerprintMatchesRequestBody body;

    public GetFingerprintsMatchesRequest(GetFingerprintMatchesRequestBody body) {
        this.body = body;
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return Lists.newArrayList();
    }

    @Override
    protected String createLink() {
        return GET_FINGERPRINTS_MATCHES_LINK_TEMPLATE;
    }

    @Override
    public boolean isGetRequest() {
        return false;
    }

    @Override
    protected Class<GetFingerprintsMatchesResponse> getResponseClass() {
        return GetFingerprintsMatchesResponse.class;
    }

    @Override
    protected IBody getPostRequestBody() {
        return body;
    }
}
