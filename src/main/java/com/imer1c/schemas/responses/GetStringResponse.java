package com.imer1c.schemas.responses;

public class GetStringResponse implements IResponse {
    private final String data;

    public GetStringResponse(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
