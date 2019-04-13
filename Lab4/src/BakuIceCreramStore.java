public class BakuIceCreramStore extends IceCreamStore {
    protected IceCream createIceCream(String type) {

        if(type.equals("cookie")){
            return new BakuCookieDoughIceCream();
        }else return null;
    }
}
