import java.util.ArrayList;

public  abstract class IceCream {
    String name;
    ArrayList toopings  = new ArrayList();
    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Pour the milk, heavy cream, vanilla and sugar to a blender");
        System.out.println("Blend until smooth");
        System.out.println("Adding toopings: ");
        for(int i=0;i<toopings.size();i++){
            System.out.println("  "+ toopings.get(i));
        }
    }
    void freezing(){
        System.out.println("Freeze for 5min at -10");
    }
    void decorate(){
        System.out.println("Add pieces of fruit");
    }
    void put(){
        System.out.println("Put in branded dishes ");
    }
    public String getName(){
        return name;
    }
}
