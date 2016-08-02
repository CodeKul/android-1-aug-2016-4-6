package com.codekul.android52.collection;

import java.util.*;

/**
 * Created by aniruddha on 2/8/16.
 */
public class Main {

    public static void main(String[] args) {
       treeSet();
    }

    private static void list(){

        List<Integer> integers =
                new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(4);
        integers.add(5);
        integers.add(5);

        Integer _int = integers.get(4);
        System.out.println("Int at 4th pos - "+_int);
        integers.forEach(System.out::println);
    }

    private static void set(){
        Set<String> mobiles = new HashSet<>();
        mobiles.add("9762548833");
        mobiles.add("9762548833");
        mobiles.add("9852266411");
        mobiles.add("7852143214");
        mobiles.add("1367899086");
        mobiles.add(null);

        mobiles.forEach(System.out::println);
    }

    private static void treeSet(){
        TreeSet<Integer> treeSet =
                new TreeSet<>();
        treeSet.add(5);
        treeSet.add(60);
        treeSet.add(52);
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(6);
        treeSet.add(2);
        treeSet.add(20);

        treeSet.forEach(System.out::println);
    }

    public void map(){
        Map<Integer,String> map =
                new HashMap<>();
        map.put(1,"Android");
        map.put(2,"iOS");
        map.put(3,"Rim");
        map.put(4,"Windows");
        map.put(5,"Symbian");

        Collection<String> values = map.values();
        values.forEach(System.out::println);

        Set<Integer> keys = map.keySet();
        keys.forEach(System.out::println);

        Set<Map.Entry<Integer,String>> entrySet
                = map.entrySet();
        entrySet.forEach((Map.Entry<Integer, String> entry) ->{

        });

        entrySet.forEach(entry ->{
            System.out.println("Key - "+entry.getKey());
            System.out.println("Value - "+entry.getValue());
        });

        entrySet.forEach(Main::enrtyMap);
     }

    private static void simpleIntro(){
        Collection<String> collStr =
                new ArrayList<String>();
        collStr.add("India");
        collStr.add("Chiana");
        collStr.add("Japan");
        collStr.add("Shri Lanka");
        collStr.add("Nepal");

        Iterator<String> it=
                collStr.iterator();

        while(it.hasNext()){
            String str = it.next();
            System.out.println("Element is -- "+str);
        }

        for(String str : collStr){

            System.out.println("ForEach - "+str);
        }

        for (int i = 0; i <collStr.size() ; i++) {
            //System.out.println("For - "+collStr.ge);
            // u cant get element @ ith location
        }

        collStr.forEach(s -> {
            System.out.println("Lambda - "+s);
        });

        collStr.forEach(System.out::print);
    }

    private static void enrtyMap(Map.Entry<Integer, String> entry){
        System.out.println("Key - "+entry.getKey() +" Value "+entry.getValue());
    }
}
