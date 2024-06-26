package com.oops.concept;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Polymor {

    static HashMap hm = new HashMap<String, Integer>();

    public static void method1(ArrayList list) {

    }

    public static void sortbykey() {

        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.putAll(hm);

        for (Map.Entry<String, Integer> entery : tm.entrySet()) {
            System.out.println("Keys:---" + entery.getKey() + ",\tvalue" + entery.getValue());
            //entery.getValue();
        }

    }
	 
	        
	       /* for (Map.Entry<String, Integer> entry : tm.entrySet())
	            System.out.println("Key = " + entry.getKey() +
	                         ", Value = " + entry.getValue());       
	   
	    }*/


    public static void main(String[] args) {


        hm.put("amit", 60);
        hm.put("vikas", 40);
        hm.put("bhanu", 50);
        hm.put("dog", 80);
        hm.put("cat", 70);

        sortbykey();


    }


}
