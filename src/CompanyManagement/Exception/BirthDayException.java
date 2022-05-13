package CompanyManagement.Exception;

public class BirthDayException extends Exception {

		@Override
		public void showException() {
				System.out.println("Birthday is not valid");
		}

}
