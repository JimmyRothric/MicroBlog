package Demo;

import java.util.Calendar;

import sun.util.resources.cldr.CalendarData;

public class Message {
	private String title;
	private String content;
	private String userName;
	private String time;
	
	public Message(){}
	public Message(String title, String content, String username) {
		this.title = title;
		this.content = content;
		this.userName = username;
	}
	
	public void printMessage() {
		
	}
	public String getTitle() {
		if (title == "") {
			String str = content.replace("\t|\r|\n", " ");
			if(str.length() > 15){
				return str.subSequence(0, 15) + "...";
			} else {
				return str.subSequence(0, str.length()) + "";
			}
		} else {
			return title;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String user) {
		this.userName = user;
	}
	public String getTime() {
		return time;
	}
	public void setTime() {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		this.time = hour + ":" + minute + ":" + second + "\t" + year + "-" + month + "-" + day;
	}
	public void delMessage() {
		
	}

}
