package com.collection.hashmap;

import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

/*examle of overriding hascode and eqals method.*/

public class HashMapExample {
	
	int id ;
	String name;

	public HashMapExample(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapExample other = (HashMapExample) obj;
		return id == other.id && Objects.equals(name, other.name);
	}



	public static void main(String[] args) {

		HashMapExample hme=new HashMapExample(1, "abc");

		HashMapExample hme2=new HashMapExample(1, "abc");
		
		StringBuilder sb1=new StringBuilder("amit");
		
		StringBuilder sb2=new StringBuilder("amit");
		
		HashMap<StringBuilder, Integer> hm=new HashMap<>();

		HashMap<HashMapExample, Integer> hm1=new HashMap<>();
		
		Set set=new HashSet();

		hm1.put(hme, 1);
		hm1.put(hme2, 1);
		//hm.put(hme, 1);
		//hm.put(hme2, 1);
		hm.put(sb1, 1);
		hm.put(sb2, 1);
		
		set.add(hme);
		set.add(hme2);
		
		System.out.println(hm.size());
		
		System.out.println("set size"+set.size());
		//System.out.println(h);
		
		
	}

}
