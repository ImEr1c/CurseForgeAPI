package com.imer1c.requests;

import com.imer1c.CurseforgeAPIProvider;
import com.imer1c.properties.IProperty;
import com.imer1c.schemas.responses.IResponse;

public abstract class AbstractResponseRequest<R extends IResponse> extends AbstractRequest {
    public AbstractResponseRequest(IProperty<?>... properties) {
        super(properties);
    }

    protected abstract Class<R> getResponseClass();

    public R getResponse(String apiKey) {
        return CurseforgeAPIProvider.GSON.fromJson(this.execute(apiKey), this.getResponseClass());
    }
}
