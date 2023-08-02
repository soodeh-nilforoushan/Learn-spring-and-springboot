package com.soodeh.MyFirstWebApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private AuthenticationService authenticationService;
    //we are doing construction injection, withoun injection we have to initialize authenticationService
    //for injection we also have to add @Service in the authenticationservice class
    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)

    public String gotoLoginPage(){
        return "login";
    }
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String gotowelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model){

        if (authenticationService.authenticate(name,password)){

            model.put("namee", name);
            model.put("passwordd", password);
            return "welcome";
        }

        //by submitting the form, post method will call so this method will call and redirct it to welcome page.
//        when we run post method, it return welcome.jsp class
        model.put("errorMessage", "invalid information try again");
        return "login";
    }

}
