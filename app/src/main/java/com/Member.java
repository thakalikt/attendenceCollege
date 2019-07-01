package com;

public class Member {
    private String Name;
    private Integer Rollno;
    private String Faculty;
    private Integer Semester;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getRollno() {
        return Rollno;
    }

    public void setRollno(Integer rollno) {
        Rollno = rollno;
    }

    public String getFaculty() {
        return Faculty;
    }

    public void setFaculty(String faculty) {
        Faculty = faculty;
    }

    public Integer getSemester() {
        return Semester;
    }

    public void setSemester(Integer semester) {
        Semester = semester;
    }

    public Member() {
    }
}
