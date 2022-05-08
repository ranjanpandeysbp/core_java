package com.mycompany.collectiondemo.listdemo;

import java.util.ArrayList;

public class GenericsListDemo {
    public static void main(String[] args)
    {
        //empIdList only allows to add Integer datatype to the list as we had added a constraint through generics
        ArrayList<Integer> empIdList = new ArrayList<Integer>();
        ArrayList<String> nameList = new ArrayList<String>();

        empIdList.add(23);
        //empIdList.add("Apple");   //Generics enforces strict datatype constraints on the List, here it is for Integer datatype
        nameList.add("Amit");
        //nameList.add(123);    //Generics enforces strict datatype constraints on the List
    }
}
