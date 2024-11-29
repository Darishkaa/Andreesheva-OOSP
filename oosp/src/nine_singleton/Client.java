package nine_singleton;

public class Client {
    public static void main(String[] args) {
        TextEditor editor1 = TextEditor.getInstance();
        editor1.setText("Hello, Singleton!");
        System.out.println("Editor1 Text: " + editor1.getText());

        TextEditor editor2 = TextEditor.getInstance();
        System.out.println("Editor2 Text: " + editor2.getText());

        editor2.clearText();
        System.out.println("After clearing, Editor1 Text: " + editor1.getText());
    }
}
