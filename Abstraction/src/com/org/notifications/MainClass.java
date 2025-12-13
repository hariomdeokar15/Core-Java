package com.org.notifications;

public class MainClass {

	public static void main(String[] args) {
		Notification e = new EmailNotification();
		e.send();
		
		Notification s = new SmsNotification();
		s.send();

	}

}
