public class Drinks extends Food {
    private String type;
    private int sizeInLiter;

    public Drinks() {
        super();
    }
    
    public Drinks(String name, String[] ingredients, double price, float calories, String type, int sizeInLiter) {
        super(name, ingredients, price, calories);
        this.type = type;
        this.sizeInLiter = sizeInLiter;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void setSize(int sizeInLiter) {
        this.sizeInLiter = sizeInLiter;
    }
    
    public String getType() {
        return type;
    }
    
    public int getSize() {
        return sizeInLiter;
    }

    public void showDetails() {
        System.out.println("Drink Details:");
        System.out.println("Name: " + getName());
        System.out.println("Type: " + type);
        System.out.println("Size: " + sizeInLiter + "L");
        System.out.println("Price: $" + getPrice());
        System.out.println("Calories: " + getCalories() + "kcal");
        System.out.print("Ingredients: ");
        for (String ingredient : getIngredients()) {
            System.out.print(ingredient + ", ");
        }
        System.out.println("\n-------------------");
    }
}
