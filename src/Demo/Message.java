package Demo;

public class Message {
	private String title;
	private String content;
	private String user;
	private String time;
	public Message(){}
	public Message(String title, String content, String user) {
		this.title = title;
		this.content = content;
		this.user = user;
	}
	
	public String printMessage() {
		return  user + ":\n\t" + content + "\n";
	}
	public String getTitle() {
		if(content.length() > 10){
			return (String) content.subSequence(0, 10) + "...";
		} else {
			return (String) content.subSequence(0, 10);
		}
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
//	public static void main(String[] args) {
//		Message m = new Message();
//		m.setContent("it's a new");
//		System.out.println(m.getTitle());
//	}
	
	
}
