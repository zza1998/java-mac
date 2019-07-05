package com.zza.ccc;

import java.io.Serializable;
import java.util.List;


public class User  implements Serializable {
    private String name;
    private Integer age;
    private Integer sex;
    private List<String> likes;

    public User() {
    }

    public User(String name, Integer age, Integer sex, List<String> likes) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.likes = likes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public List<String> getLikes() {
        return likes;
    }

    public void setLikes(List<String> likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", likes=" + likes +
                '}';
    }
}
