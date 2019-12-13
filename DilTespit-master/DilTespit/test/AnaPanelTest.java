/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mergehez
 */
public class AnaPanelTest {
    
    public AnaPanelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sorgula method, of class AnaPanel.
     */
    @Test
    public void testSorgula() {
        System.out.println("sorgula");
        AnaPanel instance = new AnaPanel();
        Islem islem = new HttpIslemleri();
        String metin = islem.doIslemHttp("https://ku.wikipedia.org/wiki/Komkujiya_Z%C3%AElan%C3%AA");
        DilSonuc ds = instance.sorgula(metin);
        assertEquals(ds.dil,KrDil.dil);
        System.out.println("kr bitti");
        
        metin = islem.doIslemHttp("https://en.wikipedia.org/wiki/Stylus");
        ds = instance.sorgula(metin);
        assertEquals(ds.dil,EngDil.dil);
        System.out.println("eng bitti");
        
        metin = islem.doIslemHttp("https://tr.wikipedia.org/wiki/Anayasa");
        ds = instance.sorgula(metin);
        assertEquals(ds.dil,TrDil.dil);
        System.out.println("tr bitti");
    }

    /**
     * Test of main method, of class AnaPanel.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        AnaPanel.main(args);
    }
    
}
