package com.comfenalco.cliente_autorizacion.controllers;

import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @GetMapping(value = "/products")
    public String products(
            @RegisteredOAuth2AuthorizedClient("products-client-authorization-code") OAuth2AuthorizedClient authorizedClient
    ) {
        return "";
    }

    @GetMapping(value = "/")
    public String index() {
        return "Entre";
    }
}