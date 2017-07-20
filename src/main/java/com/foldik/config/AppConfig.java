package com.foldik.config;

import com.foldik.endpointcaller.GotGirlsCaller;
import com.foldik.endpointcaller.TryOutCaller;
import com.foldik.model.Book;
import com.foldik.model.GotGirl;
import com.foldik.model.task.Car;
import com.foldik.model.task.Money;
import com.foldik.model.task.Owner;
import com.foldik.model.task.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.client.RestTemplate;

import javax.jws.Oneway;
import java.awt.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
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
    public List<Owner> gotOwners()
    {
        List<Owner> ownerList=new ArrayList<>();
        ownerList.add(new Owner("Toth Gabor",30,new Money(new BigDecimal("25000000"),0,"HUF"),new Money(new BigDecimal("0"),0,"HUF"), Arrays.asList(new Phone(0036,20,1234567)),Arrays.asList(new Car("Mercedes","S55 AMG",2017,4356,new Color(0,0,0),new Color(0,0,0)))));
        ownerList.add(new Owner("Donald Trump",72,new Money(new BigDecimal("5000000000"),0,"USD"),new Money(new BigDecimal("650000000"),0,"USD"), Arrays.asList(new Phone(0036,20,1234567)),Arrays.asList(new Car("Rolls Royce","S55 AMG",2017,4356,new Color(0,0,0),new Color(0,0,0)))));

        return ownerList;
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
