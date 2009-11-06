package mots;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PointTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPoint() {
		Point p = new Point();
		Assert.assertEquals(p.getX(), 0.0);
		Assert.assertEquals(p.getY(), 0.0);
	}

	@Test
	public void testPointDoubleDouble() {
		Point p = new Point(10.0, 20.0);
		Assert.assertEquals(p.getX(), 10.0);
		Assert.assertEquals(p.getY(), 20.0);
	}

	@Test
	public void testTranslateDoubleDouble() {
		Point p = new Point(0, 0);
		p.translate(3, 4);
		Assert.assertEquals(p.getX(), 3.0);
		Assert.assertEquals(p.getY(), 4.0);
	}

	@Test
	public void testTranslateX() {
		Point p = new Point(0, 0);
		p.translateX(3);
		Assert.assertEquals(p.getX(), 3.0);
		Assert.assertEquals(p.getY(), 0.0);
	}

	@Test
	public void testTranslateY() {
		Point p = new Point(0, 0);
		p.translateY(4);
		Assert.assertEquals(p.getX(), 0.0);
		Assert.assertEquals(p.getY(), 4.0);
	}

	@Test
	public void testTranslatePoint() {
		Point p = new Point(3, 4);
		Assert.assertEquals(p.getX(), 3.0);
		Assert.assertEquals(p.getY(), 4.0);
	}

	@Test
	public void testDistance() {
		Point p1 = new Point();
		Point p2 = new Point(3, 4);

		// We know that 3^2 + 4^2 = 5
		// but want to make sure we are calculating it as it should be done
		double distance = Math.sqrt(Math.pow(3, 2) + Math.pow(4, 2));
		
		Assert.assertEquals(p2.distance(p1), distance);
		Assert.assertEquals(p1.distance(p2), distance);
	}
}
