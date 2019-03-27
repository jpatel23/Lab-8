import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class BoardGameTest {


	@Test
	public void AddPlayerTest() {
		BoardGame board = new BoardGame();
		Assert.assertEquals("Player not added yet", true, board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.LOUNGE));
		Assert.assertEquals("Player was already added", false, board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.LOUNGE));
	}
	
	@Test
	public void GetPlayerGamePieceTest() {
		BoardGame board = new BoardGame();
		board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.LOUNGE);
		Assert.assertEquals("Incorrect Piece", GamePiece.RED_RACER, board.getPlayerGamePiece("Jaimin"));
	}
	
	@Test
	public void GetPlayerWithGamePieceTest() {
		BoardGame board = new BoardGame();
		Assert.assertEquals("Player is not using piece", null, board.getPlayerWithGamePiece(GamePiece.RED_RACER));
		
		board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.LOUNGE);
		board.addPlayer("Bron", GamePiece.YELLOW_BOOT, Location.STUDY);
		Assert.assertEquals("Wrong Player", "Bron", board.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
	}
	
	@Test
	public void MovePlayerTest() {
		BoardGame board = new BoardGame();
		board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.LOUNGE);
		board.movePlayer("Jaimin", Location.BILLIARD_ROOM);
		Assert.assertEquals("Incorrect location", Location.BILLIARD_ROOM, board.getPlayersLocation("Jaimin"));
	}
	
	@Test
	public void MoveTwoPlayerTest() {
		BoardGame board = new BoardGame();
		board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.CONSERVATORY);
		board.addPlayer("Bron", GamePiece.YELLOW_BOOT, Location.LOUNGE);
		
		String[] players = {"Jaimin", "Bron"};
		Location[] loca = {Location.HALL, Location.LIBRARY};
		String[] move = board.moveTwoPlayers(players, loca);
		Assert.assertEquals("Incorrect order", "Jaimin", move[0]);
		Assert.assertEquals("Incorrect order", "Bron", move[1]);
	}
	
	@Test
	public void GetPlayersLocationTest() {
		BoardGame board = new BoardGame();
		board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.CONSERVATORY);
		Assert.assertEquals("Incorrect location", Location.CONSERVATORY, board.getPlayersLocation("Jaimin"));
	}
	
	@Test
	public void GetPlayersAtLocation() {
		BoardGame board = new BoardGame();
		board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.LOUNGE);
		board.addPlayer("Bron", GamePiece.YELLOW_BOOT, Location.LOUNGE);
		ArrayList<String> actual = board.getPlayersAtLocation(Location.LOUNGE);
		ArrayList<String> expected = new ArrayList<String>(Arrays.asList("Jaimin", "Bron"));
		Assert.assertEquals("Incorrect list of players", true, actual.equals(expected));
	}
	
	@Test
	public void testGetGamePiecesAtLocation() {
		BoardGame board = new BoardGame();
		board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.CONSERVATORY);
		board.addPlayer("Bron", GamePiece.YELLOW_BOOT, Location.CONSERVATORY);
		ArrayList<GamePiece> actual = board.getGamePiecesAtLocation(Location.CONSERVATORY);
		ArrayList<GamePiece> expected = new ArrayList<GamePiece>(Arrays.asList(GamePiece.RED_RACER, 
				GamePiece.YELLOW_BOOT));
		Assert.assertEquals("Incorrect list of pieces", true, actual.equals(expected));
	}
	
	@Test
	public void testGetPlayers() {
		BoardGame board = new BoardGame();
		board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.BILLIARD_ROOM);
		board.addPlayer("Bron", GamePiece.YELLOW_BOOT, Location.CONSERVATORY);
		Set<String> actual = board.getPlayers();
		Set<String> expected = new HashSet<String>();
		expected.add("Jaimin");
		expected.add("Bron");
		Assert.assertEquals("Incorrect set of players", true, actual.equals(expected));
	}
	
	@Test
	public void testGetPlayerLocations() {
		BoardGame board = new BoardGame();
		board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.CONSERVATORY);
		board.addPlayer("Bron", GamePiece.YELLOW_BOOT, Location.HALL);
		Set<Location> actual = board.getPlayerLocations();
		Set<Location> expected = new HashSet<Location>();
		expected.add(Location.CONSERVATORY);
		expected.add(Location.HALL);
		Assert.assertEquals("Incorrect set of locations", true, actual.equals(expected));
	}
	
	@Test
	public void testGetPlayerPieces() {
		BoardGame board = new BoardGame();
		board.addPlayer("Jaimin", GamePiece.RED_RACER, Location.CONSERVATORY);
		board.addPlayer("Bron", GamePiece.YELLOW_BOOT, Location.HALL);
		Set<GamePiece> actual = board.getPlayerPieces();
		Set<GamePiece> expected = new HashSet<GamePiece>();
		expected.add(GamePiece.RED_RACER);
		expected.add(GamePiece.YELLOW_BOOT);
		Assert.assertEquals("Incorrect set of game pieces", true, actual.equals(expected));
	}

}
