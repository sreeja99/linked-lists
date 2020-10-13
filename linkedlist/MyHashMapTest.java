package com.capgemini.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyHashMapTest {

	@Test
	public void givenASentenceShoulsReturnWordFrequency() {
		String sentence = "to be or to be not";
		MyHashMap<String,Integer> myHashMap = new MyHashMap<String,Integer>();
		String[] words=sentence.toLowerCase().split(" ");
		for(String word:words) {
			Integer value =myHashMap.get(word);
			if (value ==null) value=1;
			else
				value+=1;
			myHashMap.add(word,value);
		}
		int frequency =myHashMap.get("to");
		System.out.println(myHashMap);
		assertEquals(2,frequency);
	}

}
