package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C0702FileParsing {
    public static void main(String[] args) throws IOException {//throws IOException {

//        try {
//            // 콘솔에서 읽기
//            // io 패키지 사용
//            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//            String input = br1.readLine(); // 한 줄을 읽기
//            System.out.println(input);
//
//            // 파일에서 읽기 -> src 밑에 파일 경로 copy
//            BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFileParsing/test_file.txt"));
//            // br2.readLine() == null 때까지 반복해서 readLine
//            String line = br2.readLine();
//            while(line != null) {
//                System.out.println(line);
//                line = br2.readLine();
//            }
//
//            // NIO 패키지를 사용한 파일 처리
//            Path filePath = Paths.get("src/C07ExceptionFileParsing/test_file.txt");
//            // 문자열 통째로 read
//            String st1 = Files.readString(filePath);
//            System.out.println(st1);
//            // 문자열을 각 라인을 잘라 list 형태로 read
//            List<String> st2 = Files.readAllLines(filePath);
//            for(String s : st2) {
//                System.out.println(s + "선수");
//            }
//        }catch (IOException e) {
//            e.printStackTrace();
//        }

        // 파일 쓰기
        // append(추가), write(덮어쓰기)
        // create_new(생성)
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_file.txt");

        if(Files.exists(filePath)) {
            Files.write(filePath, "홍길동\n".getBytes(), StandardOpenOption.APPEND);
        }else {
            Files.write(filePath, "".getBytes(), StandardOpenOption.CREATE_NEW);
        }

    }
}
