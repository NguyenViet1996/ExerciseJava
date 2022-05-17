package BooksManagementSystem;

import java.util.Scanner;

public class Main {

		private static final String YES = "yes";
		private static final String NO = "no";

		public static void main(String[] args) {

				Scanner scanner = new Scanner(System.in);
				ManagerBook manager = new ManagerBook();

				while (true) {
						System.out.print("Menu options : 1.Insert new book , 2.View list of books , 3.Caculate average, 4.Exit ");
						int selectUser = Integer.parseInt(scanner.nextLine());
						if (selectUser == 1) {
								createListBook(manager, scanner);
						} else if (selectUser == 2) {
								manager.viewListBook();
						} else if (selectUser == 3) {
								manager.calculateAveragePrice();
						} else if (selectUser == 4) {
								break;
						}
				}

		}

		private static void createListBook(ManagerBook manager, Scanner scanner) {
				while (true) {
						System.out.println("Enter the information of book : ");
						System.out.print("Enter name : ");
						String name = scanner.nextLine();
						System.out.print("Enter publish date : ");
						String publishDate = scanner.nextLine();
						System.out.print("Enter the name of author : ");
						String author = scanner.nextLine();
						System.out.print("Enter language : ");
						String language = scanner.nextLine();
						System.out.println("Enter the first price ");
						int firstPrice = Integer.parseInt(scanner.nextLine());
						System.out.println("Enter the second price : ");
						int secondPrice = Integer.parseInt(scanner.nextLine());
						System.out.println("Enter the third price : ");
						int thirdPrice = Integer.parseInt(scanner.nextLine());
						System.out.println("Enter the fourth price");
						int fourthPrice = Integer.parseInt(scanner.nextLine());
						System.out.println("Enter the fifth price : ");
						int fifthPrice = Integer.parseInt(scanner.nextLine());
						manager.insertNewBook(new Book(manager.findMaxId()+1,name,publishDate,author,language,
								new int[]{firstPrice, secondPrice, thirdPrice, fourthPrice, fifthPrice}));
						System.out.println("Do you want to continue : (yes/no) ");
						String answer = scanner.nextLine();
						if (YES.equalsIgnoreCase(answer)) {
								System.out.println("Please continue : ");
						} else if (NO.equalsIgnoreCase(answer)) {
								break;
						}
				}
		}

}
