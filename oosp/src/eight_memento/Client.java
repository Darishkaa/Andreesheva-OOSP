package eight_memento;

import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Stack<TextEditor.TextMemento> history = new Stack<>();

        editor.setText("Version 1");
        System.out.println("Текст: " + editor.getText());
        history.push(editor.save());

        editor.setText("Version 2");
        System.out.println("Текст: " + editor.getText());
        history.push(editor.save());

        editor.setText("Version 3");
        System.out.println("Текст: " + editor.getText());

        editor.restore(history.pop());
        System.out.println("Востановлен: " + editor.getText());

        editor.restore(history.pop());
        System.out.println("Востановлен: " + editor.getText());
    }
}
