package com.foldik.endpointcaller;

import com.foldik.model.GotGirl;
import org.springframework.web.client.RestTemplate;

public class GotGirlsCaller {

    private RestTemplate restTemplate;

    public GotGirlsCaller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public GotGirl getFirstGotGirl() {
        return restTemplate.getForObject("http://localhost:7567/gotGirl/1", GotGirl.class);
    }
}
