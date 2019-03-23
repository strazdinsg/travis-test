package ntnu.no.travisspringdemo;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {
    @Test
    public void testConstructor() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(2, r.getWidth());
    }

    @Test
    public void testArea() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(2 * 3, r.getArea());
    }

    @Test
    public void testPerimeter() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(2 * (2 + 3), r.getPerimeter());
    }

    @Test
    public void someTest() {
        Rectangle r = new Rectangle(2, 3);
        assertEquals(3, r.getHeight());
    }
}
