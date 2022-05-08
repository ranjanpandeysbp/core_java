package com.mycompany.assignment3.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        //PhyTeacher phyTeacher = new PhyTeacher("Binod Sir","Physics", 56.78);
        Teacher phyTeacher1 = new PhyTeacher("Binod Sir","Physics", 56.78);//java: cannot find symbol symbol:   method display()
        //PhysicsTeacher chemTeacher = new PhysicsTeacher("Chemistry");
        //PhysicsTeacher matTeacher = new PhysicsTeacher("Maths");
        phyTeacher1.display();
        BioTeacher bioTeacher = new BioTeacher("Vivek Sir","Biology",100.25);
        bioTeacher.display();
        /*Dynamic Polymorphism through method overriding
        School physics= new PhyTeacher("Adv. Physics");
        physics.display();
        School biology= new BioTeacher("Adv. Biology");
        physics.display();
        */
    }
}
