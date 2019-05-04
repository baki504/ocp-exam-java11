package enhancements.trywithresources.experiment;

public class AutoCloseableResource implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("in close()");
        throw new RuntimeException("Exception in close()");
    }

    public void work() throws Exception {
        System.out.println("in work()");
        throw new Exception("Exception in work()");
    }
}