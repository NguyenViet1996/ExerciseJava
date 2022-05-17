package BooksManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class ManagerBook {

		private final List<Book> listBook;

    public ManagerBook() {
				this.listBook = new ArrayList<>();
		}

		public void insertNewBook(Book book) {
				this.listBook.add(book);
		}

		public int findMaxId() {
				int max = 0;
				if (this.listBook.size() > 0) {
						for (Book book : this.listBook) {
								if (max < book.getId()) {
										max = book.getId();
								}
						}
				}
				return max;
		}

		public void viewListBook() {
				System.out.println("List of books: ");
				for (Book book : this.listBook) {
						book.display();
				}
		}

		public void calculateAveragePrice() {
				if (this.listBook.size() != 0) {
						for (Book book : this.listBook) {
								book.calculate();
						}
				} else {
						System.out.println("The list of book has no books");
				}
		}

}
