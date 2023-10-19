package com.besot.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<Books> list = new ArrayList<Books>();
        Books b1 = new Books(1,"Honour", "Besot",56);
        Books b2 = new Books(2,"Valour", "Tayo",58);
        Books b3 = new Books(3,"Win", "Emma",87);
        Books b4 = new Books(4,"give", "Tosin",100);

        //adding books to list
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);

       // System.out.println(list);

        {
            for (Books b: list) {
                System.out.println(b.id+ " "+ b.name+" "+b.author+" "+b.quantity);

            }
        }
        System.out.println();
        {
            Iterator a = list.iterator();
            while (a.hasNext()) {
               System.out.println(a.next());

            }
        }
    }
}
class Books{
    int id;
    String name;
    String author;
    int quantity;

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Books(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;


    }
}


