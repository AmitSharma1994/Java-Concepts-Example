package com.collection.hashmap;

import java.util.HashMap;
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
		
		HashMapExample hme=new HashMapExample(1, "amit");
		
		HashMapExample hme2=new HashMapExample(1, "amit");
		
		HashMap<HashMapExample, Integer> hm=new HashMap<>();
		
		hm.put(hme, 1);
		hm.put(hme2, 1);
		
		System.out.println(hm.size());
		
		
	}

}
