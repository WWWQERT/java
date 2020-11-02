package ge.edu.btu.FastFoodMenu;

public abstract class Product
{
    private String name;

    public Product(){}

    public Product(String name)
    {
        this.name=name;

    }


    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }


    public abstract int countPrice ();

    @Override
    public String toString()
    {
        return String.format("სახელი %s, ფასი: %s ",getName(),countPrice());
    }


}

