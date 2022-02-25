package examQuestions.Collections;

import java.util.ArrayList;
import java.util.List;

public class Source {
	public static void main(String[] args) {
		List<Book> book = new ArrayList<>();
		book.add(new Book("Sapiens",550));
		book.add(new Book("Indistractable",400));
		book.add(new Book("Handsome Dancer",100));
		book.add(new Book("Abraham Lincoln",250));
		
		BookImplementation bi = new BookImplementation();
		System.out.println(bi.getNameOfBooks(book));
		System.out.println(bi.sumCostOfAllBooks(book));
		System.out.println(bi.getMax(book));
		
	}
}
