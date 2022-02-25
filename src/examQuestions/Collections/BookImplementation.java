package examQuestions.Collections;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookImplementation {
	public String getNameOfBooks(List<Book> books){
//		  return books.stream().collect(Collectors.toList()).toString();
		StringBuilder sb = new StringBuilder();
	    for(int i=0;i<books.size();i++){
	      Book b = books.get(i);
	      String bName = b.getBookName();
	      String bCost = Integer.toString(b.getBookCost());

	      sb.append(bName);
	      sb.append(" ");
	      sb.append(bCost);
	    }
	    String s = new String(sb);
	      return s;
	  }

	  public int sumCostOfAllBooks(List<Book> books){
		  return books.stream().collect(Collectors.summingInt(Book::getBookCost));
	  }
	  public int getMax(List<Book> books){
		  return books.stream().max((o1,o2)->o1.getBookCost()-o2.getBookCost()).get().getBookCost();
	  }
	}
