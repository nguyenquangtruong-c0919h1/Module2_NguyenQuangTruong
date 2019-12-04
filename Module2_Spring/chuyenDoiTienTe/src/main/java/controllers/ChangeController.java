package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ChangeController {
    @GetMapping("")
    public String home(){
        return "Home";
    }
    @PostMapping("/Change")
    public String change(@RequestParam float rate,@RequestParam float usd, Model model ){
        float result ;
        result = usd*rate ;
        model.addAttribute("rate",rate);
        model.addAttribute("usd",usd);
        model.addAttribute("result",result);
          return "ketqua";
    }
}
