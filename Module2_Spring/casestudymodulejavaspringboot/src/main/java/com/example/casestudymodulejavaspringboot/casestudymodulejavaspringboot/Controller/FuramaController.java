package com.example.casestudymodulejavaspringboot.casestudymodulejavaspringboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FuramaController {
    @GetMapping("/home")
    public String main(){
        return "Home";
    }
}
