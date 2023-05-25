public class Main {
    public static void main(String[] args) {
        SingletonEager mySingleton =  SingletonEager.getInstance();
        mySingleton.printMessage();
    }
}