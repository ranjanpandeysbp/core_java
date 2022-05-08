package com.mycompany.stringdemo;

public class StringBuilderMain {
    public static void main(String[] args) {
        //Whenever you want to do lot of sting manipulation use StringBuilder instead of String for better memory and performance
        StringBuilder sb = new StringBuilder("Amit");
        String s1 = sb.toString();
        /*
        if(sb.toString() == s1){
            System.out.println("sb and s1 are equal");
        }
        else{
            System.out.println("sb and s1 are not equal");
        }
        if(s1 == sb.toString()){
            System.out.println("s1 and sb are equal");
        }
        else{
            System.out.println("s1 and sb are not equal");
        }
        if(s1.equals(sb)){
            System.out.println("s1 and sb are equal using equals method");
        }
        else{
            System.out.println("s1 and sb are not equal using equals method");
        }
        if(sb.equals(sb)){
            System.out.println("sb and s1 are equal using equals method");
        }
        else{
            System.out.println("sb and s1 are not equal using equals method");
        }
         */
        System.out.println(sb);
        System.out.println(s1);
        sb.append(" ");
        sb.append("Sharma");
        System.out.println(sb);
        sb.insert(4, " Kumar");
        System.out.println(sb);
        //System.out.println(sb.reverse());
        //System.out.println(sb.delete(5,10));
        System.out.println(sb.replace(5,10,"Ku"));
    }
}
