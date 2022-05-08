package com.mycompany.assignment3.inheritance;

public class Teacher {
    protected final String SCHOOL_NAME = "St. Joseph's Higher Secondary School";//should be available to sub class
    protected final String PROFESSION = "Teaching";
    private String subject;//Not best practice
    private String experience;

    public Teacher(String subject, String experience) {
        this.subject = subject;
        this.experience = experience;
    }

    public String getSchoolName() {
        return SCHOOL_NAME;
    }

    public String getProfession() {
        return PROFESSION;
    }//Not required

    public String getSubject() {
        return subject;
    }

    public String getExperience() {
        return experience;
    }

    public void display()
    {
        System.out.println("Dummy method not required");
    }
}
