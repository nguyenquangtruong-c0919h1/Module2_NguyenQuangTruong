package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SandwichController {
    @GetMapping("/sandwich")
    public String menuSandwich() {
        return "menusandwich";
    }

    @PostMapping("/sandwich")
    public String saveSandwich(@RequestParam("sandwich") String[] save, Model model) {
        if (save.length == 1) {

            return "found";
        }
        String[] temp = new String[save.length - 1];
        for (int i = 0; i < save.length; i++) {
            if (i == save.length - 1) {
                continue;
            }
            temp[i] = save[i];
        }
        model.addAttribute("save", Arrays.toString(temp));
        return "saveSandwich";

    }
}

