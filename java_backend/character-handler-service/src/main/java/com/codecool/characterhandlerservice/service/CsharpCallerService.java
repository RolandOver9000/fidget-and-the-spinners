package com.codecool.characterhandlerservice.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CsharpCallerService {

    private final RestTemplate restTemplate;

    public CsharpCallerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Value("${csharp.service.url}")
    private String csharpServerUrl;


    public ResponseEntity connectionTest(){
        return restTemplate.getForEntity(csharpServerUrl+"/", ResponseEntity.class).getBody();
    }
}
