package com.ryo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author houbinbin
 * @since 16/10/28
 */
@Controller
@RequestMapping("/error")
public class ErrorController {

  private static final String BASE_PATH = "error";

  @RequestMapping("/400")
  public String Page400() {
    return BASE_PATH+"/400";
  }

  @RequestMapping("/403")
  public String Page403() {
    return BASE_PATH+"/403";
  }

  @RequestMapping("/404")
  public String Page404() {
    return BASE_PATH+"/404";
  }

  @RequestMapping("/500")
  public String Page500() {
    return BASE_PATH+"/500";
  }

}
