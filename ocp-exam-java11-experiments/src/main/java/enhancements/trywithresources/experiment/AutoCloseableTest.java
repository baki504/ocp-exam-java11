package enhancements.trywithresources.experiment;

// Java 9 or later
public class AutoCloseableTest {

    // Improved try-with-resources statement
    public static void main(String[] args) {
        executeWork(new AutoCloseableResource());
    }

    static void executeWork(AutoCloseableResource resource) {
        try (resource) { // must be final or effectively final
            resource.work();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}