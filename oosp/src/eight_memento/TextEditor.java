package eight_memento;

public class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        this.text = memento.getText();
    }

    public static class TextMemento {
        private final String text;

        private TextMemento(String text) {
            this.text = text;
        }

        private String getText() {
            return text;
        }
    }
}
