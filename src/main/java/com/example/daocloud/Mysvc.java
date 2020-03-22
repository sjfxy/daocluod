package com.example.daocloud;
import org.springframework.stereotype.Service;

/**
 * Created by luoxue on 2020/3/22.
 */
@Service
public class Mysvc {
    public int add(int a , int b){
        return  a + b;
    }
    public int remove(int a, int b){
        return  a - b;
    }

}
