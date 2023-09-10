package buddy.commands;

import java.time.LocalDate;

import buddy.Event;
import buddy.TaskList;
import buddy.utils.BuddyException;
import buddy.utils.Storage;
import buddy.utils.Ui;

public class AddEventCommand extends Command {
    private String description;
    private LocalDate eventStart;
    private LocalDate eventEnd;

    public AddEventCommand(String description, LocalDate eventStart, LocalDate eventEnd) {
        this.description = description;
        this.eventStart = eventStart;
        this.eventEnd = eventEnd;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws BuddyException {
        Event event = new Event(description, eventStart, eventEnd, false);
        tasks.addTask(event);
        ui.printAddSuccessMessage(event, tasks);
        storage.writeToFile(tasks.getAllTasks());
    }
}
