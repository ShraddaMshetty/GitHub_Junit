package com.bnmit;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;


/**
 * Unit test for simple App.
 */
public class GreatestNumberTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testFindGreatestWhenFirstIsGreatest() {
        GreatestNumber gn=new GreatestNumber();
        assertEquals(20,gn.findGreatest(20,10,5));
       
    }

    @Test
    public void testFindGreatestWhenSecondIsGreatest() {
        GreatestNumber gn=new GreatestNumber();
        assertEquals(50,gn.findGreatest(10,50,30));
       
    }

    @Test
    public void testFindGreatestWhenThirdIsGreatest() {
        GreatestNumber gn=new GreatestNumber();
        assertEquals(99,gn.findGreatest(1,2,99));
       
    }

    @Test
    public void testFindGreatestWhenSecondIsGreatest() {
        GreatestNumber gn=new GreatestNumber();
        assertEquals(10,gn.findGreatest(10,10,20));
       
    }
}