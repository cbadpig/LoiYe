package com.loiye.core.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/ly/ajax")
public class LyController {


    @GetMapping("/basePath/")
    public String getBasePath(HttpServletRequest req) {
        System.out.println("contextpath:" + req.getContextPath());
        System.out.println("ServletContext.contextpath:" + req.getServletContext().getContextPath());
        return req.getContextPath();
    }
}
