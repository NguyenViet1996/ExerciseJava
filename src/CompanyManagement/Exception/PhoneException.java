package CompanyManagement.Exception;

public class PhoneException extends Exception{

	   PhoneException() {
	   }

	   PhoneException(String message) {
				 super(message);
				 String MESSAGE = "The phone number is not valid";
				 message = message !=null ? message : MESSAGE;
		 }

}
