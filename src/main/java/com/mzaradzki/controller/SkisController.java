package com.mzaradzki.controller;


import com.mzaradzki.dao.SkisDAO;
import com.mzaradzki.model.Skis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Marcel on 2017-05-19.
 */
@Controller
public class SkisController {

    @Autowired
    private SkisDAO skisDAO;

    @RequestMapping(value = "/ski/save", method = RequestMethod.POST)
    public String postCreateSki(@ModelAttribute Skis skis){

        skisDAO.save(skis);

        return "redirect:/skis";

    }

    @RequestMapping(value = "/ski-create", method = RequestMethod.GET)
    public String getCreateSkisForm(Model model) {

        model.addAttribute("skis", new Skis());

        return "add-skis";
    }


    @RequestMapping(value = "/ski/show-details/{skisId}" , method = RequestMethod.GET)
    public String getShowDetailsPage(@PathVariable("skisId") Integer skisId, Model model) {

        Skis skis = skisDAO.findOne(skisId);


        model.addAttribute("skis", skis);

        return "ski-details";
    }




}
