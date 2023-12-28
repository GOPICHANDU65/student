package com.neoteric.student.service;

public class StudentMap {
    String name;
    int roolNo;

    public StudentMap(String name, int roolNo) {
        this.name = name;
        this.roolNo = roolNo;
    }

    public String getName() {
        return name;
    }

    public int getRoolNo() {
        return roolNo;
    }
}
