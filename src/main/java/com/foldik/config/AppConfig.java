package com.foldik.config;

import com.foldik.endpointcaller.GotGirlsCaller;
import com.foldik.endpointcaller.TryOutCaller;
import com.foldik.model.Book;
import com.foldik.model.GotGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

@Configuration
public class AppConfig {

    @Autowired
    private Environment environment;

    @Bean
    public List<GotGirl> gotGirls() {
        List<GotGirl> gotGirls = new ArrayList<>();
        gotGirls.add(new GotGirl(1, "Sansa Stark", "90D", 21, asList(new Book("GoT 2"))));
        gotGirls.add(new GotGirl(2, "Amanda Stark", "80B", 18, asList(new Book("GoT 1"))));
        return gotGirls;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public GotGirlsCaller gotGirlsCaller() {
        return new GotGirlsCaller(restTemplate());
    }

    @Bean
    public TryOutCaller tryOutCaller() {
        return new TryOutCaller(environment.getRequiredProperty("rest.service.try.something.url"), restTemplate());
    }
}
