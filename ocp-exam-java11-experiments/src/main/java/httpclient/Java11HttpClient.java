package httpclient;

import java.lang.System.Logger.Level;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

// This feature isn't listed in the exam objectives
public class Java11HttpClient {

    private static final System.Logger logger = System.getLogger(Java11HttpClient.class.getName());

    public static void main(String[] args) throws Exception {
        new Java11HttpClient().sampleGet();
        //new Java11HttpClient().sampleAsyncGet();
        //new Java11HttpClient().sampleLines();
        //new Java11HttpClient().samplePath();
    }

    public void sampleGet() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://example.com"))
                .build();

        HttpResponse<String> response = client.send(getRequest, HttpResponse.BodyHandlers.ofString());
        logger.log(Level.INFO, response.body());
    }

    public void sampleAsyncGet() throws Exception {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://example.com"))
                .build();

        CompletableFuture<Void> f = client.sendAsync(getRequest, HttpResponse.BodyHandlers.ofString())
                .thenAccept(response -> {
                    logger.log(Level.INFO, "status code : " + response.statusCode());
                    logger.log(Level.INFO, "body is : " + response.body());
                });

    }

    /**
     * Stream<String>としてレスポンスボディを取得する場合の例
     * @throws Exception
     */
    public void sampleLines() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://example.com"))
                .build();

        HttpResponse<Stream<String>> response = client.send(getRequest, HttpResponse.BodyHandlers.ofLines());
        Stream<String> lines = response.body();

        lines.forEach(line -> {
            logger.log(Level.INFO, "line => " + line);
        });

    }

    /**
     * Stream<String>としてレスポンスボディを取得する場合の例
     * @throws Exception
     */
    public void samplePath() throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://example.com"))
                .build();

        HttpResponse<Path> response = client.send(getRequest,
                HttpResponse.BodyHandlers.ofFile(Paths.get("download.dat")));

        logger.log(Level.INFO, "file path is " + response.body());

    }

}
