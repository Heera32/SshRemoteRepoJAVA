package day2;

public class CustomerMain {
	

Customer CreateCustomer(int CustomerId,String CustomerName,String CustomerAddress){
	Customer customer=new Customer();
	customer.setCustomerId(CustomerId);
	customer.setCustomerName(CustomerName);
	customer.setCustomerAddress(CustomerAddress);
	return customer;	
}
public void display(Customer customer)
{

	System.out.println("Customer Id , Name, Address ::"+customer.getCustomerId()+" "+customer.getCustomerName()+" "+ customer.getCustomerAddress());
}

	public static void main(String[] args) {
		
		CustomerMain customermain=new CustomerMain();
		Customer customer1=customermain.CreateCustomer(1, "Ammu", "Kerala");
		Customer customer2=customermain.CreateCustomer(2, "Meetha", "udaiii");
		System.out.println("Customer Details");
		customermain.display(customer1);
		customermain.display(customer2);
		
		
	}

}
