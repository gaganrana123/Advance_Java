public class lab2 {
    private String customerName;
    private String pizzaSize;
    private String topping;

    // Constructor
    public lab2(String customerName, String pizzaSize, String topping) {
        this.customerName = customerName;
        this.pizzaSize = pizzaSize;
        this.topping = topping;
    }

    // Getter for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Setter for customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    // Getter for pizzaSize
    public String getPizzaSize() {
        return pizzaSize;
    }

    // Setter for pizzaSize
    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    // Getter for topping
    public String getTopping() {
        return topping;
    }

    // Setter for topping
    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "customerName='" + customerName + '\'' +
                ", pizzaSize='" + pizzaSize + '\'' +
                ", topping='" + topping + '\'' +
                '}';
    }

    // Main method to test the Pizza class
    public static void main(String[] args) {
        // Create a Pizza object
        lab2 myPizza = new lab2("John Doe", "Large", "Pepperoni");

        // Print the pizza details
        System.out.println(myPizza);

        // Modify the pizza details
        myPizza.setCustomerName("Jane Doe");
        myPizza.setPizzaSize("Medium");
        myPizza.setTopping("Mushrooms");

        // Print the modified pizza details
        System.out.println(myPizza);
    }
}
