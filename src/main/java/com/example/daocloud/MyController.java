package com.example.daocloud;

import com.example.daocloud.netty.Person;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

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
    @GetMapping("/order")
    public Map<String,Person> P(){
        Person p = new Person(2,3);
        Map<String,Person> m =new HashMap<String,Person>();
        m.put("sin",p);
         return  m;


    }
//    @GetMapping("/orderNnew")
//    public String ce(int a , int b){
//        return  mysvc.add(a,b) + "";
//    }

}
