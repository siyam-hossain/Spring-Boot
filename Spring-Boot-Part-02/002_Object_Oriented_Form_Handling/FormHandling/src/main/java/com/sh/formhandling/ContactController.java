package com.sh.formhandling;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
    @GetMapping("contact-us")
    public String contact(){
        return "contact";
    }

    @PostMapping("contact-us")
    public String submitForm(
            @RequestParam String name,
            @RequestParam(name="emailAddress") String email,
            @RequestParam(name="message", required = false) String message
    ){
        System.out.println("Form submit form method");
        System.out.println("name: "+name);
        System.out.println("email: "+email);
        System.out.println("message: "+message);


        return  "contact";
    }
}
