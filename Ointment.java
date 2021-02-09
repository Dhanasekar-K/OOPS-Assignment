package question5;

public class Ointment extends Medicine{
	

	public Ointment() {
		super();
		price=50;
		
	}

	public Ointment(double price) 
	{
		super(price);
		
	}

	@Override
	public void displayLabel() 
	{
		System.out.println("Ointment"+"\n"+"For external use only");
	}

}

