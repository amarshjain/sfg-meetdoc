package com.springframework.sfgmeetdoc.controllers;

import com.springframework.sfgmeetdoc.services.DocService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DocController {

    private final DocService docService;

    public DocController(DocService docService) {
        this.docService = docService;
    }

    @RequestMapping({"/docs", "/docs/index", "/docs/index.html"})
    public String listDocs(Model model){

        model.addAttribute("docs", docService.findAll());

        return "docs/index";
    }
}
