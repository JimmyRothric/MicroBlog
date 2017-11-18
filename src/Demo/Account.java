package Demo;

public class Account {
	private String userName;
	private String passWord;
	private Message message;
	public Account() {}
	
	public Account(String name, Message m) {
		this.userName = name;
		this.message = m;
		this.message.setUserName(name);
	}
	public boolean isverify () {
		return true;
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
