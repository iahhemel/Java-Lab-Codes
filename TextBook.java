public class TextBook extends Book {
   private int standard;
   public TextBook() {}
   public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard) {
       super(isbn, bookTitle, authorName, price, availableQuantity);
       this.standard = standard;
   }
   public void setStandard(int standard) { this.standard = standard; }
   public int getStandard() { return standard; }
   public void showDetails() {
       System.out.println("Text Book Details:");
       System.out.println("ISBN: " + getIsbn());
       System.out.println("Title: " + getBookTitle());
       System.out.println("Author: " + getAuthorName());
       System.out.println("Price: " + getPrice());
       System.out.println("Quantity: " + getAvailableQuantity());
       System.out.println("Standard: " + getStandard());
   }
}