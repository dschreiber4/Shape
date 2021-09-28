package Tests;
import static org.junit.Assert.*;

import org.cvtc.dschreiber4.shapes.Sphere;
import org.junit.Test;

public class SphereTest {

    // Create sphere test objects
    Sphere sphere1 = new Sphere(2.5f);
    Sphere sphere2 = new Sphere(13.0f);
    Sphere sphere3 = new Sphere(22.5f);

    // Test Surface Area
    @Test
    public void surfaceAreaTest1() {
        assertEquals(78.54, sphere1.surfaceArea(), 0.02f);
    }

    @Test
    public void surfaceAreaTest2() {
        assertEquals(2124.52, sphere2.surfaceArea(), 0.02f);
    }

    @Test
    public void surfaceAreaTest3() {
        assertEquals(6364.43, sphere3.surfaceArea(), 0.02f);
    }

    // Test Volume
    @Test
    public void volumeTest1() {
        assertEquals(65.45, sphere1.volume(), 0.02f);
    }

    @Test
    public void volumeTest2() {
        assertEquals(9206.47, sphere2.volume(), 0.02f);
    }

    @Test
    public void volumeTest3() {
        assertEquals(47732.15, sphere3.volume(), 0.02f);
    }

    // test Radius
    @Test
    public void testGetRadius() {
        assertEquals(2.5, sphere1.getRadius(), 0.02f);
    }

}