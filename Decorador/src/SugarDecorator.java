public class SugarDecorator extends CoffeDecorator{
    public SugarDecorator(Coffe decoradorCoffe) {
        super(decoradorCoffe);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 300;
    }
}
