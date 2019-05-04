package httpclient;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *  Apache HttpClientを使った例
 */
public class ApacheHttpClient {

    private static final System.Logger logger = System.getLogger(ApacheHttpClient.class.getName());

    public static void main(String[] args) throws Exception {
        new ApacheHttpClient().sampleGet();
    }

    public void sampleGet() throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet requestGet = new HttpGet("http://example.com");

        CloseableHttpResponse response = client.execute(requestGet);

        String body = EntityUtils.toString(response.getEntity());
        logger.log(System.Logger.Level.INFO, "[" + body + "]");

        response.close();
    }

}
