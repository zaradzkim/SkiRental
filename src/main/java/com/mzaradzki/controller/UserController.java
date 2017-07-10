package com.mzaradzki.controller;

import com.mzaradzki.config.SecurityConfig;
import com.mzaradzki.dao.UserDAO;
import com.mzaradzki.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Marcel on 2017-05-19.
 */

@Controller
public class UserController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/create-user", method = RequestMethod.GET)
    public String getUserForm() {

        return "register";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String getLoginPage() {

        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getRegisterPage() {

        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute User user) {

        try {
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(SecurityConfig.PASSWORD_STRENGTH);
            String encodedPassword = encoder.encode(user.getPassword());
            user.setPassword(encodedPassword);
            userDAO.save(user);
        } catch (Exception e) {
            return "redirect:/register";

        }

        return "redirect:/login";
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String getLogoutPage(){
        return "login";
    }



}

