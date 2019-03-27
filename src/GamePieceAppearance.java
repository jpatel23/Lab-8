
public class GamePieceAppearance {
	private Shape shape;
	private Color color;
	
	public GamePieceAppearance(Color color, Shape shape) {
		this.shape = shape;
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public Shape getShape() {
		return shape;
	}
}
