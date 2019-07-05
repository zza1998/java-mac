package com.zza.ccc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class bbb {
    public static void main(String[] args) throws JsonProcessingException {
        User user=new User();
        user.setAge(22);
        user.setName("小明");
        user.setSex(1);
        List<String> likes=new ArrayList<>();
        likes.add("打球");
        likes.add("洗澡");
        user.setLikes(likes);
        ObjectMapper mapper=new ObjectMapper();
        String res= mapper.writeValueAsString(user);
        System.out.println(res);
    }
}
