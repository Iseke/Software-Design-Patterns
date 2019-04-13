public class PIzzaRestaurant {
    public static  void  main(String[] args){
        Pizza pizza = new Bagel();
        System.out.println(pizza.getDescription()+" $"+pizza.cost());
        Pizza pizza1 = new Maltese();
        pizza1 = new WhiteGoatCheese(pizza1);
        pizza1 = new RomaTomatoes(pizza1);
        System.out.println(pizza1.getDescription()+" $"+pizza1.cost());

    }
}
