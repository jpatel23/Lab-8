
public enum GamePiece {
	RED_RACER(red, racecar, 0), BLUE_RACER(blue, racecar, 2), MAGENTA_RACER(magenta, racecar, 1), RED_THIMBLE(red, thimble, 10), BLUE_BOOT(blue, boot, 5), GREEN_BOOT(green, boot, 8), YELLOW_BOOT(yellow, boot, 7);
	
	String color;
	String shape;
	int priority;
	
	private GamePiece(String color, String shape, int priority) {
		this.color = color;
		this.shape = shape;
		this.priority = priority;
	}
}
