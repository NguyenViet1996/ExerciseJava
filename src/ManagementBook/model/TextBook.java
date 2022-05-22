package ManagementBook.model;

public class TextBook extends Book {

    private final String status;

    public TextBook(String typeOfBook, int id, String dateImport, double price, int quantity, String author, String status) {
        super(typeOfBook, id, dateImport, price, quantity, author);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "The text book { " +
                "the id : " + this.getId() +
                ", the date of importing : " + this.getDateImport() +
                ", the price : " + this.getPrice() +
                ", the ammount : " + this.getQuantity() +
                ", the author : " + this.getAuthor() +
                ", the status : " + this.getStatus() +
                "}"
                ;
    }

    @Override
    public double caculate() {
        if (this.getStatus().equalsIgnoreCase("new")) {
            return this.getQuantity() * this.getPrice();
        } else if (this.getStatus().equalsIgnoreCase("old")) {
            return this.getQuantity() * this.getPrice() * 0.5;
        }
        return 0;
    }

}
