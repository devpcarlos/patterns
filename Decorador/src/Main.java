public class Main {
    public static void main(String[] args) {
        // Plain Coffee
        Coffe coffee = new PlainCoffe();
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: $" + coffee.getCost());

        // Coffee with Milk
        Coffe milkCoffee = new MilkDecorator(new PlainCoffe());
        System.out.println("\nDescription: " + milkCoffee.getDescription());
        System.out.println("Cost: $" + milkCoffee.getCost());

        // Coffee with Sugar and Milk
        Coffe sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffe()));
        System.out.println("\nDescription: " + sugarMilkCoffee.getDescription());
        System.out.println("Cost: $" + sugarMilkCoffee.getCost());
    }
}