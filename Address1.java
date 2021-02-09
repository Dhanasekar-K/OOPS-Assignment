package question1;


class Address1
	  {
	   private String addressLine;
	    private String city;

	public Address1(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}
    public String getAddressLine() 
	{
		return addressLine;
	}
    public void setAddressLine(String addressLine)
	{
		this.addressLine = addressLine;
	}
    public String getCity() 
	{
		return city;
	}
    public void setCity(String city) 
    {
		this.city = city;
	}

    public String getAddressDetails()
	{
	  return ("Address Details:"+addressLine+","+city);
	}
	  }


	
	
	

