package com.yakunin.instazoo.payload.response;

public class JWTTokenSuccessResponse {
    private String token;
    private boolean success;

    public JWTTokenSuccessResponse(String token, boolean success) {
        this.token = token;
        this.success = success;
    }

    public JWTTokenSuccessResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
