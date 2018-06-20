package com.codewars.sixtead._6kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvilAutocorrectPrankTest {
    @Test
    public void testApply() {
        String[] inputs = new String[] {
        "u",
        "you",
        "Youuuuu",
        "youtube"
        };
        
        String[] outputs = new String[] {
        "your sister",
        "your sister",
        "your sister",
        "youtube"
        };
        
        for (int i = 0; i < inputs.length; i++) {
        assertEquals(outputs[i], EvilAutocorrectPrank.autocorrect(inputs[i]), String.format("Wrong result for \"%s\":", inputs[i]));
        }
    }
}