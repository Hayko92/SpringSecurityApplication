package org.example.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getInfoForAllEmpls() {
        return "viewForAllEmps";
    }

    @GetMapping("/hr_info")
    public String getInfoForHR() {
        return "viewForHR";
    }

    @GetMapping("/mgr_info")
    public String getInfoForManagers() {
        return "viewFormanager";
    }
}
