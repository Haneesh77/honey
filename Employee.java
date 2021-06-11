package project1;

public class Employee {
	
	public void service(Vehicles vehicle,boolean finance,Custemer cust)
	{
		if(finance==true)
		{
			double loan=vehicle.getPrice()-cust.getCashOnHand();
			creditloan(cust,loan);
		}
		else if(vehicle.getPrice()<=cust.getCashOnHand())
		{
			System.out.println("car is purchased");
		}
		else
		{
			System.out.println("go home and get extra money");
		}
		
	}
	public void creditloan(Custemer cust,double loan)
	{
		System.out.println("loan is generated");
	}

}
