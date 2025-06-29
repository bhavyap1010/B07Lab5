package lab5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTests {

	@Test
	void testComputeArea() {
		Point p = new Point(0, 1);
		Circle circle = new Circle(p, 2);
		assertEquals(circle.computeArea(), (Math.PI)*(Math.pow(circle.radius, 2)));
	}
	@Test
	void testComputePerimeter() {
		Point p = new Point(1, 0);
		Circle circle = new Circle(p, 4);
		assertEquals(circle.computePerimeter(), 2*(Math.PI)*(circle.radius));
	}

}
