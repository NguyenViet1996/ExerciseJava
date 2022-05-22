package ManagementBook.model;

public class ReferenceBook extends Book {

    private final double tax;

    public ReferenceBook(String typeOfBook, int id, String dateAdd, double price, double quantity, String author, double tax) {
        super(id, dateAdd, price, quantity, author);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    @Override
    public double caculate() {
        return this.getQuantity() * this.getPrice() + this.getTax();
    };

    @Override
    public String toString() {
        return "The reference book { " +
                "the id : " + this.getId() +
                ", the date of importing : " + this.getDateImport() +
                ", the price : " + this.getPrice() +
                ", the ammount : " + this.getQuantity() +
                ", the author : " + this.getAuthor() +
                ", the tax : " + this.getTax() +
                "}"
                ;
    }

}
