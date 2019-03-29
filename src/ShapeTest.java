import org.junit.Assert;
import org.junit.Test;


public class ShapeTest {

	@Test
	public void testShapes() {
		Assert.assertEquals("Shape values incorrect", Shape.BOOT, Shape.valueOf("BOOT"));
		Assert.assertEquals("Shape values incorrect", Shape.THIMBLE, Shape.valueOf("THIMBLE"));
		Assert.assertEquals("Shape values incorrect", Shape.RACECAR, Shape.valueOf("RACECAR"));
	}
	
	@Test
	public void toStringTest() {
		Assert.assertEquals("Shape toString value incorrect", "RACECAR", Shape.RACECAR.toString());
		Assert.assertEquals("Shape toString value incorrect", "THIMBLE", Shape.THIMBLE.toString());
		Assert.assertEquals("Shape toString value incorrect", "BOOT", Shape.BOOT.toString());
	}

}
