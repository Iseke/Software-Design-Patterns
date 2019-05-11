public abstract class House {
    final void prepareToBuild(){
        buildBase();
        wallMaterial();
        if(needElevator()){
            elevator();
        }
        numberOfFloors();
        buildRoof();

    }
    void buildBase(){
        System.out.println("First build a strong base");
    }
    void buildRoof(){
        System.out.println("Finally we finish build with Roof");
    }
    void elevator(){
        System.out.println("Use elevator");
    }
    boolean needElevator(){
        return true;
    }
    abstract void wallMaterial();
    abstract void numberOfFloors();
}
