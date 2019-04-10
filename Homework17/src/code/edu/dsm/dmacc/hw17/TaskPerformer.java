package code.edu.dsm.dmacc.hw17;

import java.util.List;

public abstract class TaskPerformer {

	abstract void performTask(Task task, User user);

	abstract void performTask(Task task, List<User> users);
}
