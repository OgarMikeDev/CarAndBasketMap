package org.example.json.student.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping("/page")
    public String htmlCode() {
        return "index";
    }
}
