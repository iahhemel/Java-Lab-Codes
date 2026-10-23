public class Start {
   public static void main(String[] args) {
       
       StoryBook sb1 = new StoryBook("S101", "Harry Potter", "J.K. Rowling", 800, 5, "Fantasy");
       StoryBook sb2 = new StoryBook("S102", "Goosebumps", "R.L. Stine", 450, 10, "Horror");
       StoryBook sb3 = new StoryBook("S103", "Sherlock Holmes", "Arthur Conan Doyle", 600, 3, "Mystery");
       StoryBook sb4 = new StoryBook("S104", "hdffhdbd", "Rick Riordan", 700, 4, "Adventure");
       StoryBook sb5 = new StoryBook("S105", "Alice in Wonderland", "Lewis Carroll", 500, 6, "Classic");
       
       TextBook tb1 = new TextBook("T101", "Physics", "Halliday", 950, 2, 12);
       TextBook tb2 = new TextBook("T102", "Mathematics", "Thomas", 900, 4, 11);
       TextBook tb3 = new TextBook("T103", "Biology", "Camll", 850, 3, 10);
       TextBook tb4 = new TextBook("T104", "Chemistry", "Zul", 1000, 1, 12);
       TextBook tb5 = new TextBook("T105", "Computer Science", "Sicn", 1200, 5, 11);
       
       BookShop shop = new BookShop("AIUB Bookstore");
       
       shop.insertBook(sb1);
       shop.insertBook(sb2);
       shop.insertBook(sb3);
       shop.insertBook(sb4);
       shop.insertBook(sb5);
       shop.insertBook(tb1);
       shop.insertBook(tb2);
       shop.insertBook(tb3);
       shop.insertBook(tb4);
       shop.insertBook(tb5);
       
       shop.showAllBooks();
       
      
   }
}