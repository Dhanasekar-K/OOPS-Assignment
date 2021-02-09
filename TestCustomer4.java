package question4;

public class TestCustomer4 {

	public static void main(String[] args) {
		Customer4 c=new Customer4("John",new Address4("1st Main HSR Layout","Banglore"),new Address4("1st Main Electronics city","Banglore"));
		c.setCustomerName("john");
		
		System.out.println(c.getCustomerDetails());
	}


	}


