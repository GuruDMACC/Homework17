package code.edu.dsm.dmacc.hw17;

import java.util.List;

public class InPerson extends TaskPerformer {

	@Override
	void performTask(Task task, User user) {
		System.out.println("performTask in Inperson - User only");
		System.out.println(user);
		System.out.println(task);

	}

	@Override
	void performTask(Task task, List<User> users) {
		System.out.println("performTask in Inperson - List<User> only");
		System.out.println(users);
		System.out.println(task);

	}

}
