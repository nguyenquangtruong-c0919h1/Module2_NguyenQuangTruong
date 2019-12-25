package customervalidation.customervalidation.controller;

import customervalidation.customervalidation.model.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PhoneController {
    @GetMapping("/index")
    public String showForm(Model model) {
        model.addAttribute("phone", new PhoneNumber());
        return "index";
    }
    @PostMapping("/phonenumber")
    public String resultPhone(@Validated @ModelAttribute("phone") PhoneNumber phoneNumber, BindingResult bindingResult, Model model) {
        new PhoneNumber().validate(phoneNumber, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "index";
        } else {
            model.addAttribute("phone", phoneNumber.getNumber());
            return "result";
        }

    }
}
