package com.hystrix.RestProducer.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author prashanth
 * @Date 22-08-2023
 */
@RestController
public class GreetingControllerImpl implements GreetingController {

    @Override
    public String greeting(@PathVariable("username") String username) {
        return String.format("Hello %s!\n", username);
    }
}
