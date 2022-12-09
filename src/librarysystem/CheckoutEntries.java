package librarysystem;

import java.util.Date;

import business.Book;
import business.BookCopy;

public class CheckoutEntries {
	BookCopy book;
	Date checkoutdate;
	Date duedate;
  public CheckoutEntries(BookCopy book, Date checkoutdate, Date duedate) {
	  this.book=book;
	  this.checkoutdate=checkoutdate;
	  this.duedate=duedate;
	  System.out.println("");
  }
public BookCopy getBook() {
	return book;
}

public Date getCheckoutdate() {
	return checkoutdate;
}

public Date getDuedate() {
	return duedate;
}
  
}
