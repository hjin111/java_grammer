package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class C0703JsonParsing1 {
    public static void main(String[] args) throws IOException {
        // json 과 python 이 통신할 수 있나? JSON 으로 주고 받으면 됨

        // json 형태의 문자열 가져다가 parsing 하기
        // 2가지 method 잘 알아두기
        // 1.readTree : JsonNode 트리구조 객체 return
        // 2.readValue : 원하는 객체로 변환해서 return
        ObjectMapper objectMapper = new ObjectMapper();
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_data1.json");
        String jsonString = Files.readString(filePath);
        // System.out.println(jsonString);
        // readTree : 트리구조의 JsonNode 로 변환
        // 트리구조의 장점은 유연함
        JsonNode data1 = objectMapper.readTree(jsonString);
        Map<String, String> studentMap = new HashMap<>();
        studentMap.put("id", data1.get("id").asText());
        studentMap.put("name", data1.get("name").asText());
        studentMap.put("classNumber", data1.get("classNumber").asText());
        studentMap.put("city", data1.get("city").asText());
        System.out.println(studentMap);

        // readValue : 바로 객체로 변환
        Map<String, String> studentMap2 = objectMapper.readValue(jsonString, Map.class); // Map 클래스에다가 할당에 달라
        objectMapper.readValue(jsonString, Map.class);
        System.out.println(studentMap2);

        // Student 객체 생성 및 toString() 오버라이딩
        Student student3 = objectMapper.readValue(jsonString, Student.class); // Student 클래스에다가 할당에 달라
        System.out.println(student3);


    }
}

// ObjectMapper 는 getter 또는 setter 메서드 명을 통해 필드 값을 유추
// 실제 값의 setting 은 reflection 이라는 기술을 통해 변수 값에 할당

// 변수를 출력할 때 getter 나 setter 로 저장한다.
// getter 나 setter 둘중 아무거나 있어도 되지만 둘다 없으면 출력 오류
// but setter만 있는 경우는 흔하지 않으니 getter로 해두자!
class Student{
    int id;
    private String name;
    private String classNumber;
    private String city;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString(){
        return "이름은"+this.name + " classnumber는 " + this.classNumber + " 출신도시는 " + this.city;
    }
}


