import java.util.Map;
import java.util.HashMap;
import kong.unirest.HttpResponse;

public class Demo {
    private HTTP http = new HTTP();

    public void start(){
        String uri = "http://httpbin.org/";
        String method = "get";
        Map<String, String> parameters = new HashMap<String, String>() {{
            put("text", "String");
            put("parameter", "numbers");
        }};
        Map<String, String> headers = new HashMap<String, String>() {{
            put("accept", "application/json");
        }};

            HttpResponse<String>  httpResponse = http.execute(uri, method, headers, new HashMap<String, Object>(parameters));
            System.out.println("Headers: " + httpResponse.getHeaders());
            System.out.println("Body: " + httpResponse.getBody());
            System.out.printf("Status: %s, %s\n", httpResponse.getStatus(), httpResponse.getStatusText());
    }
}
