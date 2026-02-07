/*
 * Text state node for undo/redo
 */
class TextState {
    String content;
    TextState prev, next;

    TextState(String content) {
        this.content = content;
    }
}

/*
 * Undo/Redo Manager
 */
class TextEditor {

    private TextState current;

    // Add new state
    void addState(String text) {
        TextState node = new TextState(text);
        if (current != null) {
            current.next = node;
            node.prev = current;
        }
        current = node;
    }

    // Undo
    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }

    // Redo
    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }

    void display() {
        if (current != null)
            System.out.println(current.content);
    }

    public static void main(String[] args) {
        TextEditor te = new TextEditor();
        te.addState("Hello");
        te.addState("Hello World");
        te.undo();
        te.display();
    }
}
