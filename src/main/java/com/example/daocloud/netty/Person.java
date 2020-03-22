package com.example.daocloud.netty;

import org.springframework.context.annotation.Bean;

/**
 * Created by luoxue on 2020/3/22.
 */
public class Person {
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", hobbigy=" + hobbigy +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return hobbigy == person.hobbigy;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + hobbigy;
        return result;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setHobbigy(int hobbigy) {
        this.hobbigy = hobbigy;
    }

    public int getAge() {

        return age;
    }

    public Person(int age, int hobbigy) {
        this.age = age;
        this.hobbigy = hobbigy;
    }

    public int getHobbigy() {
        return hobbigy;

    }

    public Person(int age) {

        this.age = age;
    }

    private int age;
    private int hobbigy;
    public int add(){
        return  1;
    }
}
