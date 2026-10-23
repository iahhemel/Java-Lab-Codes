public class Pizza extends Food {
    private int sizeInInches;

    public Pizza() {
        super();
    }
    
    public Pizza(String name, String[] ingredients, double price, float calories, int sizeInInches) {
        super(name, ingredients, price, calories);
        this.sizeInInches = sizeInInches;
    }

    public void setSize(int sizeInInches) {
        this.sizeInInches = sizeInInches;
    }
    
    public int getSize() {
        return sizeInInches;
    }

    public void showDetails() {
        System.out.println("Pizza Details:");
        System.out.println("Name: " + getName());
        System.out.println("Size: " + sizeInInches + " inches");
        System.out.println("Price: $" + getPrice());
        System.out.println("Calories: " + getCalories() + "kcal");
        System.out.print("Ingredients: ");
        for (String ingredient : getIngredients()) {
            System.out.print(ingredient + ", ");
        }
        System.out.println("\n-------------------");
    }
}
