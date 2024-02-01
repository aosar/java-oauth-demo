package dev.osar.oauthdemo.controllers;

// import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AuthCodeController {
    @GetMapping
    public String index(Model model, Authentication user) {
        System.out.println("user: " + user);
        model.addAttribute("user", user);
        return "index";
    }
}
