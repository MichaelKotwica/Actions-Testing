package com.michael.github;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloTest {

    private final Hello hello;

    public HelloTest() {
        this.hello = new Hello();
    }


    @Test
    public void helloStr() {
        assertEquals("Hello World!", hello.helloStr());
    }
}