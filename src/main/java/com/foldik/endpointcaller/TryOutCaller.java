package com.foldik.endpointcaller;

import org.springframework.web.client.RestTemplate;

public class TryOutCaller {

    private String url;
    private RestTemplate restTemplate;

    public TryOutCaller(String url, RestTemplate restTemplate) {
        this.url = url;
        this.restTemplate = restTemplate;
    }

    public String tryOutSomething() {
        return restTemplate.getForObject(url, String.class);
    }
}
