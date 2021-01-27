package com.sufeng.practise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Person> map = new HashMap<>();

        map.put("zs", new Person("zs", 18));
        map.put("ls", new Person("ls", 28));

        Person p = map.get("zs");
        Person p2 = map.get("as");

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("zs", 18));
        personList.add(new Person("ls", 28));
        personList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

    }
}


class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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
}