package com.example.SpringMVCDemo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "java";
    }
    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1,@RequestParam("num2") int num2 , ModelAndView mv){
        int result = num1 + num2;
        System.out.println(result);
        mv.addObject("result",result);
        mv.setViewName("result");
        return  mv;
    }


    @RequestMapping("addAlien")
    public String add(Alien alien){
        return  "result";
    }
}
