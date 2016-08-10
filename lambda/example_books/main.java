import java.util.Collections;
import java.util.*;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingLambdasLongForm();
	}
	
	public static void usingLambdasLongForm(){
		List<Book> books = Books.all();
		Collections.sort(books, (Book b1, Book b2) -> {
			return b1.getTitle().compareTo(b2.getTitle());
		});
		for(Book book : books){
			System.out.println(book);
		}
	} 
	
	public static void usingLambdasShortForm(){
		List<Book> books = Books.all();
		Collections.sort(books, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
		books.forEach(book -> System.out.println(book));
	} 
	
	public static void methodReference(){
		List<Book> books = Books.all();
		Collections.sort(books, Comparator.comparing(Book::getTitle));
		books.forEach(System.out::println);
	}

}
