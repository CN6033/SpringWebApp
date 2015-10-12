package com.examples.security;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created by huangshitao on 15/10/12.
 */
public class AuthToken implements AuthenticationToken {

    private String token;

    public AuthToken(String token) {
        this.token = token;
    }

    public Object getPrincipal() {
        return token;
    }

    public Object getCredentials() {
        return token;
    }
}
