package com.hystrix.RestProducer.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author prashanth
 * @Date 22-08-2023
 */
public interface GreetingController {

    @GetMapping("/greeting/{username}")
    String greeting(@PathVariable("username") String username);

}
