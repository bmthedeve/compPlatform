package examQuestions.Collections;

public class Book {
	  String bookName;
	  int bookCost;
	  
	  public Book(String bookName, int bookCost){
		  this.bookName = bookName;
		  this.bookCost = bookCost;
	  }
	  public void setBookName(String bookName){
		  this.bookName = bookName;
	  }
	  public String getBookName(){
		  return bookName;
	  }
	  public void setBookCost(int bookCost){
		  this.bookCost = bookCost;
	  }
	  public int getBookCost(){
		  return bookCost;
	  }
	@Override
	public String toString(){
	    return bookName+" "+bookCost;
	  }
	  
	  
	}
