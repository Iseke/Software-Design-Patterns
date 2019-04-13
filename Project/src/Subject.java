public interface Subject {
    void registerSG(Observer o);//SG - sentence generator
    void removeSG(Observer o);
    void notifySG();
}
