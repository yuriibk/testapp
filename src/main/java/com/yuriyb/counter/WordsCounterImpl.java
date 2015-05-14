package com.yuriyb.counter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class WordsCounterImpl implements WordsCounter {
	
	private List<String>  wordsStore = new ArrayList<String>();

	public void addWord(String word) {
		wordsStore.add(word.toUpperCase());
	}

	public int getWordCount(String word) {
		return Collections.frequency(wordsStore, word.toUpperCase());
	}
}
