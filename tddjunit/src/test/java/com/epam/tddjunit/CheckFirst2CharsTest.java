package com.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CheckFirst2CharsTest {
	/* TODO list for my feature
	 * 1. 2 chars : AB => B and AA => ""
	 * 2. 4 chars : ABCD => BCD and AABD => BD
	 * 3. 1 char : A => ""
	 * 4. empty char : "" => ""
	 */
	CheckFirst2Chars checkfirst2chars;
	
	@BeforeEach
	void setUp() {
		checkfirst2chars = new CheckFirst2Chars();
	}
	
	@Test
	void test2_1Chars() {
		assertEquals("B",checkfirst2chars.check("AB"));
	}
	
	@Test
	void test2_2Chars() {
		assertEquals("",checkfirst2chars.check("AA"));
	}
	
	@Test
	void test2_3Chars() {
		assertEquals("B",checkfirst2chars.check("BA"));
	}
	
	@Test
	void test4_1Chars() {
		assertEquals("BD",checkfirst2chars.check("AABD"));
	}
	
	@Test
	void test4_2Chars() {
		assertEquals("BCD",checkfirst2chars.check("ABCD"));
	}
	
	@Test
	void test1Chars() {
		assertEquals("",checkfirst2chars.check("A"));
	}
	
	@Test
	void testemptyChars() {
		assertEquals("",checkfirst2chars.check(""));
	}

}
