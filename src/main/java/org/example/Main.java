package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Creating Hash Map
        HashMap<String,Integer> map = new HashMap<>();

        //Putting the values inside hashmap
        map.put("klucz1",10);
        map.put("klucz2",20);

        //Displaying the value

        int value = map.get("klucz1");
        System.out.println(value);

        //Check if the key exists

        boolean exists = map.containsKey("klucz1");
        System.out.println(exists);

        //removing the element

        map.remove("klucz1");

        System.out.println(map.get("klucz1"));


        //Iterating over the HashMap

        for (Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        HashMap<String,Integer> human = new HashMap<>();

        human.put("Anna",25);
        human.put("Marek",30);
        human.put("Jan",35);
        human.put("Jan",100);

        for (Map.Entry<String,Integer> entry: human.entrySet()){
            System.out.println("Name: " + entry.getKey() + " ,Age: " + entry.getValue());
        }
    if (human.containsKey("Marek")){
        System.out.println("Marek is in the hash map");
    }else {
        System.out.println("Marek is not in the hash map");
    }

    }
}