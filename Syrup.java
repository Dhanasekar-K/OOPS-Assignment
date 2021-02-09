package question5;


	public class Syrup extends Medicine{

		public Syrup() 
		{
			super();
			price=200;			
		}

		public Syrup(double price)
		{
			super(price);
			
		}

		@Override
		public void displayLabel()
		{
			
			System.out.println("Syrup"+"\n"+"Shake well before use");
			
		}

	}
	

