package state;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Canvas canvas = new Canvas();
		canvas.setCurrentTool(new EraseTool());
		
		canvas.mouseDown();
		canvas.mouseUp();
	}

}
