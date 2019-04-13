public class Run {
    public static void main(String[] args){
        Main student = new Primary();
        student.display();
        student.doingSport();
        student.transportType();
        student.setSportSection(new CanTake4Sport());
        student.doingSport();
    }
}
