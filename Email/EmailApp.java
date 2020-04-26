package Email;
/**
 * This class is a tester class. 
 * @author Rahul kumar
 * @version 1.0
 * 
 * This creates a object of <code>Email</code> and call getter and setter methods.
 * User can easily verify the correctness of working of Email app. 
 */
public class EmailApp {
	/**
	 * This is main method. 
	 * @param args unused
	 */
	public static void main(String[] args) {
		// create a new object
		Email em1=new Email("Rahul","Kumar");
		
		// set parameters
		em1.setMailboxCapicity(1000);
		em1.setAltEmail("rkt82224@gmail.com");
		em1.changePass("12345678");
		System.out.print("\n");
		
		// view parameters
		em1.showInfo();
	}

}
