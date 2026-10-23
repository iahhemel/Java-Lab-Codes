

public class Start {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant("AIUB Food Court");
        
        Drinks d1 = new Drinks("Cola", new String[]{"Carbonated Water", "Sugar", "Caramel Color"}, 1.99, 150, "Soda", 1);
        Drinks d2 = new Drinks("Orange Juice", new String[]{"Orange", "Water", "Sugar"}, 2.49, 120, "Juice", 1);
        Drinks d3 = new Drinks("Iced Tea", new String[]{"Tea", "Water", "Sugar", "Lemon"}, 1.79, 90, "Tea", 1);
        Drinks d4 = new Drinks("Coffee", new String[]{"Coffee Beans", "Water", "Sugar", "Milk"}, 2.99, 80, "Hot Drink", 1);
        Drinks d5 = new Drinks("Milkshake", new String[]{"Milk", "Ice Cream", "Chocolate Syrup"}, 3.49, 350, "Dessert Drink", 1);

        Burger b1 = new Burger("Cheeseburger", new String[]{"Beef Patty", "Cheese", "Lettuce", "Tomato"}, 4.99, 550, 1);
        Burger b2 = new Burger("Double Burger", new String[]{"Beef Patty", "Beef Patty", "Cheese", "Onion"}, 6.99, 750, 2);
        Burger b3 = new Burger("Chicken Burger", new String[]{"Chicken Patty", "Lettuce", "Mayonnaise"}, 5.49, 450, 1);
        Burger b4 = new Burger("Bacon Burger", new String[]{"Beef Patty", "Bacon", "Cheese", "BBQ Sauce"}, 7.49, 650, 1);
        Burger b5 = new Burger("Veggie Burger", new String[]{"Veggie Patty", "Lettuce", "Tomato", "Onion"}, 5.99, 350, 1);

        Pizza p1 = new Pizza("Margherita", new String[]{"Tomato Sauce", "Mozzarella", "Basil"}, 8.99, 850, 12);
        Pizza p2 = new Pizza("Pepperoni", new String[]{"Tomato Sauce", "Mozzarella", "Pepperoni"}, 10.99, 950, 12);
        Pizza p3 = new Pizza("Vegetarian", new String[]{"Tomato Sauce", "Mozzarella", "Mushrooms", "Bell Peppers"}, 9.99, 800, 12);
        Pizza p4 = new Pizza("Hawaiian", new String[]{"Tomato Sauce", "Mozzarella", "Ham", "Pineapple"}, 11.49, 900, 14);
        Pizza p5 = new Pizza("Meat Lovers", new String[]{"Tomato Sauce", "Mozzarella", "Pepperoni", "Sausage", "Bacon"}, 12.99, 1100, 14);

        restaurant.addToOrder(d1);
        restaurant.addToOrder(d2);
        restaurant.addToOrder(b1);
        restaurant.addToOrder(b2);
        restaurant.addToOrder(p1);
        restaurant.addToOrder(p2);

        System.out.println("Welcome to " + restaurant.getRestaurantName() + "\n");

        restaurant.showOrders();

        System.out.printf("Total Bill: $%.2f\n", restaurant.calculateBill());

        System.out.println("\nRemoving Orange Juice from order...");
        restaurant.removeFromOrder(d2);

        restaurant.showOrders();
        System.out.printf("Updated Bill: $%.2f\n", restaurant.calculateBill());

        System.out.println("\nModifying Cheeseburger ingredients:");
        b1.showDetails();
        
        System.out.println("\nAdding 'Pickles' to Cheeseburger");
        b1.addIngredient("Pickles");
        b1.showDetails();
        
        System.out.println("\nRemoving 'Tomato' from Cheeseburger");
        b1.removeIngredient("Tomato");
        b1.showDetails();

        System.out.println("\nPolymorphism Demonstration:");
        Food polyFood1 = new Drinks("Mineral Water", new String[]{"Water"}, 1.00, 0, "Water", 1);
        Food polyFood2 = new Pizza("Cheese", new String[]{"Tomato Sauce", "Mozzarella"}, 7.99, 700, 10);
        
        System.out.println("\nCalling showDetails() on polymorphic Drink:");
        polyFood1.showDetails();
        
        System.out.println("\nCalling showDetails() on polymorphic Pizza:");
        polyFood2.showDetails();
    }
}