package week1.day1.classroom;

public class Mobile {
	
	String mobileModel="SamsungA70";
	int mobileWeight=100;
	boolean isFullCharge=true;
	double mobileCost=60000.45;
	public void makeCall() {
		System.out.println("Make a call");

	}
	
	public void sendMsg() {
		System.out.println("Sending the message");
	}
	public static void main(String[] args) {
	     Mobile mobile=new Mobile();
	     mobile.makeCall();
	     mobile.sendMsg();
	     System.out.println(mobile.mobileModel);
	     System.out.println(mobile.mobileWeight);
	     System.out.println(mobile.isFullCharge);
	     System.out.println(mobile.mobileCost);
	}

}
