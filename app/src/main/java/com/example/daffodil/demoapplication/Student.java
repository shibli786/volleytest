package com.example.daffodil.demoapplication;

/**
 * Created by daffodil on 18/10/16.
 */
public class Student {

    private int id;

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getId() {
        return id;
    }

    public String getCollege() {
        return college;
    }

    private String name;
    private String city;
    private  String college;

    Student(int id,String name,String city,String college){
        this.id=id;
        this.name=name;
        this.city=city;
        this.college=college;


    }



}
