package Demo;

import java.util.Calendar;

import sun.util.resources.cldr.CalendarData;

public class Message {
	private String title;
	private String content;
	private String userName;
	private String time;
	private String comment;
	private int like;
	
	public Message(){}
	public Message(String title, String content, String username) {
		this.title = title;
		this.content = content;
		this.userName = username;
	}
	public boolean isAdmin(String name) {	//judge the user authority
		if (name.equals("admin")) {
			return true;
		} else {
			return false;
		}
	}
	public String getMessage() {
		StringBuffer message = new StringBuffer("");
		message.append("<big><b>" + userName+ "</b></big>\t<small>" + time + "</small>");
		message.append("<br/><big>" + title + "</big>");
		message.append("<br/><pre>" + content + "</pre>");
		return message.toString();
	}
	public String printMessage(Message m, String name, int i) {
		StringBuffer message = new StringBuffer("");
//		for (int i = 0; i < ) {
		message.append("<b>" + m.getUserName()+ "</b>\t<small>" + m.getTime() + "</small>");
		message.append("<br/><pre>" + m.getTitle() + "</pre>");
		message.append("<input type=\"submit\" name=\"checkBtn" + i + "\" value=\"查看 \"/>");
		if (isAdmin(name) || m.getUserName().equals(name)) {
			message.append("<input type=\"submit\" name=\"deleteBtn" + i + "\" value=\"删除 \"/>");
		}
		message.append("</p>");		
//		}
		
		return message.toString();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle() {
		if (title == "") {
			String str = content.replace("\t|\r|\n", " ");
			if(str.length() > 15){
				this.title = str.subSequence(0, 15) + "...";
			} else {
				this.title =  str.subSequence(0, str.length()) + "";
			}
		} else {
			return;
		}
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
