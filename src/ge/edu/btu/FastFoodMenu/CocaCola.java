package ge.edu.btu.FastFoodMenu;

public class CocaCola extends Product
{
    private int ml;

    public void setMl(int ml) {
        this.ml = ml;
    }

    public int getMl() {
        return ml;
    }

    public CocaCola(){};

    public CocaCola(String name)
    {
        super(name);
    }

    @Override
    public int countPrice ()
    {
        return (int) (ml*0.01);
    };
}
