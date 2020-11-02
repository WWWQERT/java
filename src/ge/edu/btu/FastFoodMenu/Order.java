package ge.edu.btu.FastFoodMenu;

public class Order
{
    private String name;

    private Product[] products = new Product[3];

    private int amountOfProducts;

    private int first = Integer.MAX_VALUE;

    private  int second = Integer.MAX_VALUE;


    public Order(){};

    public Order(String name)
    {
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void addFood(Product product)
    {
        products[amountOfProducts]=product;
        amountOfProducts++;
    }

    public String getBestCombo()
    {
        Product  cheapest=products[0];
        Product  secondCheapest=products[0];;

        for (int i = 0; i < products.length ; i ++)
        {
			/* If current element is smaller than first
			then update both first and second */
            if (products[i].countPrice() <  first)
            {
                second=first;
                first = products[i].countPrice();
                cheapest = products[i];

            }

            else if (products[i].countPrice() < second && products[i].countPrice() != first)
            {
                second = products[i].countPrice();
                secondCheapest = products[i];

            }



        }
        return String.format("საუკეთესო კომბო %s, %s , ჯამში %s", cheapest, secondCheapest,first+second);
    }
}
