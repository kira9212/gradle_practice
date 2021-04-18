package com.sb.board.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {


    @GetMapping("/Index.do")
    public String Index(Model model) {


        model.addAttribute("username", "수한");
        return "Index";
    }


}
