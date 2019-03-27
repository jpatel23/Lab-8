import org.junit.Assert;
import org.junit.Test;

public class ColorTest {

	@Test
	public void ColorVariableTest() {
		Assert.assertEquals("Color value incorret", Color.RED, Color.valueOf("RED"));
		Assert.assertEquals("Color value incorret", Color.GREEN, Color.valueOf("GREEN"));
		Assert.assertEquals("Color value incorret", Color.BLUE, Color.valueOf("BLUE"));
		Assert.assertEquals("Color value incorret", Color.YELLOW, Color.valueOf("YELLOW"));
		Assert.assertEquals("Color value incorret", Color.CYAN, Color.valueOf("CYAN"));
		Assert.assertEquals("Color value incorret", Color.MAGENTA, Color.valueOf("MAGENTA"));
	}
	
	@Test
	public void ColorValueTest() {
		Color color;
		
		color = Color.RED;
		Assert.assertEquals("RGB value incorret", 255, color.getR());
		Assert.assertEquals("RGB value incorret", 0, color.getG());
		Assert.assertEquals("RGB value incorret", 0, color.getB());
		
		color = Color.GREEN;
		Assert.assertEquals("RGB value incorret", 0, color.getR());
		Assert.assertEquals("RGB value incorret", 255, color.getG());
		Assert.assertEquals("RGB value incorret", 0, color.getB());
		
		color = Color.BLUE;
		Assert.assertEquals("RGB value incorret", 0, color.getR());
		Assert.assertEquals("RGB value incorret", 0, color.getG());
		Assert.assertEquals("RGB value incorret", 255, color.getB());

		color = Color.YELLOW;
		Assert.assertEquals("RGB value incorret", 255, color.getR());
		Assert.assertEquals("RGB value incorret", 255, color.getG());
		Assert.assertEquals("RGB value incorret", 0, color.getB());
		
		color = Color.CYAN;
		Assert.assertEquals("RGB value incorret", 0, color.getR());
		Assert.assertEquals("RGB value incorret", 255, color.getG());
		Assert.assertEquals("RGB value incorret", 255, color.getB());
		
		color = Color.MAGENTA;
		Assert.assertEquals("RGB value incorret", 255, color.getR());
		Assert.assertEquals("RGB value incorret", 0, color.getG());
		Assert.assertEquals("RGB value incorret", 255, color.getB());
	}

}
