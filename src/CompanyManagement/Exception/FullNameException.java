package CompanyManagement.Exception;

public class FullNameException extends Exception {

		@Override
		public void showException() {
				System.out.println("Full Name is not valid");
		}

}
