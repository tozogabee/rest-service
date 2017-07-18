# Rest services example app

## Basic rest endpoint

Note: use AltGr+7 to format java code in markdown language.

1. Create a basic Spring Boot application.

```java
package com.foldik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
```

2. Create a simple endpoint which returns "Hello"

```java
package com.foldik.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicRestController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello";
    }
}
```

3/a. Create some configs in the ```src/main/resources/application.properties```:

```
server.port=8999
```

3/b. Or add some configs via JVM properties:

![Run configuration](readme-resources/jvm_config.png)
