import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class BoardGame {
	protected LinkedHashMap<String, GamePiece> playerPieces;
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame() {
		playerPieces = new LinkedHashMap<>();
		playerLocations = new LinkedHashMap<>();
	}
	
	/* 
	 * addPlayer DONE
	 * getGamePiecesAtLocation DONE
	 * getPlayerGamePiece DONE
	 * getPlayerLocations DONE
	 * getPlayerPieces DONE
	 * getPlayers DONE
	 * getPlayersAtLocation DONE
	 * getPlayersLocation DONE 
	 * getPlayerWithGamePiece DONE
	 * movePlayer DONE
	 * moveTwoPlayers DONE
	 */
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation) {
		boolean add = false;
		
		if (playerPieces.get(playerName) == null) {
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, initialLocation);
			add = true;
		}
		
		return add;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc) {
		ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
		ArrayList<String> players = getPlayersAtLocation(loc);
		
		for (String playerNames : players) {
			pieces.add(getPlayerGamePiece(playerNames));
		}
		
		return pieces;
	}
	
	public GamePiece getPlayerGamePiece(String playerName) {
		GamePiece player = playerPieces.get(playerName);
		return player;
	}
	
	public Set<Location> getPlayerLocations() {
		Set<String> locas = playerLocations.keySet();
		
		Set<Location> all = new HashSet<Location>();
		
		Location current;
		String player;
		
		Iterator<String> iter = locas.iterator();
		
		player = iter.next();
		current = playerLocations.get(player);
		
		all.add(current);
		
		while (iter.hasNext()) {
			player = iter.next();
			current = playerLocations.get(player);
			if (!(all.contains(current))) {
				all.add(current);
			}
		}
		
		return all;
	} 
	
	
	 public Set<GamePiece> getPlayerPieces() {
	
		 Set<GamePiece> all = new HashSet<GamePiece>();
		 Set<String> people = getPlayers();
		 Iterator<String> iter = people.iterator();
		 String player;
		 
		 while (iter.hasNext()) {
			player = iter.next();
			all.add(getPlayerGamePiece(player));
		 }
		 
		 return all;
	} 
	
	public Set<String> getPlayers() {
		return playerPieces.keySet();
	} 
	
	public ArrayList<String> getPlayersAtLocation(Location loc) {
		ArrayList<String> names = new ArrayList<String>();
		String name;
		Set<String> keyNames = playerLocations.keySet();
		Iterator<String> iter = keyNames.iterator();
		
		while(iter.hasNext()) {
			name = iter.next();
			if (playerLocations.get(name) == loc) {
				names.add(name);
			}
		}
		return names;
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece) {
		String name = "";
		Set<String> keyNames = playerPieces.keySet();
		Iterator<String> iter = keyNames.iterator();
		
		while(iter.hasNext()) {
			name = iter.next();
			if (playerPieces.get(name) == gamePiece) {
				return name;
			}
		}
		return null;
		
	}
	
	
	public Location getPlayersLocation(String player) {
		Location loca = playerLocations.get(player);
		return loca;
	}
	
	
	
	
	public void movePlayer(String playerName, Location loca) {
		playerLocations.put(playerName, loca);
	}
	
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations) {
		String[] players = new String[2];
		GamePiece one = getPlayerGamePiece(playerNames[0]);
		GamePiece two = getPlayerGamePiece(playerNames[1]);
		
		GamePiece priority = GamePiece.movesFirst(one, two);
		
		if (priority.equals(one)) {
			players[0] = playerNames[0];
			movePlayer(playerNames[0], newLocations[0]);
			players[1] = playerNames[1];
			movePlayer(playerNames[1], newLocations[1]);
		}
		
		else {
			players[0] = playerNames[1];
			movePlayer(playerNames[1], newLocations[1]);
			players[1] = playerNames[0];
			movePlayer(playerNames[0], newLocations[0]);
		}
		
		return players;
	}
	
	
	
	
	
	
}
