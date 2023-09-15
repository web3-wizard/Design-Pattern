package memento;

import java.util.Stack;

public class History {
	private Stack<EditorState> _states = new Stack<>();
	
	public void push(EditorState state) {
		this._states.push(state);
	}
	
	public EditorState pop() {
		return this._states.pop();
	}
}
