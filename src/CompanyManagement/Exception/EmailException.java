package CompanyManagement.Exception;

public class EmailException extends Exception {

		EmailException() {
		}

		EmailException(String message) {
				super(message);
				String MESSAGE = "Email is not valid";
				message = message != null ? message : MESSAGE;
		}

}
