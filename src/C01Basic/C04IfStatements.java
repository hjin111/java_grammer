package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main(String[] args) {

        // 도어락키 if문
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if(answer == input){
//            System.out.println("문이 열렸습니다.");//참일 경우 실행문; //문이 열렸습니다.
//        }else{
//            System.out.println("비밀번호가 틀렸습니다.");// 거짓일 경우 실행문; // 비밀번호가 틀렸습니다.
//        }

        // 알파벳이 소문자인지 대문자인지 판별하는 프로그램
        // (힌트) 묵시적 타입변환
        // 소문자 알파벳, 대문자 알파벳, 그외
        // 소문자 1글자 입력시 소문자입니다.
        // 대문자 1글자 입력시 대문자입니다.
        // 그외 문자 입력시 알파벳이 아닙니다.
//        Scanner sc = new Scanner(System.in);
//        char alphabet = sc.nextLine().charAt(0);
//        if(97 <= alphabet && alphabet <= 122){
//            System.out.println("소문자 입니다.");
//        }else if(65 <= alphabet && alphabet <= 90){
//            System.out.println("대문자 입니다.");
//        }else {
//            System.out.println("알파벳이 아닙니다");
//        }
//            Scanner sc = new Scanner(System.in);
//            char alphabet = sc.nextLine().charAt(0);
//            if(alphabet >= 'a' && alphabet <= 'z'){
//                System.out.println("소문자 입니다.");
//            }else if(alphabet >= 'A' && alphabet <= 'Z'){
//                System.out.println("대문자 입니다.");
//            }else {
//                System.out.println("알파벳이 아닙니다");
//            }

            // 택시요금 : 10000, 버스요금 : 3000, 킥보드 : 2000
            // 사용자에게 얼마가 있는지 물어보고 구간별로 교통수단 추천
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            // if문 들로 짠다고 하면 독립적으로 실행되니깐 그때는 범위를 정확하게 지정해줘야함
            if(input >= 10000){
                System.out.println("택시를 타시오");
            } else if (input >= 3000) {
                System.out.println("버스를 타시오");
            }else if ( input >= 2000) {
                System.out.println("킥보드를 타시오");
            }else {
                System.out.println("걸어가시오");
            }

            // if문이 독립적으로 존재 될 경우에는 정확한 범위지정을 하지 않으면,
            // 모든 if문이 중복되어 실행될 가능성이 존재
            if(input >= 10000){
                System.out.println("택시를 타시오");
            }
            if (input >= 3000) {
                System.out.println("버스를 타시오");
            }
            if ( input >= 2000) {
                System.out.println("킥보드를 타시오");
            }else{
                System.out.println("걸어가시오");
            }

    }
}
