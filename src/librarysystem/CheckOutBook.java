package librarysystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import business.Book;
import business.BookCopy;
import business.ControllerInterface;
import business.LibraryMember;
import business.SystemController;
import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;

public class CheckOutBook {
	private static final long serialVersionUID = 11L;
	public static final CheckOutBook INSTANCE = new CheckOutBook();
    ControllerInterface ci = new SystemController();
    private boolean isInitialized = false;
    
    private CheckOutBook() {}
    
	 @SuppressWarnings("unchecked")
	public void init() throws Exception {
		System.out.println("please enter user ID");
		Scanner scanner= new Scanner(System.in);
		String typedmember_ID=scanner.next();
	    System.out.println("Please enter Book ISBN");
	    String typedbookIsbn=scanner.next();
	   
	    DataAccess da=new DataAccessFacade();
	    Collection<LibraryMember> members=da.readMemberMap().values();
	    Collection<Book> books = da.readBooksMap().values();
	    Book book = da.readBooksMap().get(typedbookIsbn);
	    LibraryMember member=da.readMemberMap().get(typedmember_ID);
	    if(book == null)
	    	return;
	    if(member==null)
	    	return;
	    
	   List<BookCopy> bookCopies = book.getAvailableCopies();
	   if(bookCopies.size() == 0)
		   return;
	   
	   LocalDate date;
	   
	    Scanner scanner1=new Scanner(System.in);
	    System.out.println("Enter Checkout date: in the form of dd/MM/YYYY");
	    String dateString = scanner1.nextLine();
	    //System.out.println(dateString);
	    //DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    Date datecheckout=new SimpleDateFormat("dd/MM/yyyy").parse(dateString);
	    
	    System.out.println("Enter Checkout date: in the form of dd/MM/YYYY");
	    String dateString1 = scanner1.nextLine();
	    Date duedate=new SimpleDateFormat("dd/MM/yyyy").parse(dateString1); 
	    
	    List <CheckoutEntries> checkoutEntries =new ArrayList<>();
	    
	    checkoutEntries.add(new CheckoutEntries(bookCopies.get(0),datecheckout,duedate));
	    CheckoutRecord checkoutRecord=new CheckoutRecord(checkoutEntries);
	    member.setCheckoutRecord(checkoutRecord);
	    bookCopies.get(0).changeAvailability();
	    System.out.println("Member Id: "+ member.getMemberId());
	    //System.out.println(bookCopies.get(0).isAvailable());
	    //System.out.println(bookCopies.get(0).getBook().getIsbn());
	    
	    //System.out.println(checkoutRecord.geCheckoutEntries().book.getBook().getMaxCheckoutLength());
	  
	 }
}
