package com.idus.assignment.controller;

import com.idus.assignment.domain.Member;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/w")
public class LoginController {

    @PostMapping("/login/verify")
    public ModelAndView postVerifyMember(@RequestBody Member member) {
        ModelAndView mav = new ModelAndView();


        mav.addObject("data", null);
        return mav;
    }
}
