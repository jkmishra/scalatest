package test.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User {
	private final int id;
	private final String firstName;
	private final String lastName;
	private final Boolean active;

	public User(int id, String firstName, String lastName, boolean active) {
		this.active=active;
		this.firstName=firstName;
		this.id=id;
		this.lastName=lastName;
	}
	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Boolean getActive() {
		return active;
	}

	public static List<String> activeById(List<User> us) {
		List<User> users = new ArrayList<User>();

		for (User u : us) {
			if (u.getActive())
				users.add(u);
		}

		Collections.sort(users, new Comparator<User>() {
			public int compare(User a, User b) {
				return a.getId() - b.getId();
			}
		});

		List<String> finalUsers = new ArrayList<String>();

		for (User u : users) {
			finalUsers.add(u.getLastName());
		}

		return finalUsers;
	}

	/*public static void main(String[] args) {		

	List<User> inputUsers = new ArrayList<User>();
	inputUsers.add(new User(11, "Nick", "Smith", false));
	inputUsers.add(new User(89, "Ken", "Pratt", true));
	inputUsers.add(new User(23, "Jack", "Sparrow", true));

	List<String> activeUsersById = activeById(inputUsers);
	System.out.println(activeUsersById);
	}*/
}
