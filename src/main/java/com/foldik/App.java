package com.foldik;

import com.foldik.endpointcaller.GotGirlsCaller;
import com.foldik.endpointcaller.TryOutCaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    @Autowired
    private GotGirlsCaller gotGirlsCaller;

    @Autowired
    private TryOutCaller tryOutCaller;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
//        LOGGER.info(gotGirlsCaller.getFirstGotGirl().toString());
//
//        FileUtils.writeStringToFile(new File("target/" + UUID.randomUUID().toString() + "-index.html"), tryOutCaller.tryOutSomething(), "UTF-8");
    }
}
