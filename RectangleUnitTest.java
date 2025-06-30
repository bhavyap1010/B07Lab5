package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleUnitTest {

	 @Test
	    void testPerimeter() {
	        Point p = new Point(0, 0);
	        Rectangle r = new Rectangle(p, 4, 2);

	        assertEquals(12, r.perimeter());
	    }

	    @Test
	    void testArea() {
	        Point p = new Point(0, 0);
	        Rectangle r = new Rectangle(p, 4, 2);

	        assertEquals(8, r.area());
	    }

	    @Test
	    void testIsSquareTrue() {
	        Point p = new Point(0, 0);
	        Rectangle r = new Rectangle(p, 3, 3);

	        assertTrue(r.isSquare());
	    }

	    @Test
	    void testIsSquareFalse() {
	        Point p = new Point(0, 0);
	        Rectangle r = new Rectangle(p, 4, 2);

	        assertFalse(r.isSquare());
	    }

	    @Test
	    void testSameObj() {
	        Point p = new Point(0, 0);
	        Rectangle r = new Rectangle(p, 3, 3);

	        assertTrue(r.equals(r));
	    }

	    @Test
	    void testNull() {
	        Point p = new Point(0, 0);
	        Rectangle r = new Rectangle(p, 3, 3);

	        assertFalse(r.equals(null));
	    }

	    @Test
	    void testDiffClass() {
	        Point p = new Point(0, 0);
	        Rectangle r = new Rectangle(p, 3, 3);

	        assertFalse(r.equals(p));
	    }

	    @Test
	    void testNullPoint() {
	        Rectangle r1 = new Rectangle(new Point(0, 0), 3, 3);
	        Rectangle r2 = new Rectangle(null, 3, 3);

	        assertFalse(r1.equals(r2));
	    }

	    @Test
	    void testNullAndNotNull() {
	        Rectangle r1 = new Rectangle(null, 3, 3);
	        Rectangle r2 = new Rectangle(new Point(0, 0), 3, 3);

	        assertFalse(r1.equals(r2));
	    }

	    @Test
	    void testDiffPoint() {
	        Rectangle r1 = new Rectangle(new Point(0, 0), 3, 3);
	        Rectangle r2 = new Rectangle(new Point(1, 1), 3, 3);

	        assertFalse(r1.equals(r2));
	    }

	    @Test
	    void testDiffSides() {
	        Rectangle r1 = new Rectangle(new Point(0, 0), 3, 3);
	        Rectangle r2 = new Rectangle(new Point(0, 0), 4, 3);

	        assertFalse(r1.equals(r2));
	    }

	    @Test
	    void testSameRectangle() {
	        Rectangle r1 = new Rectangle(new Point(0, 0), 3, 3);
	        Rectangle r2 = new Rectangle(new Point(0, 0), 3, 3);

	        assertTrue(r1.equals(r2));
	    }

}

