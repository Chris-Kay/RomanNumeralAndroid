package com.example.kayc06.romannumerals;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanNumberalActivityTest {
    RomanNumeralsActivity romanNumeralsActivity = new RomanNumeralsActivity();

    @Test
    public void converts1() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(1), "I");
    }

    @Test
    public void converts3() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(3), "III");
    }

    @Test
    public void converts4() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(4), "IV");
    }

    @Test
    public void converts8() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(8), "VIII");
    }

    @Test
    public void converts9() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(9), "IX");
    }

    @Test
    public void converts10() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(10), "X");
    }

    @Test
    public void converts20() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(20), "XX");
    }

    @Test
    public void converts40() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(40), "XL");
    }

    @Test
    public void converts50() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(50), "L");
    }

    @Test
    public void converts60() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(60), "LX");
    }

    @Test
    public void converts90() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(90), "XC");
    }


    @Test
    public void converts100() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(100), "C");
    }

    @Test
    public void converts400() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(400), "CD");
    }

    @Test
    public void converts450() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(450), "CDL");
    }

    @Test
    public void converts500() throws Exception {
        assertEquals(romanNumeralsActivity.getConvertedString(500), "D");
    }
}