package com.hsbc.Que2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class CollectionImpl {
	
    public static List<Object> arrayToList(Object[] arr) {
        List<Object> list = new ArrayList<>();
        for (Object obj : arr) {
            list.add(obj);
        }
        return list;
    }

    public static void main(String[] args) {
     
        Object[] data = { "Samsung", "Apple", "Vivo", "Oppo", "Oneplus" };

      
        List<Object> arrayList = new ArrayList<>();
        arrayList.addAll(arrayToList(data));

        System.out.println("ArrayList:");
        for (Object item : arrayList) {
            System.out.println(item);
        }

        System.out.println();

      
        List<Object> vectorList = new Vector<>();
        vectorList.addAll(arrayToList(data));

        System.out.println("Vector:");
        for (Object item : vectorList) {
            System.out.println(item);
        }

        System.out.println();

        List<Object> linkedList = new LinkedList<>();
        linkedList.addAll(arrayToList(data));

        System.out.println("LinkedList:");
        for (Object item : linkedList) {
            System.out.println(item);
        }
    }

}
