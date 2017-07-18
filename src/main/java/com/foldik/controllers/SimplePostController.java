package com.foldik.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimplePostController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimplePostController.class);

    @PostMapping("/simplePost")
    public String postMessage(@RequestBody String message) {
        LOGGER.info(message);
        return "OK";
    }
}
