package state;

public class BrushTool implements Tool {
	private int _width;
	
	public BrushTool(int width) {
		this._width = width;
	}
	
	@Override
	public void mouseUp() {
		System.out.println("Draw a line of width "+ this._width);
	}

	@Override
	public void mouseDown() {
		System.out.println("Brush Icon");
	}

}
