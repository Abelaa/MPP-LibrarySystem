package librarysystem;

import java.util.List;

public class CheckoutRecord {
	List<CheckoutEntries> checkoutEntries;
   public CheckoutRecord(List<CheckoutEntries> checkoutEntries) {
	   this.checkoutEntries=checkoutEntries;
   }
   public List<CheckoutEntries> geCheckoutEntries() {
	   return checkoutEntries;
   }
}
