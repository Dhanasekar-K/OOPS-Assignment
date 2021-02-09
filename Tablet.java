package question5;

public class Tablet extends Medicine{

	public Tablet() {
		super();
		price=80;
	}

	public Tablet(double price) 
	{
		super(price);
	
	}

	@Override
	public void displayLabel() 
	{
		System.out.println("Tablet"+"\n"+"Store in dry place");
	}

}
