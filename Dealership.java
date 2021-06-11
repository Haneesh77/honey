package project1;

public class Dealership {

	public static void main(String[] args) {
		
		
		Custemer cust=new Custemer();
		cust.setName("hony");
		cust.setAddress("123 nothing street");
		cust.setCashOnHand(15000.0);
		
		Vehicles vehicle =new Vehicles();
		vehicle.setBrand("honda");
		vehicle.setPrice(25000.0);
		vehicle.setModel("cb");
		
		Employee emp=new Employee();
		cust.purchasecar(vehicle, emp, true);
	

}
}
