package com.ryo.app.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author houbinbin
 * @since 16/12/4
 */
@Controller
@RequestMapping("/")
public class IndexController {

    private static final String INDEX_PATH = "index";

    @RequestMapping
    public String index() {
        return INDEX_PATH;
    }

}
