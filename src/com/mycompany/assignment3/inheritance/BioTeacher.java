package com.mycompany.assignment3.inheritance;

public class BioTeacher extends Teacher {

    private String name;

    public BioTeacher(String name, String subject, Double experience) {
        super(subject, experience.toString());
        this.name = name;
    }
    public void display()
    {
        System.out.println("Biology Teacher works in "+this.getSchoolName());//doubt: which one is correct this./super./simply getSchoolName
        System.out.println("Biology Teacher works in "+super.getSchoolName());
        System.out.println("Profession of Biology Teacher is "+this.getProfession());
        System.out.println("Profession of Biology Teacher is "+super.getProfession());
        System.out.println("Name of Biology Teacher is "+this.name);
        System.out.println("Experience of Biology Teacher is "+super.getExperience());
        System.out.println("Experience of Biology Teacher is "+super.getSubject());
        //System.out.println("Biology Teacher teaches "+this.subject);
        //System.out.println("Biology Teacher teaches "+super.subject);//how the output of this line is same as above,shouldn't it be null
    }
}
