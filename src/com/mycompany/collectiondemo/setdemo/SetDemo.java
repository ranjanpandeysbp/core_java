package com.mycompany.collectiondemo.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args)
    {
        //Set does not maintain the order of insertion
        Set<Integer> rolls = new HashSet<>();   //Allows to add null value
        //TreeSet implements the SortedSet interface
        //Set<Integer> rolls = new TreeSet<>(); //TreeSet helps us to sort the set in the ascending order
        //If we add null value then it gives the Null Pointer Exception at Run time
        //Set<Integer> rolls = new LinkedHashSet<>();   //Allows to add null value
        rolls.add(1);
        rolls.add(5);
        rolls.add(3);
        rolls.add(99);

        rolls.add(null);//TreeSet does not allow null value but HashSet allows null values
        for(int i=0;i< rolls.size();i++)
        {
            System.out.println(rolls);
        }
        for(Integer r: rolls)
        {
            System.out.println(r);
        }
        System.out.println(rolls.size());
        rolls.add(3);
        rolls.add(99);
        System.out.println(rolls.size());   //Size remains same as the duplicates are overridden
        rolls.remove(99);
        System.out.println(rolls.size());
        rolls.clear();  //Clears the whole set
        System.out.println(rolls.size());
    }
}
