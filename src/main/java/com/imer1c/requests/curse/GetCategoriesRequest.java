package com.imer1c.requests.curse;

import com.imer1c.properties.IProperty;
import com.imer1c.properties.IPropertyFactory;
import com.imer1c.requests.AbstractResponseRequest;
import com.imer1c.schemas.responses.GetCategoriesResponse;

import java.util.List;

import static com.imer1c.properties.Properties.*;

public class GetCategoriesRequest extends AbstractResponseRequest<GetCategoriesResponse> {
    private static final String GET_CATEGORIES_LINK_TEMPLATE = "/v1/categories";

    public GetCategoriesRequest(IProperty<?>... properties) {
        super(properties);
    }

    @Override
    protected List<IPropertyFactory<?>> acceptedProperties() {
        return List.of(GAME_ID, CLASS_ID, CLASSES_ONLY);
    }

    @Override
    protected String createLink() {
        return GET_CATEGORIES_LINK_TEMPLATE;
    }

    @Override
    public boolean isGetRequest() {
        return true;
    }

    @Override
    protected Class<GetCategoriesResponse> getResponseClass() {
        return GetCategoriesResponse.class;
    }
}
