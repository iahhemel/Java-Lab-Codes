public class Restaurant implements RestaurantOperation { 
    private String restaurantName; 
    private Food[] order; 
    private int orderCount; 
    public Restaurant() { 
        order = new Food[100]; 
        orderCount = 0; 
    } 
     
    public Restaurant(String restaurantName) { 
        this(); 
        this.restaurantName = restaurantName; 
    } 
     
    public void setRestaurantName(String restaurantName) { 
        this.restaurantName = restaurantName; 
    } 
     
    public String getRestaurantName() { 
        return restaurantName; 
    } 
    public void addToOrder(Food f) { 
        if (orderCount < 100) { 
            order[orderCount++] = f; 
        } 
    } 
    public void removeFromOrder(Food f) { 
        for (int i = 0; i < orderCount; i++) { 
            if (order[i].getName().equals(f.getName())) { 
                for (int j = i; j < orderCount - 1; j++) { 
                    order[j] = order[j + 1]; 
                } 
                orderCount--; 
                break; 
            } 
        } 
    } 
    public void showOrders() { 
        System.out.println("Current Orders at " + restaurantName + ":"); 
        for (int i = 0; i < orderCount; i++) { 
            order[i].showDetails(); 
        } 
    } 
    public double calculateBill() { 
        double total = 0; 
        for (int i = 0; i < orderCount; i++) { 
            total += order[i].getPrice(); 
        } 
        return total; 
    } 
} 