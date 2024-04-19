package com.collection.hashcode;

import java.util.HashMap;

public class Stringclass {
	public static void main(String[] args) {
		String str="amitkumarsharma";
		
		Stringclass2 sc=new Stringclass2();
		
		char[] ch=str.toCharArray();
		
		HashMap<Character, Integer> hm=new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			
			if(!hm.containsKey(ch[i])) {
				
				hm.put(ch[i], 1);
			}
			else {
				hm.put(ch[i],hm.get(ch[i])+1);
			}
			
			
		}	
		
	}

}


class Stringclass2{
	int i;
	int j;
	
	
	
	Stringclass2(){
		
	}
	
	Stringclass2(int i,int j){
		this.i=i;
		this.j=j;
		
	}
	
}



class Singleton{
	
	private Singleton single;
	
	private Singleton() {
		
	}
	
	Singleton	getSingleton(){
		
		if(single==null) {
			single=new Singleton();
		}
		
		return single;
		
	}
	
	
}




