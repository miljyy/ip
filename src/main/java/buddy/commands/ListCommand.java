package buddy.commands;

import buddy.TaskList;
import buddy.utils.Storage;
import buddy.utils.Ui;

public class ListCommand extends Command {
    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.printList(tasks.getAllTasks());
    }
}