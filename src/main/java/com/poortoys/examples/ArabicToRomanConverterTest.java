package com.poortoys.examples;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRomanConverterTest {

	ArabicToRomanConverter rnc = new ArabicToRomanConverter();
	

	@Test
	public void test1() {
        assertEquals("I", rnc.convertToRoman(1));
    }
	
	@Test
	public void test4() {
        assertEquals("IV", rnc.convertToRoman(4));
    }
	
	@Test
	public void test3() {
        assertEquals("III", rnc.convertToRoman(3));
    }
	
	@Test
	public void test9() {
        assertEquals("IX", rnc.convertToRoman(9));
    }
	
	@Test
	public void test20() {
        assertEquals("XX", rnc.convertToRoman(20));
    }
	
	@Test
	public void test90() {
        assertEquals("XC", rnc.convertToRoman(90));
    }
	
	@Test
	public void test400() {
        assertEquals("CD", rnc.convertToRoman(400));
    }
	
	@Test
	public void test900() {
        assertEquals("CM", rnc.convertToRoman(900));
    }
	
	@Test
	public void test1999() {
        assertEquals("MCMXCIX", rnc.convertToRoman(1999));
    }
	
	@Test
	public void test3999() {
        assertEquals("MMMCMXCIX", rnc.convertToRoman(3999));
    }
	
	@Test
    public void test0() {
        assertThrows(IllegalArgumentException.class, () -> rnc.convertToRoman(0));
    }
	
	@Test
    public void test4000() {
        assertThrows(IllegalArgumentException.class, () -> rnc.convertToRoman(4000));
    }


	
}
