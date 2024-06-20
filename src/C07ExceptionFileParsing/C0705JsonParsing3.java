package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C0705JsonParsing3 {
    public static void main(String[] args) throws IOException, InterruptedException {

        // Spring 에서는 RestTemplate 을 통해 Http 요청하고
        // 여기서는 java 에 내장된 http 클라이언트 사용
        // http 클라이언트가 java 에 내장
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder() // request 객체에 담아서 사용
                .uri(URI.create("https://jsonplaceholder.typicode.com/posts")) // URL 세팅
                .GET() // GET 메서드로 요청
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString()); // 돌아 오는 응답은 String으로 받겠다

        String posts = response.body();
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(posts);
        List<Post> postList = new ArrayList<>();
        for(JsonNode j : jsonNode){
            postList.add(objectMapper.readValue(j.toString(), Post.class));
        }

        System.out.println(postList);

        // List<Post> 객체를 json 으로 직렬화
        String postJson = objectMapper.writeValueAsString(postList);
        // 누군가한테 줘야하는데 나중에 프론트엔드한테 넘겨줄 때 배움
        System.out.println(postJson);

    }
}

class Post {

    private int userId;
    private int id;
    private String title;
    private String body;

    @Override
    public String toString() {
        return "id : " + this.id + ", title : " + this.title;
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

}
