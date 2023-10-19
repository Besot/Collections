package com.besot.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> brands = new ArrayList<String>();
        brands.add("Gucci");
        brands.add("Fendi");
        brands.add("Versace");
        brands.add("Nike");
        brands.add("Adidas");
        brands.add("Dior");
        System.out.println(brands);
        System.out.println();
        Collections.sort(brands);
        System.out.println(brands);
        //..................................................
        // Iterating Arraylist using for-each loop
        ArrayList<String> brands1 = new ArrayList<String>();
        brands1.add("Gucci");
        brands1.add("Fendi");
        brands1.add("Versace");
        brands1.add("Nike");



        for (String wears : brands1) {
            System.out.println(wears);
        }
        // using while loop
        {
            System.out.println();
            System.out.println("Using while loop");
            Iterator<String> a = brands.iterator();

            while (a.hasNext()) {
                System.out.println(a.next());
            }
            // ArrayList to remove object
            {
                ArrayList<String> country = new ArrayList<String>();
                country.add("Niger");
                country.add("Senegal");
                country.add("Tunisia");
                country.add("Uganda");
                System.out.println(country);
                country.remove(1);
                System.out.println(country);

                // creating another group of country
                System.out.println();
                ArrayList<String> country2 = new ArrayList<String>();
                country2.add("Brazil");
                country2.add("Togo");
                System.out.println("Country 2 is : " + country2);

                //adding the two groups
                country.addAll(country2);
                System.out.println(country);
                //retain all....
                System.out.println();
                country.retainAll(country2);
                //  System.out.println("Retain all country2: "+country);
                Iterator b = country.iterator();
                while (b.hasNext()) {
                    System.out.println("Iterated retained counrty2: " + b.next());
                }
            }

        }
    }
}