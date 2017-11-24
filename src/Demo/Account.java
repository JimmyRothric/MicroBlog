package Demo;

import java.util.ArrayList;

public class Account {
	private String userName;
	private String passWord;
//	private Message message;
	private ArrayList<Message> messageList;
	public Account() {}
	public Account(String name, String password) {
		this.userName = name;
		this.passWord = password;
		messageList = new ArrayList<Message>();
	}
//	public Account(String name, Message m) {
//		this.userName = name;
//		m.setUserName(name);
//		messageList.add(m);
//	}
	public void addMessage(Message m) {
		messageList.add(m);
	}
	public void delMessage(Message m) {
		messageList.remove(m);
	}
	public boolean verify (String username, String password) {
		if (userName.equals(username) && passWord.equals(password)) {
			return true;
		} else {
			return false;
		}
		
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
