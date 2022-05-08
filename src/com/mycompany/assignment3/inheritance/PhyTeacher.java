package com.mycompany.assignment3.inheritance;

public class PhyTeacher extends Teacher {
    private String name;

    public PhyTeacher(String name, String subject, Double experience)
    {
        super(subject, experience.toString());
        this.name = name;
        //super.subject = "Different super subject";//There is no variable overriding
        //this.subject = subject;
    }

    public void display()
    {
        System.out.println("Physics Teacher works in "+this.getSchoolName());//doubt: which one is correct this./super./simply getSchoolName: Cleared
        System.out.println("Physics Teacher works in "+super.getSchoolName());
        System.out.println("Profession of Physics Teacher is "+this.getProfession());
        System.out.println("Profession of Physics Teacher is "+super.getProfession());
        System.out.println("Name of Physics Teacher is "+this.name);
        //System.out.println("Experience of Physics Teacher is "+this.experience);
        //System.out.println("Physics Teacher teaches "+this.subject);
        //System.out.println("Physics Teacher teaches "+super.subject);//how the output of this line is same as above,shouldn't it be null: Cleared
        System.out.println("Physics Teacher experience "+super.getExperience());
        System.out.println("Physics Teacher teaches "+super.getSubject());
    }
}
