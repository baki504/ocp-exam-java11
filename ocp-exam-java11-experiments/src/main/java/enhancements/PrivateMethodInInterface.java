package enhancements;

public interface PrivateMethodInInterface {

    default void doWork() {
        privateMethod();
    }

    // readability improvement on default method
    private void privateMethod() {
        System.out.println("private method!");
    }

}
