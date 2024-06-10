package C01Basic;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {

        // 참조자료형 : 기본 자료형을 제외한 모든 자료형
        // wrapperClass : 기본형 타입을 Wrapping 한 클래스
        // int와 integer간의 형변환
//        int a = 10;
//        Integer b = new Integer(20);
//        // 오토 언박싱 : Integer -> int 형변환
//        int c = b;
//        // 오토박싱
//        Integer d = a;

//        // String과 int의 형변환
//        int a = 10;
//        // int -> String
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//        // String -> int
//        int b = Integer.parseInt(st1);
//
//        // 참조자료형에 원시자료형을 담을 때는 Wrapper 클래스를 써야한다.
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

//        // String 변수 생성 방법
//        // 객체 생성
//        String st1 = new String("hello");
//        // 리터럴 방식 : 권장하는 방식
//        // 문자열 pool 통해 성능향상
//        String st2 = "hello";
//        int[] arr = {10,20,30};
//        String st3 = new String("hello");
//        String st4 = "hello";
//        System.out.println(st1==st3); // s1이랑 s3은 각각의 주소값을 가지고 있다.
//        System.out.println(st2==st4); // s2랑 s4는 pool에 같은 메모리 주소값을 바라보고 있다.
//        System.out.println(st3==st4);
//
//        // string 문자열 비교는 equals
//        System.out.println(st1.equals(st3));
//        System.out.println(st2.equals(st4));
//        System.out.println(st3.equals(st4));
//        System.out.println("hello".equalsIgnoreCase("hellO")); // true

//        // 문자열길이 : length();
//        String st1 = "hello java java";
//        System.out.println(st1.length());
//        // indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
//        int index1 = st1.indexOf("java");
//        System.out.println(index1);
//        // 마지막 문자열의 index 위치
//        System.out.println(st1.lastIndexOf("java"));
//
//        // containe : 특정 문자열이 있는지 여부를 boolean으로 리턴
//        System.out.println(st1.contains("hello"));
//        System.out.println(st1.contains("world"));
//
//        // charAt : 특정 index의 문자(char)값을 리턴
//        String st = "abcdefabaadf";
//        char ch1 = st.charAt(1);
//        System.out.println(ch1);
//        // 위의 문자열에 a의 개수가 몇개인지 count
//        // for문과 charAt, length()
//        int count = 0;
//        for(int i = 0; i < st.length(); i++){
//            if(st.charAt(i) == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//        // toCharArray() : String 문자열을 char 배열로 리턴 ( 다 하나씩 잘라서 )
//        char[] arr = st.toCharArray();
//        System.out.println(Arrays.toString(st.toCharArray()));
//        // toCharArray를 활용해서 a가 몇개인지 count, 향상된 for문 사용 for(int a : 배열명){}
//        char[] arr1 = st.toCharArray();
//        int count1 = 0;
//        for(char a : arr1 ){
//            if( a == 'a'){
//                count1++;
//            }
//        }
//        System.out.println(count1);

        // 문자열 더하기 : +=
//        String st1 = "hello";
//        st1 += " world";
//        System.out.println(st1);
//
//        //  특정 문자 제거하기 - 프로그래머스
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//        // 자동 형변환
//        for(int i = 0; i < my_string.length(); i++){
//            if(my_string.charAt(i) != letter.charAt(0)){
//                answer += my_string.charAt(i);
//            }
//        }
//
//        System.out.println(answer);

//        // substring(a,b) : a 이상 b 미만의 index의 문자를 잘라 리턴
//        String st1 = "hello World";
//        System.out.println(st1.substring(0,5));
//        System.out.println(st1.substring(6,st1.length()));
//        // char 빼고 문제 풀기
//        String my_string = "abcdef";
//        String letter = "f";
//        String answer = "";
//        // 자동 형변환
//        for(int i = 0; i < my_string.length(); i++){
//           if(!(my_string.substring(i,i+1).equals(letter))){
//               answer += my_string.substring(i,i+1);
//           }
//        }
//
//        System.out.println(answer);

        // 가운데 글자 가져오기 - 프로그래머스
//        String s = "qwer";
//        String answer = "";
//        int length = s.length();
//        if(length % 2 != 0){
//            int a = length / 2;
//            for(int i = 0; i < length; i++) {
//                if(s.substring(i,i+1).equals(s.substring(a,a+1))){
//                    System.out.println(s.substring(i,i+1));
//                }
//            }
//        }else {
//            int a = length / 2 - 1;
//            for(int i = 0; i < length; i++) {
//                if(s.substring(i,i+1).equals(s.substring(a,a+1))){
//                    System.out.println(s.substring(i,i+2));
//                }
//            }
//        }

        // trim, strip : 문자열 양쪽 끝의 공백 제거
//        String trimSt1 = " hello world     ";
////        String trimSt2 = trimSt1.trim();
//        String trimSt2 = trimSt1.strip();
//        System.out.println(trimSt1);
//        System.out.println(trimSt2);
//
//        // toUppercase : 대문자로 변환, toLowercase : 소문자로 변환
//        String s1 = "hello";
//        String s2 = s1.toUpperCase();
//        String s3 = s1.toLowerCase();
//        System.out.println(s2);
//        System.out.println(s3);
//
//        // char -> string 형변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        char ch2 = st1.charAt(0);
//        System.out.println(st1);

//        // replace(a,b) : a문자열을 b문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world","java");
//        System.out.println(st2);

        // replaceAll(a,b) : replace와 동일, 정규표현식을 쓸수 있음
//        String st1 = "01abc123한글123"; // 숫자, 알파벳, 한글 등이 섞여 있을때
//        // for문 활용해서 알파벳(소문자) 제거 answer return
//        String answer = "";
//        for(int i = 0; i < st1.length(); i++){
//            if(st1.charAt(i) < 'a' || st1.charAt(i) > 'z'){
//                answer += st1.charAt(i);
//            }
//        }
//        System.out.println(answer);

        // replaceAll 과 정규표현식 활용
//        String st1 = "01abc123ABC한글123";
//        // [a-z]+ : 1개이상의 소문자 알파벳 표현하는 정규표현식
//        // [A-Za-z]+ : 대소문자 포함
//        // [가-힣]+ : 한글
//        // [0-9]+ : 숫자
//        String answer = st1.replaceAll("[A-Za-z]+","");
//        System.out.println(answer);

        // String의 matches와 Pattern.matches()
//        String test = "helloA";
//        System.out.println(test.matches("[A-Za-z]+"));
//
//        boolean b1 = Pattern.matches("[0-9]+","12345");
//        System.out.println(b1);
//
//        // ^ : 정규표현식 시작, $ : 정규표현식 끝 , * : 빈값포함
//        boolean b2 = Pattern.matches("^[A-Za-z]*$", "HelloWorld");
//
//        // 문자열 다루기 - 프로그래머스
//        String s = "a234";
//        char answer = false;
//        if((s.length() == 4 || s.length() == 6) && s.matches("[0-9]+")){
//                answer = true;
//
//        }

//       // 전화번호 패턴 검증
//        while(true) {
//            Scanner sc = new Scanner(System.in);
//            String number = sc.nextLine();
//            if (Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)) { // d가 숫자 약어
//                System.out.println("올바르게 입력하셨습니다.");
//                break;
//            } else {
//                System.out.println("틀린 형식의 전화번호입니다.");
//            }
//        }

        // 이메일 검증 : 소문자알파벳,숫자@소문자알파벳.com
        String email = "abc@naver.com";
        boolean b3 = Pattern.matches("^[a-z0-9]+@[a-z]+.com$", email);
        System.out.println(b3);

        // split : 특정 문자열을 기준으로 문자열을 자르는것, 문자열 배열을 return
        String a = "a:b:c:d";
        String[] a_arr  = a.split(":");
        System.out.println(Arrays.toString(a_arr));
        String b = "a b c  d";
        //      \s : 공백
        String[] b_arr  = b.split("\\s+");
        System.out.println(Arrays.toString(b_arr));

        // isEmpty와 null(자료타입)
//        String st1 = null;
//        String st2 = "";
//        // equal 관계가 아님
//        System.out.println(st1==st2);
//        // 문제 발생 x
//        System.out.println(st2.isEmpty()); // true
//        // 문제발생 o: NullPointerException 예외 발생
//        System.out.println(st1.isEmpty()); // false

        // join : string[]을 하나의 String 만드는 메서드
        String[] arr = {"java", "python", "C++", "javascript"};
        String st = String.join(" ", arr);
        System.out.println(st);

        // StringBuffer
        StringBuffer sb1 = new StringBuffer("hello");
        // append : 문자열 가장 뒤에 다른 문자열을 더하는 것.
        sb1.append(" java");
        sb1.append(" world");
        String answer1 = sb1.toString();
        sb1.insert(5," python");
        sb1.delete(17, sb1.length());
        System.out.println(sb1);

        // StringBuilder -> 시간 단축
        // String += < StringBuffer < StringBuilder
        // StringBuilder는 스레드 safe X
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        sb2.append("\n"); // 줄바꿈
        sb2.append("world");
        System.out.println(sb2);

        // StringBuilder를 사용해서
        String my_string = "hello";
        int n = 3; // hhheeellllllooo 결과가 answer에 담기도록
        StringBuilder sb3 = new StringBuilder("hello");
        for(int i = 0; i < my_string.length(); i++){
           char temp = my_string.charAt(i);
           for(int j = 0; j < n; j++){
               sb3.append(temp);
           }
        }
        System.out.println(sb3);

        // 문자열 밀기
        String A = "hello";
        String B = "ohell";
        int len = A.length();
        StringBuilder sb = new StringBuilder(A);
        int answer = 0;
        while (!sb.equals(B)){
            sb.insert(0, sb.substring(len-1, len));
            sb.delete(len-1,len);
            answer++;
            if(answer>len){
                answer = -1;
            }
        }

    }
}
