package com.string;

/* Input: aabbccc, output: a2b2c3
        Input: aabbaaa, output: a2b2a3
        Input: aabba, output: a2b2a1*/
public class StringFreqAppend {
/*
    //aabba
    String freqCount(String str) {
        StringBuilder sb = new StringBuilder();
        char[] ch = str.toCharArray();

        int count = 1;
        int i;
        for (i = 1; i < ch.length; i++) {
            if (ch[i] == ch[i - 1]) {
                count++;
            } else {
                sb.append(ch[i - 1]).append(count);
                count = 1;
            }

        }
        sb.append(ch[i - 1]).append(count);
        return sb.toString();
    }
*/
 
	public String freqcount(String str) {
		
		StringBuffer sb=new StringBuffer();
		char[] ch=str.toCharArray();
		
		int count=1;
		
		
		for(int i=1;i<ch.length;i++) {
			if(ch[i]==ch[i-1]) {
				count++;
			}
			else {
				sb.append(ch[i-1]).append(count);
				count=1;
			}
			sb.append(ch[i]).append(count);
		}
		
		return sb.toString();
		
	}
	
	public static void main(String[] args) {

        StringFreqAppend sf = new StringFreqAppend();

        System.out.println(sf.freqcount("aabbccc") + "Matching with" + "a2b2c3");
        System.out.println(sf.freqcount("aabbaaa") + "Matching with" + "a2b2a3");
        System.out.println(sf.freqcount("aabba") + "Matching with" + "a2b2a1");

    }
}
