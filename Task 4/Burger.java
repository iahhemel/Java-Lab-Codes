public class Burger extends Food {
    private int numberOfPatty;

    public Burger() {
        super();
    }
    
    public Burger(String name, String[] ingredients, double price, float calories, int numberOfPatty) {
        super(name, ingredients, price, calories);
        this.numberOfPatty = numberOfPatty;
    }

    public void setNumberOfPatty(int numberOfPatty) {
        this.numberOfPatty = numberOfPatty;
    }
    
    public int getNumberOfPatty() {
        return numberOfPatty;
    }

    public void showDetails() {
        System.out.println("Burger Details:");
        System.out.println("Name: " + getName());
        System.out.println("Number of Patties: " + numberOfPatty);
        System.out.println("Price: $" + getPrice());
        System.out.println("Calories: " + getCalories() + "kcal");
        System.out.print("Ingredients: ");
        for (String ingredient : getIngredients()) {
            System.out.print(ingredient + ", ");
        }
        System.out.println("\n-------------------");
    }
}
