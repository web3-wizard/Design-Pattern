package state;

public class SelectionTool implements Tool {
	private String _name;
	
	public SelectionTool(String name) {
		this._name = name;
	}
	
	@Override
	public void mouseUp() {
		System.out.println("Draw dashed " + this._name);
	}

	@Override
	public void mouseDown() {
		System.out.println("Selection Icon "+ this._name);
	}

}
