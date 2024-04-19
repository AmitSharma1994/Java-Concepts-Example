package com.string;

/*
 * Input: aabbccc, output: a2b2c3 
 * Input: aabbaaa, output: a2b2a3 
 * Input: aabba, output: a2b2a1
 */

import java.util.HashMap;
import java.util.Map;

public class StringFreqHM {

	StringBuilder sb = new StringBuilder();

	String countFreq(String str) {
		HashMap<Character, Integer> hm = new HashMap();
		char[] ch = str.toCharArray();
		int count = 1;
		for (int i = 0; i < ch.length; i++) {

			if (!hm.containsKey(ch[i])) {
				hm.put(ch[i], count);

			} else {
				hm.put(ch[i], (hm.get(ch[i]) + 1));
			}
		}
		for (Map.Entry hm1 : hm.entrySet()) {
			sb.append(hm1.getKey()).append(hm1.getValue());
			System.out.println();
		}
		return sb.toString();
	}

	public static void main(String[] args) {

		StringFreqHM sf = new StringFreqHM();
		System.out.println(sf.countFreq("aabba"));

	}
}
