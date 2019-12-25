package validationinputform.vailidationinputform.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import validationinputform.vailidationinputform.Model.User;
@Controller
public class UserController {
    @GetMapping("/user")
    public ModelAndView formUser(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }
    @PostMapping("/validationUser")
    public ModelAndView resultUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("index");
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("result");
        return modelAndView;
    }
}
