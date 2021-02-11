

import java.util.*;

class Chatroom {
	private String name;
	private Set<String> username;
	private List<String> messages;

	{
		name = "";
		username = new HashSet<String>();
		messages = new ArrayList<String>();
	}

	public void addUsername(String username) {
		this.username.add(username);
	}

	public boolean removeUser(String username) {
	    if(this.username.contains(username)) {
			this.username.remove(username);
			return true;
		}
		return false;
	}
	
	public void addMessage(String msg) {
		this.messages.add(msg);
	}

	public String getName() {
		return name;
	}

	public Set<String> getUsername() {
		return username;
	}

	public List<String> getMessages() {
		return messages;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

class User {

	private String username;
	private String password;
	private String firstName;
	private String lastName;

	public User(String username, String password, String firstName, String lastName) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

}

class ChatApplication {

	private Map<String, Chatroom> chatrooms = new HashMap<String, Chatroom>();
	private Map<String, User> users = new HashMap<String, User>();
	private Set<String> loggedInUsers = new HashSet<String>();

	Set<Map.Entry<String, User>> userEntry = users.entrySet();
	Set<Map.Entry<String, Chatroom>> chatEntry = chatrooms.entrySet();

	public boolean isChatroomNameValid(String name) {
	for (Map.Entry<String, Chatroom> chat : chatEntry) {
			Chatroom values = chat.getValue();
			if(values.getName().equals(name)) {
				return true;
			}
		}
		
		return true; 
		
	}

	public boolean isUsernameExists(String username) {
	    for (Map.Entry<String, Chatroom> chat : chatEntry) {
			Chatroom values = chat.getValue();
			if(values.getUsername().equals(username)) {
				return true;
			}
		}
		return false;
	}

	public boolean authenticateUser(String username, String password) {
	    
	    for (Map.Entry<String, User> user : userEntry) {
			User values = user.getValue();
			if(values.getUsername().equals(username) && values.getUsername().equals(password)){
			    return true;
			}
		}
		return false;
	}

	// UI Methods 
	public void createChatroom() {
		Chatroom chatroom1 = new Chatroom();
		chatroom1.addUsername("Alpha");
		chatrooms.put("Chat1", chatroom1);

	}

	public void addNewUser() {
		User user1 = new User("Niall", "11122", "Alpha", "Horan");
		User user2 = new User("Liam", "22233", "Liam", "Payne");
		User user3 = new User("Harry", "33344", "Harry", "Styles");
		User user4 = new User("Louis", "44455", "Louis", "Tomlinson");
		users.put("User1", user1);
		users.put("User2", user2);
		users.put("User3", user3);
		users.put("User4", user4);

	}

	public boolean login() {
		String login = "Niall";
		String pass = "11122";
	
		for (Map.Entry<String, User> user : userEntry) {
			User values = user.getValue();
			return values.getUsername().equals(login) && values.getUsername().equals(pass);
		}
		return false;

	}

	public void sendMessage() {
		String msg = "Hey";
		for (Map.Entry<String, Chatroom> chat : chatEntry) {
			Chatroom values = chat.getValue();
			values.addMessage(msg);
		}
	}

	public void printMessages() {
		for (Map.Entry<String, Chatroom> chat : chatEntry) {
			Chatroom values = chat.getValue();
			System.out.println(values.getMessages());
		}
		
	}

	public void listUsersFromChatroom() {
	}

	public void logout() {
	}

	public void deleteUser() {
		users.remove("User1");
	}

	public void menu() {
	}
}

public class Assignment3Q6 {
	public static void main(String[] args) {


		ChatApplication chatApp = new ChatApplication();
		chatApp.createChatroom();
		chatApp.addNewUser();
		chatApp.login();
		chatApp.sendMessage();
		chatApp.printMessages();
	}

}