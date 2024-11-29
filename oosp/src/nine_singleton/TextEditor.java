package nine_singleton;

public class TextEditor {
    private static TextEditor instance;
    private String text;

    private TextEditor() {
        text = "";
    }

    public static TextEditor getInstance() {
        if (instance == null) {
            instance = new TextEditor();
        }
        return instance;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void clearText() {
        this.text = "";
    }
}
