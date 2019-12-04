package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.directoryServices;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;

@Controller
public class DictionaryController {
    @GetMapping("/directory")
    public String home() {
        return "home";
    }

    @PostMapping("/directory")
    public String directory(@RequestParam String english, Model model) {
        Map<String, String> dic = directoryServices.getValueAll();

        String result = dic.get(english);
        if (result != null) {
            model.addAttribute("english", english);
            model.addAttribute("result", result);
        } else {
            return "Not Found";
        }
        return "directory";
    }
}
