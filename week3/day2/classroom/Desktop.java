package week3.day2.classroom;

public class Desktop implements HardWare, Software {
	public void desktopModel() {
		// TODO Auto-generated method stub
      System.out.println("Dell");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Desktop desk=new Desktop();
     desk.softwareResources();
     desk.hardwareResources();
     desk.desktopModel();
	}

	public void softwareResources() {
		System.out.println("23");
		
	}

	public void hardwareResources() {
		System.out.println("40");
		
	}

}
