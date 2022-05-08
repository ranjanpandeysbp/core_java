/*4.Write programs to Show examples of overloading and overriding in Java?*/
package com.mycompany.day17handson.q4;

public class AnimalMain {
    public static void main(String[] args)
    {
        Animal a1 = new Animal();
        a1.speak();
        a1.speak("Roar");
        Bird b = new Bird();
        b.speak();
        Dog d = new Dog();
        d.speak();
    }
}
