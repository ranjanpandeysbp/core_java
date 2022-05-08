package com.mycompany.collectiondemo.listdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemoTwo {
    public static void main(String[] args)
    {
        List<String> fruitsList = new ArrayList<String>();
        //List<String> fruitsList = new ArrayList<>();  //same as above
        fruitsList.add("Mango");    //allows a string to the list
        fruitsList.add("Apple");
        fruitsList.add("Papaya");
        fruitsList.add(null);   //allows to add null value

        System.out.println(fruitsList.get(1));  //Gets the list item t the index 1
        fruitsList.add(1, "Grapes");    //Adds new element grapes at the index 1
        System.out.println(fruitsList.get(2));
        System.out.println(fruitsList.size());
        fruitsList.remove("Apple"); //it removes the element Apple
        fruitsList.set(2,"Orange");     //Replace element in the index 2 with orange

        for(String a: fruitsList)
        {
            System.out.println(a);
        }
        if(fruitsList.contains("Mango"))
        {
            System.out.println("Its present");
        }
        else
        {
            System.out.println("Its not present");
        }
        if(fruitsList.isEmpty())
        {
            System.out.println("Its empty");
        }
        else
        {
            System.out.println("List is not empty");
        }

        fruitsList = new LinkedList<>();//Dynamic Polymorphism
    }
}
