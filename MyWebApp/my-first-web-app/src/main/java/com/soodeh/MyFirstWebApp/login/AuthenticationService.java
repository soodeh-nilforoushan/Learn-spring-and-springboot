package com.soodeh.MyFirstWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        System.out.println("aaa");
        boolean isValidUserName= username.equalsIgnoreCase("in28min");
        boolean isValidpass= password.equalsIgnoreCase("dummy");

        return  isValidpass && isValidUserName;
    }
}
