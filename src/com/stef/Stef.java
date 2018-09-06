package com.stef;

import java.util.*;

public class Stef {

    public static void main(String[] args){
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        System.out.println("通过 Map.keySet 遍历 key 和 value : ");
        for (String key : map.keySet()) {
            System.out.println("key = " + key + "and value = " + map.get(key));
        }

        System.out.println("通过 Map.entrySet 使用iterator遍历key和value：");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("key = " + entry.getKey() + "and value = " + entry.getValue());
        }
    }
}


