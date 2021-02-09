package question5;

public abstract class Medicine {

	double price;

	public Medicine() {
		super();
				
	}
	public Medicine(double price) {
		super();
		this.price = price;
	}
	public void getDetails(){
		System.out.println("Price = "+price+"");
	}
	public abstract void displayLabel();
	

}
	

