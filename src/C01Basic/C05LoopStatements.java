package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {

//        int a = 0;
//        while(a < 10){
//            System.out.println("hello world");
//            a = a + 1;
//        }
//
//        // 2~10까지 출력하는 while 문 예제
//        int b = 1;
//        while(b < 10){
//            b++;
//            System.out.println(b);
//        }
//
//        // 입력한 숫자의 구구단 단수 출력
//        // 3 x 1 = 3
//        // 3 x 2 = 6
//        while(true){
//            System.out.println("원하시는 단수를 입력해주세요");
//            Scanner sc = new Scanner(System.in);
//            int input = sc.nextInt();
//            int num = 1;
//            while(num < 10){
//                System.out.println(input + " x " + num + " = " + (input * num));
//                num++;
//            }
//        }

        // 반복되는 도어락키 예제
        // int를 String 변경
        // 비밀번호 맞추면 종료. break;
        // 비밀번호가 5회 이상 틀리면 종료 : 입력 횟수를 초과했습니다.
//        int f = 0;
//        while (true){
//            String answer = "1234";
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//            if (answer.equals(input)) {
//                System.out.println("문이 열렸습니다.");
//                break;
//            }else {
//                System.out.println("비밀번호가 틀렸습니다.");
//                f++;
//            }
//            if (f >= 5){
//                System.out.println("5회 이상 틀렸습니다");
//                break;
//            }
//        }

//        int num = 1234;
//        int result = 0;
//        // result에 숫자 num을 반대로 뒤집은 숫자값을 넣어주세요.
//        // 나머지 %를 활용
//        int temp1 = num % 1000; // 234
//        int temp2 = num / 1000; // 1
//        int temp3 = temp1 % 100; // 34
//        int temp4 = temp1 / 100; // 2
//        int temp5 = temp3 % 10; // 4
//        int temp6 = temp3 / 10;  // 3
//        result = (temp5 * 1000) + (temp6 * 100) + (temp4 * 10) + temp2;
//        System.out.println(result);
//
//        // do while문 : 무조건 1번은 실행되는 반복문
//        int a = 100;
//        do {
//            a++;
//            System.out.println(a);
//        }while (a<10);
//
//    }

        /// 2~10까지 출력을 for 문을 활용하여 출력
//        for (int i = 2; i <= 10; i++) {
//            System.out.println(i);
//        }
//
//        // 1~10중에 홀수만 출력하기
//        for(int i = 1; i <= 10; i++) {
//            if( i % 2 != 0){
//                System.out.println(i);
//            }
//        }
//
//        // 1~20까지의 수 중에 짝수를 모두 더한 값
//        int sum = 0;
//        for(int i = 1; i <= 20; i++){
//            if(i % 2 == 0){
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
//        // 최대공약수 구하기
//        int a = 24; int b = 36;
//        int max = a > b ? a : b;
//        int answer = 0;
//            for(int i = 1; i <= max; i++){
//                if ( a % i == 0 && b % i == 0){
//                    if(max < i){
//                        answer = i;
//                    }
//                }
//            }
//            System.out.println(answer);
//
//            // 소수구하기 : 1과 자기자신을 제외한 숫자로 나누어지지 않는 수
//            // 1~24까지 수 중에 소수를 출력
//            // 1, 2, 3, 5, 7
            // 사용자가 입력한 특정값이 소수인지 아닌지
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            boolean trueOrNot = false;
            for(int i = 2; i < input; i++){ // i * i 이 input 보다 작을 때까지만 나눠보면 된다.
               if(input % i == 0){
                   trueOrNot = true;
                   break;
               }
            }
            if(trueOrNot == false) {
                System.out.println(input + " 은 소수입니다.");
            }
//
//            // 홀수만 출력하기 1 ~ 10 까지
//            for(int i = 1; i <= 10; i++){
//                if(i%2 == 0){
//                   continue; // 반복문의 조건식으로 다시 올라감
//                }else {
//                    System.out.println(i);
//                }
//            }
            // 배열과 enhanced for문(향상된 for문 - for each문)
//            int[] arr = {1,3,5,7,9};
//            // 일반 for문
//            for(int i =0; i < 5; i++){
//                System.out.println(arr[i]);
//            }
//            // 향상된 for문 : 반복횟수는 arr에 들어가있는 데이터 개수 만큼 반복
//            for(int i : arr){
//                System.out.println(i);
//            }
//
//            // 일반 for문을 통한 arr값 변경 후 출력
//            for(int i=0; i < 5;i++){
//                arr[i] += 10;
//            }
//            // System.out.println(arr); // 메모리 주소 출력
//            System.out.println(Arrays.toString(arr));// 메모리 주소출력이 내용출력
//            // 향상된 for문을 통한 arr값 변경 후 출력
//            // 향상된 for문으로는 실제 arr 값이 변경은 불가능
//            for(int i : arr){
//                i += 10;
//            }
//            System.out.println(Arrays.toString(arr));
//
//            // 자바 변수의 유효범위 : {}
//            int num = 10;
//            if(num>1){
//                int abc = 20;
//                num=20;
//            }
//            // abc=30; if문 중괄호 밖에서는 abc변수의 존재를 모름
//            // System.out.println(num);
//            // System.out.println(abc);
//
//            // 다중반복문 : 2 x 1 = 2
//            // 각 단 몇단입니다 출력
//            for(int i =2; i < 10; i++){
//                System.out.println(i + "단 입니다.");
//                for(int j =1; j < 10; j++){
//                    System.out.println(i + " x " + j + " = " + (i * j));
//                }
//            }

//            // 라벨문 - 실무에서 종종 나옴
//            loop1:
//            for(int i = 0; i < 5; i++){
//                for(int j = 0; j < 5; j++){
//                    System.out.println("Hello World");
//                    if(j==2){
//                        break loop1;
//                    }
//                }
//            }

            // 라벨문 활용해서 값 찾기
            // 먼저 찾은 11을 찾으면 3,1에 11이 있습니다.라고 출력
            int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
            System.out.println(arr[2][0]);
            int target = 11;
            loop1:
            for(int i = 0; i<arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    if(arr[i][j] == target){
                        System.out.println(i + "," + j + "에 " + arr[i][j] + "이 있습니다.");
                        break loop1;
                    }
                }
            }

        }
    }


