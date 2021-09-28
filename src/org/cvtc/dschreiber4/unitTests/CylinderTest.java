package org.cvtc.dschreiber4.unitTests;
import static org.junit.Assert.*;

import org.cvtc.dschreiber4.shapes.Cylinder;
import org.junit.Test;

public class CylinderTest {

    // Create cylinder test objects
    Cylinder cylinder1 = new Cylinder(2.5f, 2.5f);
    Cylinder cylinder2 = new Cylinder(5.5f, 5.5f);
    Cylinder cylinder3 = new Cylinder(13.5f, 8.5f);

    // Test Surface Area
    @Test
    public void surfaceAreaTest1() {
        assertEquals(78.53, cylinder1.surfaceArea(), 0.02f);
    }

    @Test
    public void surfaceAreaTest2() {
        assertEquals(380.13, cylinder2.surfaceArea(), 0.02f);
    }

    @Test
    public void surfaceAreaTest3() {
        assertEquals(1866.10, cylinder3.surfaceArea(), 0.02f);
    }

    // Test Volume
    @Test
    public void volumeTest1() {
        assertEquals(49.08, cylinder1.volume(), 0.02f);
    }

    @Test
    public void volumeTest2() {
        assertEquals(522.68, cylinder2.volume(), 0.02f);
    }

    @Test
    public void volumeTest3() {
        assertEquals(4866.71, cylinder3.volume(), 0.02f);
    }

    // test Radius
    @Test
    public void getRadiusTest() {
        assertEquals(2.5, cylinder1.getRadius(), 0.02f);
    }

    // test height
    @Test
    public void getHeightTest() {
        assertEquals(2.5, cylinder1.getHeight(), 0.02f);
    }
}