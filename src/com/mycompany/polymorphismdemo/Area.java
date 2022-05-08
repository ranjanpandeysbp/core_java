package com.mycompany.polymorphismdemo;

/* System.out.println("Inside function radius is "+radius);
        System.out.println("Inside function calculated value is "+(3.14 * radius * radius));
* Overloaded when
* 1. no of param list differs
* 2. data type of param list differs
* 3. sequence of param list differs
 */
public class Area {
    //number of parameters vary then its an overloaded function
    //data type of parameters vary then its an overloaded function
    public double calculateArea(double radius){

        return (3.14 * radius * radius);
    }
    //number of parameters vary then its an overloaded function
    public double calculateArea(double length,double width){
        return (length * width);
    }
    //number of parameters vary then its an overloaded function
    public double calculateArea(double length,double width, String name){
        System.out.println(name);
        return (length * width);
    }
    //number of parameters vary then its an overloaded function
    // sequence of parameters vary then its an overloaded function
    public double calculateArea(String name, double length, double width){
        System.out.println(name);
        return (length * width);
    }

    //Overloaded functions can have same name and differ in the num. of parameter, sequence of parameter, datatype of the parameter
    //but if two functions of same name and same parameter format and only differ in return type, they are NOT considered as overloaded function

    //data type of parameters vary then its an overloaded function
    public int calculateArea(int length){
        return (int) (length * length);
    }
    //return type of function vary then its not an overloaded function
    /*public long calculateArea(int length){
        return (long) (length * length);
    }*/
    public double calculateAreaofSquare(long length){
        return (length * length);
    }
    public double calculateAreaofRectangle(double length,double width){
        return (length * width);
    }
}
