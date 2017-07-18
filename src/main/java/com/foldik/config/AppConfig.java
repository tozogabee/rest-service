package com.foldik.config;

import com.foldik.model.Book;
import com.foldik.model.GotGirl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

@Configuration
public class AppConfig {

    @Bean
    public List<GotGirl> gotGirls() {
        List<GotGirl> gotGirls = new ArrayList<>();
        gotGirls.add(new GotGirl(1, "Sansa Stark", "90D", 21, asList(new Book("GoT 2", LocalDate.now()))));
        gotGirls.add(new GotGirl(2, "Amanda Stark", "80B", 18, asList(new Book("GoT 1", LocalDate.now()))));
        return gotGirls;
    }
}
