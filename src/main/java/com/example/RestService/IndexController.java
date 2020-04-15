package com.example.RestService;

//Turning the class into a controller with dependency 
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    public String Index() {
        return "Welcome to the Index page of our API," +
                " you can configure this return value to anything you want, " +
                "it can be a sort of Read me file containing all of the request of your API or " +
                "display Data sets :) its all up to you.";
    }
}
