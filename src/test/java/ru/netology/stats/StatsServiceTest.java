package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchase);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateMiddle() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateMiddle(purchase);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void maximumPurchase() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maximumPurchase(purchase);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minimumPurchase() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minimumPurchase(purchase);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthAmountUnderMiddle() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthAmountUnderMiddle(purchase);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void monthAmountOverMiddle() {
        StatsService service = new StatsService();
        long [] purchase = {8, 15, 13, 15,17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.monthAmountOverMiddle(purchase);
        assertEquals(expected, actual);
    }
}