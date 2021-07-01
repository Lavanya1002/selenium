package week3.day1.Assignment.org.college;

public class AxisBank extends BankInfo{
	
	public void deposit(int amt) {
		// TODO Auto-generated method stub
     System.out.println("deposit Amount"+amt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AxisBank bank=new AxisBank();
      bank.deposit(10000);
      bank.saving("lavan");
      bank.fixed();
	}

}
