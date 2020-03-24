package com.epam.tdd_junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveATest
{
    RemoveA removeA;
    @BeforeEach
    void setUp()
    {
        removeA = new RemoveA();
    }

    @Test
    void removeATest_lengthGreaterThanEqualTo2_firstTwoContainA()
    {
        assertEquals("CM", removeA.removeA("AACM"));
        assertEquals("CN", removeA.removeA("ACN"));
        assertEquals("BM", removeA.removeA("BAM"));
        assertEquals("", removeA.removeA("AA"));
        assertEquals("B", removeA.removeA("AB"));
        assertEquals("B", removeA.removeA("BA"));
    }

    @Test
    void removeATest_lengthGreaterThanEqualTo2_firstTwoDoesNotContainA()
    {
        assertEquals("DFJGA", removeA.removeA("DFJGA"));
    }

    @Test
    void removeATest_lengthLessThan2()
    {
        assertEquals("X", removeA.removeA("X"));
        assertEquals("", removeA.removeA("A"));
    }
}