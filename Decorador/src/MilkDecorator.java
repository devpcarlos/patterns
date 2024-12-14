public class MilkDecorator extends CoffeDecorator {

    public MilkDecorator(Coffe decoradorCoffe) {
        super(decoradorCoffe);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", Milk ";
    }

    @Override
    public double getCost() {
        return super.getCost() + 500;
    }
}
