package org.cvtc.dschreiber4.unitTests;

import static org.junit.Assert.*;

import org.cvtc.dschreiber4.shapes.Cuboid;
import org.junit.Test;

public class CuboidTest {

    // create new cuboid objects
    Cuboid cuboid1 = new Cuboid(2.5f, 2.5f, 2.5f);
    Cuboid cuboid2 = new Cuboid(1.5f, 2.5f, 3.5f);
    Cuboid cuboid3 = new Cuboid(4.0f, 2.5f, 7.0f);

    // test surface area
    @Test
    public void surfaceAreaTest1() {
        assertEquals(37.5, cuboid1.surfaceArea(), 0.2f);
    }

    @Test
    public void surfaceAreaTest2() {
        assertEquals(35.5, cuboid2.surfaceArea(), 0.2f);
    }

    @Test
    public void surfaceAreaTest3() {
        assertEquals(111.0, cuboid3.surfaceArea(), 0.2f);
    }

    // test volume
    @Test
    public void volumeTest1() {
        assertEquals(15.62, cuboid1.volume(), 0.02f);
    }

    @Test
    public void volumeTest2() {
        assertEquals(13.12, cuboid2.volume(), 0.02f);
    }

    @Test
    public void volumeTest3() {
        assertEquals(70.0, cuboid3.volume(), 0.02f);
    }

    // test width
    @Test
    public void getWidthTest() {
        assertEquals(2.5, cuboid1.getWidth(), 0.02f);
    }

    // test height
    @Test
    public void getHeightTest() {
        assertEquals(2.5, cuboid1.getHeight(), 0.02f);
    }

    // test length
    @Test
    public void getDepthTest() {
        assertEquals(2.5, cuboid1.getDepth(), 0.02f);
    }
}