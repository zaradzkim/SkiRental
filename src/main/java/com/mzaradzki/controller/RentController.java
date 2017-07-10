package com.mzaradzki.controller;

import com.mzaradzki.dao.SkisDAO;
import com.mzaradzki.dao.UserDAO;
import com.mzaradzki.model.Skis;
import com.mzaradzki.model.User;
import com.mzaradzki.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

/**
 * Created by Marcel on 2017-06-08.
 */
@Controller
public class RentController {

    @Autowired
    private SkisDAO skisDAO;

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RentService rentService;

    @RequestMapping(value = "/rent/ski/{skiId}")
    public String createRent(@PathVariable Integer skiId, Principal principal) {
        String email = principal.getName();

        Skis skis = skisDAO.findOne(skiId);
        User user = userDAO.findByEmail(email);

        rentService.createRent(user, skis);

        return "rent-message";
    }
}
