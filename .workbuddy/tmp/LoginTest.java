import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class LoginTest {
    public static void main(String[] args) throws Exception {
        String json = "{\"username\":\"Jack\",\"password\":\"123\"}";
        HttpRequest req = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/users/login"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(json, StandardCharsets.UTF_8))
                .build();
        HttpResponse<String> resp = HttpClient.newHttpClient()
                .send(req, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8));
        System.out.println("HTTP " + resp.statusCode());
        System.out.println(resp.body());
    }
}
