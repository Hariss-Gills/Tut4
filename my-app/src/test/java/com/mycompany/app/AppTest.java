package com.mycompany.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testLoop()
    {
        App noice = new App();
        assertEquals(noice.cool(),1);
    }
}
