package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.beans.FeatureDescriptor;

@Controller
public class caculatorController {
    @GetMapping("/home")
    public String homeCaculater() {
        return "homeCaculater";
    }

    @PostMapping("/home")
    public String resultCaculater(@RequestParam("number1") Float num1, @RequestParam("number2") Float num2,
                                  @RequestParam("operator") String operator, Model model) {
        Float result = null;
        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/": {
                if (num2 == 0) {
                    return "NotFound";
                }
                result = num1 / num2;
                break;
            }
        }
        model.addAttribute("result", result);
        return "resultCaculater";
    }
}
