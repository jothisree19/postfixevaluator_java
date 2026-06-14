package demo;


	interface notify{
		void sendNotification();
	}

class SMS implements notify{
	public void sendNotification() {
		System.out.println("SMS notification is sent");
	}
}

class Email implements notify{
	public void sendNotification() {
		System.out.println("Email notification is sent");
	}
}
public class notification{
	public static void main(String args[]) {
		SMS s=new SMS();
		s.sendNotification();
		Email e=new Email();
		e.sendNotification();
	}
}
