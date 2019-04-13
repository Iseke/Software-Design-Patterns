public class Run {
    public static void main(String[] args){
        IceCreamStore fStore = new AlmatyIceCreamStore();
        IceCreamStore bStore = new BakuIceCreramStore();

        IceCream iceCream = fStore.orderIceCream("marmalade");
        System.out.println("First order "+ iceCream.getName()+"\n");

        iceCream = fStore.orderIceCream("nuts");
        System.out.println("Second order "+ iceCream.getName()+"\n");

        iceCream = bStore.orderIceCream("cookie");
        System.out.println("Third order "+ iceCream.getName()+"\n");




    }
}
