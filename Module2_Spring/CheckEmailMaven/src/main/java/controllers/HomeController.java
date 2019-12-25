package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//@Controller
//public class HomeController {
//    private static Pattern pattern;
//    private Matcher matcher;
//    private static final String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//
//    public HomeController() {
//        pattern = Pattern.compile(regex);
//    }
//    @GetMapping("")
//    public String home(){
//        return "home";
//    }
//    @PostMapping("/home")
//    public String checkEmail(@RequestParam("/home") String email, ModelMap model){
//        boolean isvaid = this.Validate(email);
//        if(!isvaid){
//            model.addAttribute("message","Not Found");
//            return "home";
//        }
//
//            model.addAttribute("email",email);
//            return "success";
//
//    }
//
//    private boolean Validate(String regex) {
//        matcher=pattern.matcher(regex);
//        return matcher.matches();
//    }
//}
@Controller

public class HomeController {


    private static Pattern pattern;

    private Matcher matcher;


    // Khai báo Regex

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";


    public HomeController() {

        pattern = Pattern.compile(EMAIL_REGEX);

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)

    public String home(Locale locale, Model model) {

        return "home";

    }


    @RequestMapping(value = "/validate", method = RequestMethod.POST)

    public String user(@RequestParam("email") String email, ModelMap model) {

        boolean isvalid = this.validate(email);

        if (!isvalid) {

            model.addAttribute("message", "Email is invalid");

            return "home";

        }


        model.addAttribute("email", email);

        return "success";

    }

    private boolean validate(String regex) {

        matcher = pattern.matcher(regex);

        return matcher.matches();

    }

}


