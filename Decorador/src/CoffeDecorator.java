public class CoffeDecorator implements Coffe{

    protected Coffe decoradorCoffe;

    public CoffeDecorator(Coffe decoradorCoffe){
        this.decoradorCoffe=decoradorCoffe;
    }

    @Override
    public String getDescription() {
        return decoradorCoffe.getDescription();
    }

    @Override
    public double getCost() {
        return decoradorCoffe.getCost();
    }
}
