import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest {

	@Test
	public void ConstructorTest() {
		Color color = Color.RED;
		Shape shape = Shape.RACECAR;
		GamePieceAppearance piece = new GamePieceAppearance(color, shape);
		Assert.assertEquals("Incorrect GamePieceAppearance name", "class GamePieceAppearance", piece.getClass().toString());
	}
	
	@Test
	public void getColorTest() {
		Color color = Color.RED;
		Shape shape = Shape.RACECAR;
		GamePieceAppearance piece = new GamePieceAppearance(color, shape);
		Assert.assertEquals("Incorrect GamePiece color", Color.RED, piece.getColor());
	}
	
	@Test
	public void getShapeTest() {
		Color color = Color.RED;
		Shape shape = Shape.RACECAR;
		GamePieceAppearance piece = new GamePieceAppearance(color, shape);
		Assert.assertEquals("Incorrect GamePiece shape", Shape.RACECAR, piece.getShape());
	}

}
