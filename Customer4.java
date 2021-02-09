package question4;

public class Customer4 {
		private String customerName;
		private Address4 residentialAddress;
		private Address4 officialAddress;
		public Customer4() {
			super();
			customerName="John";
			}
		
		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) 
		{
			this.customerName = customerName;
		}

		public Address4 getResidentialAddress()
		{
			return residentialAddress;
		}

		public void setResidentialAddress(Address4 residentialAddress) 
		{
			this.residentialAddress = residentialAddress;
		}

		public Address4 getOfficialAddress() 
		{
			return officialAddress;
		}

		public void setOfficialAddress(Address4 officialAddress) 
		{
			this.officialAddress = officialAddress;
		}

		public String getCustomerDetails()
		{
			return ("Customer : "+customerName+ " \nResidential Address :"+residentialAddress+
					"\nOfficial Address :"+officialAddress);
			
		}
		
		public Customer4(String customerName, Address4 residentialAddress, Address4 officeAddress) {
			super();
			this.customerName = customerName;
			this.residentialAddress = residentialAddress;
			this.officialAddress = officeAddress;
		}

}
