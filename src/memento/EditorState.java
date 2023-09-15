package memento;

public class EditorState {
	private final String content;
	
	public EditorState(String _content) {
		this.content = _content;
	}

	public String getContent() {
		return content;
	}
}
