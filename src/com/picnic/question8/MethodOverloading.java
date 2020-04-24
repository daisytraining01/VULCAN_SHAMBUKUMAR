package com.picnic.question8;

public class MethodOverloading implements Bank {

	@Override
	public void sbiBank(float interest) {
		// TODO Auto-generated method stub
		System.out.println("Interest rate: "+interest);
		
	}

	@Override
	public void sbiBank(float interest, int amount) {
		// TODO Auto-generated method stub
		System.out.println("Interest rate: "+interest + " "+"Amount : "+amount);
		
	}

	@Override
	public void sbiBank(float interest, int amount, String userName) {
		// TODO Auto-generated method stub
		System.out.println("Interest rate: "+interest + " "+"Amount : "+amount + "Customer Name : "+userName);
		
	}
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.sbiBank(5.5f);
		obj.sbiBank(4.5f, 5000);
		obj.sbiBank(6f, 4500, "John");
	}

}

/*Output : 
	Interest rate: 5.5
	Interest rate: 4.5 Amount : 5000
	Interest rate: 6.0 Amount : 4500Customer Name : John
*/