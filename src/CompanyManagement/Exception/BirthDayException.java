package CompanyManagement.Exception;

public class BirthDayException extends Exception {

		String message;

		BirthDayException() {
		}

		BirthDayException(String message) {
				super(message);
				String MESSAGE = "Birthday is not valid";
				this.message = message != null ? message : MESSAGE;
		}

}
