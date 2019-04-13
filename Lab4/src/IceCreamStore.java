public abstract class IceCreamStore {
    public IceCream orderIceCream(String type){
        IceCream iceCream;
        iceCream = createIceCream(type);
        iceCream.prepare();
        iceCream.freezing();
        iceCream.decorate();
        iceCream.put();
        return iceCream;
    }
    protected  abstract IceCream createIceCream(String type);
}
