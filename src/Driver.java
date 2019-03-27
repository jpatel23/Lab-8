
public class Driver {
	
	public static void main(String[] args) {
		
	
	BoardGame bg = new BoardGame();
	
	System.out.println(bg.addPlayer("Jaimin", GamePiece.RED_RACER, Location.KITCHEN));
	bg.addPlayer("Drake", GamePiece.RED_THIMBLE, Location.CONSERVATORY);
	bg.addPlayer("Bron", GamePiece.YELLOW_BOOT, Location.HALL);
	
	System.out.println(bg.getPlayerGamePiece("Drake"));
	
	System.out.println(bg.getPlayerWithGamePiece(GamePiece.YELLOW_BOOT));
	
	bg.movePlayer("Jaimin", Location.LIBRARY);
	System.out.println(bg.getPlayersLocation("Jaimin"));
	
	String[] players = {"Jaimin", "Drake"};
	Location[] loca = {Location.BILLIARD_ROOM, Location.BALLROOM};
	bg.moveTwoPlayers(players, loca);
	System.out.println(bg.getPlayersLocation("Jaimin"));
	
	System.out.println(bg.getPlayersAtLocation(Location.BALLROOM));
	
	bg.movePlayer("Bron" , Location.LOUNGE);
	System.out.println(bg.getPlayersAtLocation(Location.LOUNGE));
	
	System.out.println(bg.getPlayerLocations());
	
	System.out.println(bg.getPlayers());
	
	System.out.println(bg.getPlayerPieces());
	
	
	}
}
