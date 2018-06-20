package com.codewars.sixtead._6kyu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiTapKeypadTextEntryOnAnOldMobilePhoneTest {
    @Test
    public void simpleTest() {
      assertEquals(9, MultiTapKeypadTextEntryOnAnOldMobilePhone.presses("LOL"));
      assertEquals(13, MultiTapKeypadTextEntryOnAnOldMobilePhone.presses("HOW R U"));
    }
}