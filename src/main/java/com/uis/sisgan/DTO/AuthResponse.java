package com.uis.sisgan.DTO;




public class AuthResponse {

    private String accesToken;

    private String tokenType = "Bearer ";

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public AuthResponse(String accesToken, String role) {
        this.accesToken = accesToken;
        this.role = role;
    }

    public String getAccesToken() {
        return accesToken;
    }

    public void setAccesToken(String accesToken) {
        this.accesToken = accesToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
