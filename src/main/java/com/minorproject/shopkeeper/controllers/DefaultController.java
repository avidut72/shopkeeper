/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minorproject.shopkeeper.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Avidut
 */
@Controller
public class DefaultController {
    @GetMapping({"/home","/"})
    public String getHomePage(){
        return "home";
    }
    @GetMapping("/about")
    public String getAboutPage() {
        return "about";
    }
    @GetMapping("/stock")
    public String getStockPage() {
        return "stock";
    }
    @GetMapping("/purchase")
    public String getPurchasePage() {
        return "purchase";
    }
    @GetMapping("/sale")
    public String getSalePage() {
        return "sale";
    }
    @GetMapping("/returned")
    public String getReturnedPage() {
        return "returned";
    }
    @GetMapping("/damaged")
    public String getDamagedPage() {
        return "damaged";
    }
    
}
