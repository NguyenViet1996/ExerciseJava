package BooksManagementSystem;

public class Book implements  IBook {

		private int id;
		private String name;
		private final String publishDate;
		private final String author;
		private final String language;
		private float averagePrice;
		private int[] priceList = new int[5];

		public Book(int id, String name, String publishDate, String author, String language, int[] priceList) {
				this.id = id;
				this.name = name;
				this.publishDate = publishDate;
				this.author = author;
				this.language = language;
				this.priceList = priceList;
		}

		public int getId() {
				return id;
		}

		public void setId(int id) {
				this.id = id;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public String getPublishDate() {
				return publishDate;
		}

		public String getAuthor() {
				return author;
		}

		public String getLanguage() {
				return language;
		}

		public float getAveragePrice() {
				return averagePrice;
		}

		public void setAveragePrice(float averagePrice) {
				this.averagePrice = averagePrice;
		}

		public void calculate() {
				float sum = 0;
				for (int i : priceList) {
						sum += i;
				}
				this.setAveragePrice(sum/priceList.length);
		}

		@Override
		public void display() {
				System.out.println( this.getId() + " The book has name : " + this.getName() + ", publish date : "
						+ this.getPublishDate() + ", author : " + this.getAuthor() + ", language : " + this.getLanguage()
						+ ", the average price : " + this.getAveragePrice());
		}

}




