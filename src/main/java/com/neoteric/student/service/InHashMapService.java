package com.neoteric.student.service;


import java.util.HashMap;
import java.util.Map;


public class InHashMapService {

    public HashMap<Integer, String> getMapStudents(){
        StudentMap s1 = new StudentMap("chandu",505);
        StudentMap s2 = new StudentMap("appu",506);
        HashMap<Integer,String>map= new HashMap<Integer,String>();
        addStudentToMap(map, s1);
        addStudentToMap(map, s2);

        return map;
    }
    public  void addStudentToMap(HashMap<Integer, String> map, StudentMap student) {
        map.put(student.getRoolNo(), student.getName());
    }

    public String getStudentNameByRollNo(int rollNo) {
        HashMap<Integer, String> studentMap = getMapStudents();
        return studentMap.get(rollNo);
    }

}




