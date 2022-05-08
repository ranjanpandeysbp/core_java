package com.mycompany.assignment3.inheritance1;

public class Subject extends Teacher{
    private String subject;

    public Subject(String name,String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void display()
    {
        System.out.println("Teacher Name is "+this.getName());
        System.out.println("Subject taught is "+this.getSubject());
        System.out.println("School Name is "+this.getSCHOOL_NAME());
        System.out.println("Profession is "+this.getPROFESSION());
    }
}
