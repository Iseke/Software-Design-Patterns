public class AlmatyIceCreamStore extends IceCreamStore {
    protected IceCream createIceCream(String type) {
        if(type.equals("marmalade")){
            return new RockyRoadIceCream();
        }else if(type.equals("nuts")){
            return new PeanutIceCream();
        }else if(type.equals("cookie")){
            return new CookieDoughIceCream();
        }else if (type.equals("cherry")){
            return new CherryBlossomIceCream();
        }else return null;
    }
}
