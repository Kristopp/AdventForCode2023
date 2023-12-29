package com.aoc.dayOne;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.aoc.aoc.dayOne.DayOne;

public class DayOneTest {

    @Test
    public void testFindFirstAndLastNumber() {
        DayOne dayOne = new DayOne();
        int result = dayOne.findFirstAndLastNumber("1abc2");
        Assertions.assertEquals(12, result);
    }
}
