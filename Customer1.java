package question1;

public class Customer1 {
				private String customerName;
			private Address1 residentialAddress;
			
			public Customer1()
			{
				super();
				customerName="John";
			}
			

		public String getCustomerName() 
		    {
				return customerName;
			}

	        public void setCustomerName(String customerName) 
			{
				this.customerName = customerName;
			}

	        public Address1 getResidentialAddress() 
	        {
				return residentialAddress;
			}


			public void setResidentialAddress(Address1 residentialAddress) {
				this.residentialAddress = residentialAddress;
			}


			public Customer1(String customerName, Address1 residentialAddress) {
				super();
				this.customerName = customerName;
				this.residentialAddress = residentialAddress;
			}

	
		public String getCustomerDetails()
		 {
			 return ("1st Main HSR Layout,Bangalore");
		 }

		  }


