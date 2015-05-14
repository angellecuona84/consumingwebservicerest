package com.controller;

import com.domain.RestServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Angel Luis on 13/05/2015.
 */
@Controller
public class Controlador {


    @RequestMapping("/index")
    public ModelAndView index() {

        RestTemplate restTemplate = new RestTemplate();
        RestServiceBean restServiceBean = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", RestServiceBean.class);
        System.out.println("Id:    " + restServiceBean.getId());
        System.out.println("Name:    " + restServiceBean.getName());
        System.out.println("About:   " + restServiceBean.getAbout());
        System.out.println("Phone:   " + restServiceBean.getPhone());
        System.out.println("Website: " + restServiceBean.getWebsite());
        return new ModelAndView("index");
    }
}
