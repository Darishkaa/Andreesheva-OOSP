package ten_facade;

public class Client {
    public static void main(String[] args) {
        HomeFacade home = new HomeFacade();

        System.out.println("Activating Evening Mode:");
        home.startEveningMode();

        System.out.println("\nDeactivating Evening Mode:");
        home.stopEveningMode();
    }
}
