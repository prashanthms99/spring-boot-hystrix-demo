package com.hystrix.RestConsumer.Controller;

import com.hystrix.RestConsumer.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author prashanth
 * @Date 22-08-2023
 */
@Controller
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/get-greeting/{username}")
    public String getGreeting(Model model, @PathVariable("username") String username) {
        model.addAttribute("greeting", greetingService.getGreeting(username));
        return "greeting-view";
    }
}
