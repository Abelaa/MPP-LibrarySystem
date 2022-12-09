package business;

import java.io.Serializable;
import java.time.LocalDate;


import dataaccess.DataAccess;
import dataaccess.DataAccessFacade;
import librarysystem.CheckoutRecord;

final public class LibraryMember extends Person implements Serializable {
	private String memberId;
	private CheckoutRecord checkoutRecord;
	public LibraryMember(String memberId, String fname, String lname, String tel,Address add, CheckoutRecord checkoutRecord) {
		super(fname,lname, tel, add);
		this.memberId = memberId;	
		this.checkoutRecord=checkoutRecord;
	}
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setCheckoutRecord(CheckoutRecord checkoutRecord) {
		this.checkoutRecord = checkoutRecord;
	}
     public CheckoutRecord getCheckoutRecord() {
    	 return checkoutRecord;
     }
	
	
	@Override
	public String toString() {
		return "Member Info: " + "ID: " + memberId + ", name: " + getFirstName() + " " + getLastName() + 
				", " + getTelephone() + " " + getAddress();
	}

	private static final long serialVersionUID = -2226197306790714013L;
}
