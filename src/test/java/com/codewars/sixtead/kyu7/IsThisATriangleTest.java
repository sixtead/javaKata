package com.codewars.sixtead.kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IsThisATriangleTest {
    
    @Test
    public void publicTests() {
        assertEquals(IsThisATriangle.isTriangle(1,2,2), true);
        assertEquals(IsThisATriangle.isTriangle(7,2,2), false);
    }
}