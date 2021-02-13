package com.springframework.sfgmeetdoc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DocController {

    @RequestMapping({"/docs", "/docs/index", "/docs/index.html"})
    public String listDocs(){
        return "docs/index";
    }
}
