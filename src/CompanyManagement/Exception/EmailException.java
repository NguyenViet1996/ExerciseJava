package CompanyManagement.Exception;

public class EmailException extends Exception{

		@Override
		public void showException() {
				System.out.println("Email is not valid");
		}

}
