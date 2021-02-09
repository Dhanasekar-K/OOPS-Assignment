package question2;


class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

public class BookDetails {

	public static void main(String[] args) {
		
Book b=new Book();
b.setBookNo(309);
b.setTitle("Java");
b.setAuthor("Danny");
b.setPrice(499);

System.out.println("Book No:"+b.getBookNo());
System.out.println("Title:"+b.getTitle());
System.out.println("Author Name:"+b.getAuthor());
System.out.println("Price:"+b.getPrice());

EngineeringBook e=new EngineeringBook();
e.setCategory("Programming Language");
System.out.println("Category:"+e.getCategory());


	}

}
