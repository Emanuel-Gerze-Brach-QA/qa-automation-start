
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ApiTest {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        int statusCode = connection.getResponseCode();


        System.out.println("Status code: " + statusCode);

        assert statusCode == 200 : "Expected status code 200, but got " + statusCode;

// Read response body
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );

        StringBuilder responseBody = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            responseBody.append(line);
        }

        reader.close();

        String response = responseBody.toString();
        System.out.println("Response body: " + response);

// Assert response content
        assert response.contains("\"id\": 1") : "Response does not contain expected id";

        System.out.println("TEST PASSED");



        connection.disconnect();
    }
}


