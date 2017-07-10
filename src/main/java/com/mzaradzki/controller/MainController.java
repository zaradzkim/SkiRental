package com.mzaradzki.controller;


import com.mzaradzki.dao.SkisDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Marcel on 2017-05-19.
 */
@Controller
public class MainController {



    @Autowired
    private SkisDAO skisDAO;


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHomePage() {
        return "home";
    }

    @RequestMapping(value = "/add/skis", method = RequestMethod.GET)
    public String getAddSkisPage() {

        return "add-skis";
    }

//    @RequestMapping(value = "/skis", method = RequestMethod.GET)
//    public String getSkisCategory(Model model) {
//
//
//
//
//        model.addAttribute("skisList", skisDAO.findAll());
//
//        return "skis";
//    }





    @RequestMapping(value="/reserve-product", method = RequestMethod.GET)
    public String getReserveProductPage(){



        return "redirect:/shopping-cart";

    }
}


