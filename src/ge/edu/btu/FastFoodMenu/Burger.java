package ge.edu.btu.FastFoodMenu;

public class Burger extends Product
{
    private int weight;
    private int callories;


    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }

    public int getCallories() {
        return callories;
    }

    public Burger(){};

    public Burger(String name)
    {
        super(name);
    }

    @Override
    public int countPrice ()
    {

        return (int) (weight/(callories*0.01));
    };
}

