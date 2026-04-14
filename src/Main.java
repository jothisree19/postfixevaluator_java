import java.util.Stack;
import java.util.Scanner;

// Action class (stores operation details)
class Action {
    String type;
    String value;

    public Action(String type, String value) {
        this.type = type;
        this.value = value;
    }
}

// Editor class
class AdvancedEditor {

    Stack<Action> undoStack = new Stack<>();
    Stack<Action> redoStack = new Stack<>();
    String currentText = "";

    // Add text
    public void add(String text) {
        currentText += text;
        undoStack.push(new Action("ADD", text));
        redoStack.clear();
    }

    // Delete last n characters
    public void delete(int n) {
        if (n > currentText.length()) {
            System.out.println("Cannot delete more characters than present!");
            return;
        }

        String removed = currentText.substring(currentText.length() - n);
        currentText = currentText.substring(0, currentText.length() - n);

        undoStack.push(new Action("DELETE", removed));
        redoStack.clear();
    }

    // Undo
    public void undo() {
        if (!undoStack.isEmpty()) {

            Action last = undoStack.pop();

            if (last.type.equals("ADD")) {
                currentText = currentText.substring(0, currentText.length() - last.value.length());
            } else {
                currentText += last.value;
            }

            redoStack.push(last);
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo
    public void redo() {
        if (!redoStack.isEmpty()) {

            Action last = redoStack.pop();

            if (last.type.equals("ADD")) {
                currentText += last.value;
            } else {
                currentText = currentText.substring(0, currentText.length() - last.value.length());
            }

            undoStack.push(last);
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display
    public void display() {
        System.out.println("Current Text: " + currentText);
    }
}

// Main class (RUNNING PART)
public class Main {
        public static void main(String[] args) {

            AdvancedEditor editor = new AdvancedEditor();
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n1. Add Text");
                System.out.println("2. Delete Text");
                System.out.println("3. Undo");
                System.out.println("4. Redo");
                System.out.println("5. Display");
                System.out.println("6. Exit");

                System.out.print("Enter choice: ");
                int choice = sc.nextInt();
                sc.nextLine(); // clear buffer

                switch (choice) {

                    case 1:
                        System.out.print("Enter text: ");
                        String text = sc.nextLine();
                        editor.add(text);
                        break;

                    case 2:
                        System.out.print("Enter number of characters to delete: ");
                        int n = sc.nextInt();
                        editor.delete(n);
                        break;

                    case 3:
                        editor.undo();
                        break;

                    case 4:
                        editor.redo();
                        break;

                    case 5:
                        editor.display();
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        return;

                    default:
                        System.out.println("Invalid choice");
                }
            }
        }
    }

