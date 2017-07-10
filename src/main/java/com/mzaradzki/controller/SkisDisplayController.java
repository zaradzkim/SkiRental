package com.mzaradzki.controller;


import com.mzaradzki.dao.SkisDAO;
import com.mzaradzki.model.Skis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Marcel on 2017-05-24.
 */

@Controller
public class SkisDisplayController {



    @Autowired
    private SkisDAO skisDAO;

    @RequestMapping(value = "/skis", method = RequestMethod.GET)
    public String showSkis(Model model, Skis skis)
     {

        model.addAttribute("skisList", skisDAO.findAll());

        return "skis";



    }
}
