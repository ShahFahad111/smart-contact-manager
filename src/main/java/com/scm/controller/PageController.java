package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
public class PageController {
   
    
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Controller");
        model.addAttribute("name",  "Fahad");
        model.addAttribute("designation", "Senior Software Engineer");
        model.addAttribute("organization", "BNP Paribas");
        return "home";
    }

    // about route

    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("About Page Loading");
        return "about";
    }
    
    //services route

    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("Services Page Loading");
        return "services";
    }

    // conatct page
    @RequestMapping("/contact")
    public String contactPage() {
        System.out.println("Contact Page Loading");
        return "contact";
    }

    // login page
    @RequestMapping("/login")
    public String loginPage() {
        System.out.println("Login Page Loading");
        return "login";
    }

    // signup page
    @RequestMapping("/register")
    public String registerPage() {
        System.out.println("register Page Loading");
        return "register";
    }
}
