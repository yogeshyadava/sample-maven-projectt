package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SampleTest {

    @Test
    public void testAddition() {
        int a = 2 + 3;
        assertEquals(5, a);
    }

    @Test
    public void testString() {
        String str = "Jenkins";
        assertTrue(str.contains("Jen"));
    }
}

