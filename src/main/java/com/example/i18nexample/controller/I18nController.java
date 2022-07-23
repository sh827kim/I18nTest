package com.example.i18nexample.controller;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class I18nController {

    private final MessageSource messageSource;

    public I18nController(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @GetMapping("/")
    public String home() {


        return "index";
    }
}
