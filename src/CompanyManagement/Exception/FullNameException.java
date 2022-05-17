package CompanyManagement.Exception;

public class FullNameException extends Exception {

    FullNameException() {
		}

		FullNameException(String message) {
				super(message);
				String MESSAGE = "Full of name is not valid ";
				message = message != null ? message : MESSAGE;
		}

}
