import org.junit.Assert;
import org.junit.Test;


public class ShapeTest {

	@Test
	public void testShapes() {
		Assert.assertEquals("Shape values incorrect", Shape.BOOT, Shape.valueOf("KITCHEN"));
		Assert.assertEquals("Shape values incorrect", Shape.THIMBLE, Shape.valueOf("KITCHEN"));
		Assert.assertEquals("Shape values incorrect", Shape.RACECAR, Shape.valueOf("KITCHEN"));
	}
	
	@Test
	public void toStringTest() {
		Assert.assertEquals("Shape toString value incorrect", "racecar", Shape.RACECAR.toString());
		Assert.assertEquals("Shape toString value incorrect", "thimble", Shape.THIMBLE.toString());
		Assert.assertEquals("Shape toString value incorrect", "boot", Shape.BOOT.toString());
	}

}
