package Demo;

public class Account {
	private String userName;
	private String passWord;
	private Message message;
	public Account() {}
	public Account(String name, String password) {
		this.userName = name;
		this.passWord = password;
	}
	public Account(String name, Message m) {
		this.userName = name;
		this.message = m;
		this.message.setUserName(name);
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
