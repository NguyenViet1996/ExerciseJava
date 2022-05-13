package CompanyManagement.Exception;

public class PhoneException extends Exception{

		@Override
		public void showException() {
				System.out.println("The phone number is not valid");
		}

}
