package HotelManagement;

import java.util.Scanner;

public class Main {

		private static final String YES = "yes";
		private static final String NO = "no";

		public static void main(String[] args) {

				Scanner scaner = new Scanner(System.in);
        Hotel hotel = new Hotel();

			  // add a new customer into list
				addNewCustomerToList(hotel,scaner);

				// delete customer follow card number
				deleteCustomerFollowCardNumber(hotel,scaner);

				// caculate the amount money renting
				hotel.caculateMoneyRent();

				// view the bill to customer
				hotel.viewTheBillToCustomer();

		}

		private static void addNewCustomerToList(Hotel hotel,Scanner scanner) {

				while(true) {
						System.out.println("Please enter the information of customer");
						System.out.println("Enter name : ");
						String name = scanner.nextLine();
						System.out.println("Enter age : ");
						int age = Integer.parseInt(scanner.nextLine());
						System.out.println("Enter card number : ");
						String cardNumber = scanner.nextLine();
						System.out.println("Enter the amount of day that customer want to rent : ");
						int amountDayRent =  Integer.parseInt(scanner.nextLine());
						System.out.println("Enter the room that customer want to rent : ");
            String nameRoom = scanner.nextLine();
						Room room = null;
						if (nameRoom.equalsIgnoreCase("A")) {
								room = new RoomA();
						} else if (nameRoom.equalsIgnoreCase("B")) {
								room = new RoomB();
						} else if (nameRoom.equalsIgnoreCase("C")) {
								room = new RoomC();
						}
						hotel.addNewCustomer(new Customer(name,age,cardNumber,amountDayRent,room));
						System.out.println("Do you want to continue to add new customer ");
						String answer = scanner.nextLine();
						if (YES.equalsIgnoreCase(answer)) {
								System.out.println("Vui long tiep tuc :");
						} else if (NO.equalsIgnoreCase(answer)) {
								break;
						}
				}

		}

    private static void deleteCustomerFollowCardNumber(Hotel hotel,Scanner scanner) {
				System.out.println("Enter the card number of customer that you want to delete ");
				String cardNumber = scanner.nextLine();
				hotel.deleteCustomer(cardNumber);
		}

}







