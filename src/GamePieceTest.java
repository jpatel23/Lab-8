import org.junit.Assert;
import org.junit.Test;

public class GamePieceTest {

	@Test
	public void GamePieceConstanttest() {
		Assert.assertEquals("GamePiece values incorrect", GamePiece.RED_RACER, GamePiece.valueOf("RED_RACER"));
		Assert.assertEquals("GamePiece values incorrect", GamePiece.BLUE_RACER, GamePiece.valueOf("BLUE_RACER"));
		Assert.assertEquals("GamePiece values incorrect", GamePiece.MAGENTA_RACER, GamePiece.valueOf("MAGENTA_RACER"));
		Assert.assertEquals("GamePiece values incorrect", GamePiece.RED_THIMBLE, GamePiece.valueOf("RED_THIMBLE"));
		Assert.assertEquals("GamePiece values incorrect", GamePiece.BLUE_BOOT, GamePiece.valueOf("BLUE_BOOT"));
		Assert.assertEquals("GamePiece values incorrect", GamePiece.YELLOW_BOOT, GamePiece.valueOf("YELLOW_BOOT"));
		Assert.assertEquals("GamePiece values incorrect", GamePiece.GREEN_BOOT, GamePiece.valueOf("GREEN_RACER"));
	}
	
	@Test
	public void GamePieceConstructorTest() {
		Assert.assertEquals("GamePiece color value incorrect", "RED", GamePiece.RED_RACER.getColor().toString());
		Assert.assertEquals("GamePiece shape value incorrect", "RACECAR", GamePiece.RED_RACER.getShape().toString());
	}
	
	@Test
	public void MovesFirstTest() {
		GamePiece one = GamePiece.RED_RACER;
		GamePiece two = GamePiece.GREEN_BOOT;
		Assert.assertEquals("Comparison incorrect", one, one.movesFirst(one, two));
	}
	
	@Test
	public void toStringTest() {
		Assert.assertEquals("Inccorect toString Representation", GamePiece.RED_RACER.toString(), "RED_RACER: a RED RACECAR with priority 0");
	}

}
