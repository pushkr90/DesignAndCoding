package com.sample.GetterSetter;

public class Student
{
    private int rollNo;
    private String name;
    private int ClassRoom;

    public Student(int rollNo,String name,int ClassRoom) {
        this.rollNo = rollNo;
        this.name = name;
        this.ClassRoom = ClassRoom;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getClassRoom() {
        return ClassRoom;
    }
}
