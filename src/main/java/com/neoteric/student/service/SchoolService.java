package com.neoteric.student.service;

public class SchoolService {
    private static int teachercount=20;
    // private static int schoolservice;
    public SchoolService(){
        System.out.println("From counting in School Teachers: "+teachercount);

    }
    public int getTeachercount(){

        return teachercount;

    }
    public int getadd(){

        return teachercount=teachercount+1;
    }
    public int getremove(){
        return teachercount=teachercount-1;
    }

}

