import java.util.Map;
import kong.unirest.Unirest;
import kong.unirest.HttpResponse;

public class HTTP {
    public HttpResponse<String> execute(String url, String method, Map<String, String> headers, Map<String, Object> parameters) {
        return Unirest.request(method, url).headers(headers).queryString(parameters).asString();
    }
}
