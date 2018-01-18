package com.codewars.sixtead.kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

class ThisIsAProblemTest {

    @Test
    void testThisIsAProblemOne() throws Exception {
        ThisIsAProblem ThisIsAProblem = new ThisIsAProblem("John", "Doe");
    
        assertEquals("John", ThisIsAProblem.getFirstName(),
            "Verifying First name. Object returned should contain the firstname: John");
    
        assertEquals("Doe", ThisIsAProblem.getLastName(),
            "Verifying Last name. Object returned should contain the lastname: Doe");
    
        assertNotEquals("JohnDoe", ThisIsAProblem.getFullName(),
            "Verifying full name. Object returned should contain full name: John Doe");
    
        assertEquals("John Doe", ThisIsAProblem.getFullName(),
            "Verifying full name. Object returned should contain full name: John Doe");
    }
}