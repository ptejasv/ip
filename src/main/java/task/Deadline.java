package task;

public class Deadline extends Task {
    private String by;

    /**
     * Creates a new task.Task object to be stored in taro's list of Tasks,
     * sets the name of the task as the name passed in by the user and
     * marks the task as incomplete
     *
     * @param description the name of the task to be created
     * @param by the date or time by the task is to be done
     */
    public Deadline(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + this.by + ")";
    }
}
