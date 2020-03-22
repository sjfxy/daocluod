package com.example.daocloud;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by luoxue on 2020/3/22.
 */
@Controller
@ResponseBody
public class MyController {
    @Autowired
    Mysvc mysvc;
    @GetMapping("/")
    public String index(){
        return  "hello";
    }
    @GetMapping("/add")
    public String add(int a, int b){
        return mysvc.add(a,b) + "";
    }
    @GetMapping("/orderNnew")
    public String ce(int a , int b){
        return  mysvc.add(a,b) + "";
    }

}
