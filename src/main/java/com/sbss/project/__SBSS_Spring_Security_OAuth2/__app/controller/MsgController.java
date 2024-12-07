package com.sbss.project.__SBSS_Spring_Security_OAuth2.__app.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class MsgController {

    @GetMapping("/")
    public String sayHi(){
        return "Hi , How are you";
    }

    @GetMapping("/user")
    public Map<String, Object> getUserDetails(OAuth2AuthenticationToken authenticationToken) {
        // Extract user attributes from authentication token
        return authenticationToken.getPrincipal().getAttributes();
    }
}
