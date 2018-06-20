package com.codewars.sixtead._6kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TripleTroubleTest {
    @Test
    public void test1(){
      assertEquals(1, TripleTrouble.TripleDouble(451999277L, 41177722899L));
    }

    @Test
    public void test2(){
      assertEquals(0, TripleTrouble.TripleDouble(1222345L, 12345L));    
    }
    
    @Test
    public void test3(){
      assertEquals(0, TripleTrouble.TripleDouble(12345L, 12345L));
    }
    
    @Test
    public void test4(){
      assertEquals(1, TripleTrouble.TripleDouble(666789L, 12345667L));
    }
    
    @Test
    public void test5() {
      assertEquals(0, TripleTrouble.TripleDouble(451999277, 411777228L));
    }
}