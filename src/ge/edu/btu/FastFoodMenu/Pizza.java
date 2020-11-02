package ge.edu.btu.FastFoodMenu;

public class Pizza extends Product
{
    private int pieces;

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    public int getPieces() {
        return pieces;
    }

    public Pizza(){};

    public Pizza(String name)
    {
        super(name);
    }

    @Override
    public int countPrice ()
    {
        return pieces*2;
    };

}
