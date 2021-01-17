package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackerTest {
    CashbackHacker service = new CashbackHacker();

    @org.testng.annotations.Test
    public void shouldReturn100for900() {
        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn1000for0() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn1001for999() {
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn999for1() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldReturn0for1000() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

}