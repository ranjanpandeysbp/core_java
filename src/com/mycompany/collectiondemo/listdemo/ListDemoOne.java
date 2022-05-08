package com.mycompany.collectiondemo.listdemo;

import java.util.ArrayList;

public class ListDemoOne {
    public static void main(String[] args)
    {
        //List allows duplicate values & maintains the order of insertion
        //This is a RAW List because it allows us to add all different kind of datatype
        //Raw List allows to add any datatype
        //ArrayList will automatically grow in size as we add new items to it.

        ArrayList numberList =  new ArrayList();
        numberList.add("YELLOW Ball");
        numberList.add("BLUE Ball");
        numberList.add("YELLOW Ball");
        numberList.add("PINK Ball");
        numberList.add("PURPLE Ball");
        numberList.add(88.975);
        numberList.add("BLUE Ball");
        numberList.add(2005);

        for(int i=0; i<numberList.size(); i++)
        {
            System.out.println("COLOR BALLS: "+numberList.get(i));
        }

        for(Object a: numberList)
        {
            System.out.println("COLOR BALLS: "+a);//.get not required here
            //System.out.println("COLOR BALLS: "+a.getClass());
        }

    }
}
