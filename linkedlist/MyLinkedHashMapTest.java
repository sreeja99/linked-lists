package com.capgemini.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedHashMapTest {

	@Test
	public void givenALargeSentenceFindFrequencyOfGivenWord() {
		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting "
				+ "themselves deliberately into paranoid avoidable situations";
		MyLinkedHashMap<String,Integer> myLinkedHashMap = new MyLinkedHashMap<String,Integer>();
		String[] words=sentence.toLowerCase().split(" ");
		for(String word:words) {
			Integer value =myLinkedHashMap.get(word);
			if (value ==null) value=1;
			else
				value+=1;
			myLinkedHashMap.add(word,value);
		}
		int frequency =myLinkedHashMap.get("paranoid");
		System.out.println(myLinkedHashMap);
		assertEquals(3,frequency);
	}

}
