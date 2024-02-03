package academicweapon.task;

public class Todo extends Task {

    public Todo(String description) {
        super(description);
    }

    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    @Override
    public String fileToString() {
        return "T | " + super.fileToString();
    }
}