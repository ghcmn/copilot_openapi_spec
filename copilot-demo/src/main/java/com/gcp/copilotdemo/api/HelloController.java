package com.gcp.copilotdemo.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/api")
public class HelloController {
    @GetMapping(value="/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello World! " + name;
    }

}
