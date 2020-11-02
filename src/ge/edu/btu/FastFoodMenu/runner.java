package ge.edu.btu.FastFoodMenu;

public class runner
{
    private static Product pizza = new Pizza("pizza");
    private static Product cola = new CocaCola("CocaCola");
    private static Product burger = new Burger("Burger");

    private static void addPrivateInfo()
    {
          ((Pizza) pizza).setPieces(7);
          ((CocaCola) cola).setMl(1200);
          ((Burger) burger).setCallories(100);
          ((Burger) burger).setWeight(10);
    }
    private static Order order = new Order("order");

    private static void addFoods()
    {
        order.addFood(pizza);
        order.addFood(cola);
        order.addFood(burger);
    }
    public static void main(String[] args)
    {
        addFoods();
        addPrivateInfo();
        String bestCombo =   order.getBestCombo();
        Product product = pizza;
        Product product2 = burger;
        Product product1 = cola;
        System.out.println(product);
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(bestCombo);
    }

}
