package com.mycompany.collectiondemo.mapdemo;

import java.util.*;

//import com.mycompany.day8bookauthorprojectsolution.Author;

import java.util.ArrayList;
import java.util.List;

public class MapDemoOne {
    public static void main(String[] args)
    {
        /*
        List<Author> authorList = new ArrayList<>();
        Author a = new Author();

        authorList.add(a);
        a = new Author();
        //set value
        authorList.add(a);
        a = new Author();

        authorList.add(a);
        */
        Map<Integer, String> mapOfEmployee = new HashMap<>();
        //Map<Integer, String> mapOfEmployee = new LinkedHashMap<>();
        //Map<Integer, String> mapOfEmployee = new Hashtable<>();
        //Map<Integer, String> mapOfEmployee = new TreeMap<>();
        mapOfEmployee.put(111,"John");//Map.Entry<Integer,String>
        mapOfEmployee.put(555,"Alex");//Map.Entry<Integer,String>
        mapOfEmployee.put(333,"Peter");//Map.Entry<Integer,String>
        mapOfEmployee.put(444,"Joe");//Map.Entry<Integer,String>
        mapOfEmployee.put(null,null);//Map.Entry<Integer,String>
        mapOfEmployee.put(null,null);   //If the key is exactly same it overrides the whole entry of the map

        //mapOfEmployee.put(null,"Ram"); //null is allowed in the Key as well as Value
        mapOfEmployee.put(777,null);

        for(Map.Entry<Integer, String> m: mapOfEmployee.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
            if(m.getValue()!=null && m.getValue().equals("Alex"))
            {
                System.out.println("Found Alex at Key: "+m.getKey());
            }
        }
        System.out.println(mapOfEmployee.get(333));
        System.out.println(mapOfEmployee.size());   //Similarly there are other function like containsValue, containsKeys, remove, replace, remove all etc.
    }
}
