package com.iflytek.controller;

import com.iflytek.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/test")
    public String demo(){
        Person person = new Person();
        person.setId(1);
        person.setAge(18);
        person.setName("zhangsan");
        redisTemplate.opsForValue().set("person1",person);
        return "";
    }

    public void as(){
        System.out.println("hello");
    }
}
