import singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singInstance = Singleton.getInstance();

        singInstance.getMessage();
    }
}
