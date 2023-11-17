package com.application.springboot;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.apache.commons.io.IOUtils;


@RestController
public class MyController {

    @GetMapping("/welcome")
    public String home() throws IOException {
        ClassPathResource htmlFile = new ClassPathResource("home.html");
        String htmlContent = IOUtils.toString(htmlFile.getInputStream(), StandardCharsets.UTF_8);
        return htmlContent;
    }
}
