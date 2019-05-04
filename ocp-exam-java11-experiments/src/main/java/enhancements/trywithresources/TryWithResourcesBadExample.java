package enhancements.trywithresources;

// Java 9 or later
public class TryWithResourcesBadExample implements AutoCloseable {

    private final String value;

    public TryWithResourcesBadExample(String value) {
        this.value = value;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Close " + value);
    }

    public static void main(String[] args) throws Exception {
        TryWithResourcesBadExample test1 = new TryWithResourcesBadExample("test1");
        TryWithResourcesBadExample test2 = new TryWithResourcesBadExample("test2");

        if (args.length == 0) {
            // 引数がない場合test1, test2のリソースがクローズされず、リークする
            // このようにランタイム例外やreturnすることがないよう注意
            throw new IllegalArgumentException();
        }

        TryWithResourcesBadExample test3 = new TryWithResourcesBadExample("test3");

        try (test1; test2; test3) {
        }

    }

}
