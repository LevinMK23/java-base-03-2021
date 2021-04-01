package lesson6;

public class ListFactory {

    static class AList {}

    static class BList {}


    public static AList getAList() {
        return new AList();
    }

    public static BList getBList() {
        return new BList();
    }
}
