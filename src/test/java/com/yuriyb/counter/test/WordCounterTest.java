package com.yuriyb.counter.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.*;
import org.mockito.Mockito;

import com.yuriyb.counter.*;

public class WordCounterTest {
	
	private  WordsCounter wordsCounter;
	
	@Before
	public void setUpWordsCounter(){
		wordsCounter = new WordsCounterImpl();
	}
	
	@After
	public void destroyWordsCounter(){
		wordsCounter = null;
	}
	
	@Test
	public void test_check_count_before_word_adding(){	
		int expected = 0;
		int actual = wordsCounter.getWordCount("Y");
		
		assertEquals(expected, actual);		
	}
	
	@Test
	public void test_check_count_after_word_adding(){		
		wordsCounter.addWord("X");
		int expected = 1;
		int actual = wordsCounter.getWordCount("X");
		
		assertEquals(expected, actual);			
	}
	
	@Test
	public void test_check_count_after_adding_several_words(){
		wordsCounter.addWord("A");
		wordsCounter.addWord("B");
		wordsCounter.addWord("Z");
		
		for(int i=0; i<10000; i++){
			wordsCounter.addWord("Z");
		}
		
		int expected = 10001;
		int actual = wordsCounter.getWordCount("Z");
		assertEquals(expected, actual);
	}
	
	@Test(timeout=100)
	public void test_timeout_after_adding_several_words(){
		
		for(int i=0; i<100000; i++){
			wordsCounter.addWord("T");
		}
		
		int expected = 100000;
		int actual = wordsCounter.getWordCount("T");
		assertEquals(expected, actual);
	}
	
	@Test(expected=NullPointerException.class)
	public void test_check_exception_after_null_adding(){	
		wordsCounter.addWord(null);	
	}
}
