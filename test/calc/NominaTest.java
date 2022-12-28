/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calc;

import java.util.Calendar;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oscar
 */
public class NominaTest
{
    
    public NominaTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

    /**
     * Test of getFechaInicio method, of class Nomina.
     */
    @Test
    public void testGetFechaInicio()
    {
        System.out.println("getFechaInicio");
        Nomina instance = null;
        Calendar expResult = null;
        Calendar result = instance.getFechaInicio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaInicio method, of class Nomina.
     */
    @Test
    public void testSetFechaInicio()
    {
        System.out.println("setFechaInicio");
        Calendar fechaInicio = null;
        Nomina instance = null;
        instance.setFechaInicio(fechaInicio);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFin method, of class Nomina.
     */
    @Test
    public void testGetFechaFin()
    {
        System.out.println("getFechaFin");
        Nomina instance = null;
        Calendar expResult = null;
        Calendar result = instance.getFechaFin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFin method, of class Nomina.
     */
    @Test
    public void testSetFechaFin()
    {
        System.out.println("setFechaFin");
        Calendar fechaFin = null;
        Nomina instance = null;
        instance.setFechaFin(fechaFin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSueldo method, of class Nomina.
     */
    @Test
    public void testGetSueldo()
    {
        System.out.println("getSueldo");
        Nomina instance = null;
        double expResult = 0.0;
        double result = instance.getSueldo();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSueldo method, of class Nomina.
     */
    @Test
    public void testSetSueldo()
    {
        System.out.println("setSueldo");
        double sueldo = 0.0;
        Nomina instance = null;
        instance.setSueldo(sueldo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSig method, of class Nomina.
     */
    @Test
    public void testGetSig()
    {
        System.out.println("getSig");
        Nomina instance = null;
        Nomina expResult = null;
        Nomina result = instance.getSig();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSig method, of class Nomina.
     */
    @Test
    public void testSetSig()
    {
        System.out.println("setSig");
        Nomina sig = null;
        Nomina instance = null;
        instance.setSig(sig);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
