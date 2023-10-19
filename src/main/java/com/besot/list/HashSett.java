package com.besot.list;

import java.util.HashSet;

public class HashSett {
    public static void main(String[] args) {
        //
        HashSet<String> set1 = new HashSet<String>();
        set1.add("Samsung");
        set1.add("LG");
        set1.add("Lenovo");
        set1.add("Apple");
        System.out.println(set1);

        //ADD Duplicate of the elements, print it, it will only print one of the element, no duplicate.
        set1.add("Samsung");
        set1.add("LG");
        set1.add("Nokia");

        System.out.println("Hashset does not permit duplication of elemtent: "+set1);
       //Advance for loop
       for (String a: set1 ) {
            System.out.println("Advance for loop: "+a);

        }

        // Using for each
             set1.forEach(hset-> System.out.println(set1));

    }

}
