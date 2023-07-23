package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashBackHackerServiceTest {

    // 1. Позитивное тестирование
    @org.testng.annotations.Test
    public void testInPositiveScenario() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }
    // 2.1. Проверка граничных значений - amount = 1000
    @org.testng.annotations.Test
    public void testRemain0() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    // 2.2. Проверка граничных значений - amount = 999
    @org.testng.annotations.Test
    public void testRemain1() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;
        assertEquals(actual, expected);
    }

    // 2.3. Проверка граничных значений - amount = 1001
    @org.testng.annotations.Test
    public void testRemain999() {
        CashBackHackerService service = new CashBackHackerService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

}
