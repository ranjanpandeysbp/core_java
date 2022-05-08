package com.mycompany.jsondemo;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONDemo {
    public static void main(String[] args)
    {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Name", "Robert");
        jsonObject.put("ID", 1);
        jsonObject.put("Fees", new Double(1000.21));
        jsonObject.put("Active", new Boolean(true));
        jsonObject.put("Other Details", JSONObject.NULL);

        JSONArray list = new JSONArray();
        list.put("foo");
        list.put(new Integer(100));
        jsonObject.put("list",list);
        System.out.println(jsonObject);
    }
}
