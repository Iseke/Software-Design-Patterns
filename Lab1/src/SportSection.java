public interface SportSection {
    public void doSport();
}

class CantDoSport implements SportSection {
    @Override
    public void doSport() {
        System.out.println("I can't take Sport classes!");
    }
}

class CanTake2Sport implements SportSection {
    @Override
    public void doSport() {
        System.out.println("I can take Sport classes maximum 2 times!");
    }
}

class CanTake4Sport implements SportSection {
    @Override
    public void doSport() {
        System.out.println("I can take Sport maximum 4 times!");
    }
}
