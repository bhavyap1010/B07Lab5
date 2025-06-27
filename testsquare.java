package grouplab;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class testsquare {
	
	@Test
	void testPerim(){
		Point p = new Point(0,0);
		double l = 2;
		square s = new square(p,l);
		
		assertEquals(s.perimeter(), 8);
	}
	
	@Test
	void testArea(){
		Point p = new Point(0,0);
		double l = 2;
		square s = new square(p,l);
		
		assertEquals(s.area(), 4);
	}
	
	@Test
	void testSameObj(){
		Point p = new Point(0,0);
		double l = 2;
		square s = new square(p,l);
		
		assertTrue(s.equals(s));
	}
	
	
	@Test
	void testNull(){
		Point p = new Point(0,0);
		double l = 2;
		square s = new square(p,l);
		
		assertFalse(s.equals(null));
	}
	
	@Test
	void testDiffClass(){
		Point p = new Point(0,0);
		double l = 2;
		square s = new square(p,l);
		
		assertFalse(s.equals(p));
	}
	
	
	@Test
	void testNullPoint(){
		Point p = new Point(0,0);
		Point p2 = null;
		double l = 2;
		square s = new square(p,l);
		square s2 = new square(p2,l);
		
		assertFalse(s.equals(s2));
	}
	
	@Test
	void testNullandNotNull(){
		Point p = new Point(0,0);
		Point p2 = null;
		double l = 2;
		square s = new square(p2,l);
		square s2 = new square(p,l);
		
		assertFalse(s.equals(s2));
	}
	
	
	
	@Test
	void testDiffPoint(){
		Point p = new Point(0,0);
		Point p2 = new Point(1,0);
		double l = 2;
		square s = new square(p,l);
		square s2 = new square(p2,l);
		
		assertFalse(s.equals(s2));
	}
	
	@Test
	void testDiffSides(){
		Point p = new Point(0,0);
		Point p2 = new Point(0,0);
		square s = new square(p,2);
		square s2 = new square(p2,3);
		
		assertFalse(s.equals(s2));
	}
	
	@Test
	void testSamesq(){
		Point p = new Point(0,0);
		Point p2 = new Point(0,0);
		square s = new square(p,3);
		square s2 = new square(p2,3);
		
		assertTrue(s.equals(s2));
	}
	
	
	
}
