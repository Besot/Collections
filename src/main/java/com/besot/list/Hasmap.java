package com.besot.list;

import java.util.HashMap;

public class Hasmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("LAGOS",120);
        map.put("ONDO",140);
        map.put("EDO",100);
        map.put("KANO",138);
        System.out.println(map);
        //Access the value corresponding to the key
        Integer ondoKey = map.get("ONDO");

        System.out.println(ondoKey);
        map.remove("EDO");

        System.out.println(ondoKey);

        System.out.println(map);
        System.out.println(map.size());

        boolean exist = map.containsKey("LAGOS");
        System.out.println(exist);

    }
}
