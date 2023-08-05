package org.bankweek3day1assignment;

public class AxisBank extends BankInfo
{
	public void deposite(int depositeAmount)
	{
		
		System.out.println("Minimum Deposite per day in Axis Bank :"+depositeAmount);
		super.deposite(depositeAmount);
	}
	public static void main(String[] args) {
		 AxisBank obj=new AxisBank();
		 obj.saving(10);
		 obj.fixed(200000);
		 
		 obj.deposite(3500);
		 
		 
	}

}
