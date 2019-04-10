package code.edu.dsm.dmacc.hw17;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {

		User guru = new User("Guru", "Setty", "Dmacc-Student");
		User sheryl = new User("Sheryl", "Parker", "Dmacc-Student");
		User tammy = new User("Tammy", "Weatherly", "Dmacc-Student");
		User nate = new User("Nate", "Buwalda", "Dmacc-Tutor");

		List<User> group = new ArrayList<User>();
		group.add(guru);
		group.add(tammy);
		group.add(sheryl);

		Task inpersonTask = new Task("Homework17", 1, nate, guru);
		TaskPerformer t1 = new InPerson();
		t1.performTask(inpersonTask, guru);

		Task officeTask = new Task("Pay fee", 2, nate, sheryl);
		TaskPerformer t2 = new AtOffice();
		t2.performTask(officeTask, sheryl);

		Task delegateTask = new Task("Do Project Combined", 3, nate, guru);
		TaskPerformer t3 = new DelegateToTrainees();
		t3.performTask(delegateTask, group);

	}

}
