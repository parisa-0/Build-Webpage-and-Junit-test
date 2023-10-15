package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonClassTest {
    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test void personNameProvidedByUser() {
        provideInput("test");
        String input = Person.readName();
        assertTrue(input.length() > 1);
    }



}
