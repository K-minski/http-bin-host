package dev.dtk.host.api.hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class BasicHelloController {

    @GetMapping("")
    String index() {
        return "Hello World!";
    }
}
