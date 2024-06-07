package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {

//        // 배열 표현식1 : 리터럴 방식
//        int[] intArr1 = {1,2,3,4,5};
//
        // 배열 표현식2 : 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]); // 0으로 초기화
//        for (int i = 0; i < intArr2.length; i++) {
//            System.out.println(intArr2[i]);
//        }
//        for(int i : intArr2){ // 배열의 원본 값을 바꿀 수 없다.
//            System.out.println(i);
//        }

//
//        // 배열 표현식3
//        int[] intArr3 = new int[]{1,2,3,4};
//
//        // 배열 표현식4 : 불가 -> 배열의 길이는 사전에 지정되어야 함
//        int[] intArr4 = new int[];

//        String[] stArr1 = new String[5];
//        stArr1[0] = "hello";
//        stArr1[1] = "java";
//        // Null Pointer exception
//        System.out.println(stArr1[2].length());
//
//        String[] stArr2 = new String[5];
//        // 배열에 값 한꺼번에 세팅
//        Arrays.fill(stArr2, "java");
//        System.out.println(stArr2[3]);
//
//        // 85, 65, 90인 배열을 선언하고, 총합, 평균을 구해보자
//        int[] intArr3 = {85,65,90};
//        int sum = 0;
//        int avg = 0;
//        for(int i = 0; i < intArr3.length; i++){
//            sum += intArr3[i];
//        }
//
//        avg = sum / intArr3.length;

        // 배열의 최대값, 최소값
//        int[] arr = {10,20,30,12,8,17};
//        int max = arr[0]; // Integer.MIN_VALUE 로도 세팅 가능
//        int min = arr[0]; // Integer.MAX_VALUE 로도 세팅 가능
//        for(int i = 1; i < arr.length; i++) {
//            if(arr[i] > max) {
//                max = arr[i];
//            }
//            if(min > arr[i]) {
//                min = arr[i];
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(min);

//        // 배열의 자리 바꾸기
//        int[] arr = {10,20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//
//        int[] arr2 = {10,20,30,40,50};
//        // 0번째 index 부터 마지막 index 까지 순차적으로 자리 change
//        for(int i = 0; i < arr2.length - 1; i++){
//            int temp1 = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp1;
//        }
//        System.out.println(Arrays.toString(arr2));

//        // 배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        // 새로운 배열에 위 arr를 뒤집은 값 세팅
//        int[] newArr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[arr.length - i - 1];
//        }
//        System.out.println(Arrays.toString(newArr));
//
//        // 숫자 뒤집기
//        int num=1234;
//        // 문자열과 관련된 풀이로 풀기 4321 문자열로 출력이 되도록
//        String stNum = String.valueOf(num);
//        String[] arr2 = new String[stNum.length()];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = stNum.substring(arr.length - i - 2, arr.length - i - 1);
//        }
//        System.out.println(Arrays.toString(arr2));

        //  정렬
        int[] arr = {5,1,2,3,1,2};
        Arrays.sort(arr); // 오름차순 정렬이 기본
        System.out.println(Arrays.toString(arr));

        // 문자 정렬
        // 아스키코드 기준으로 => 대문자가 소문자보다 아스키코드 숫자가 낮다
        String[] fruits = {"banana", "apple", "cherry", "Apple"};
        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        // 문자열의 index 순서로 비교
        String[] fruits2 = {"apple1", "apple11", "apple2"};
        Arrays.sort(fruits2);
        System.out.println(Arrays.toString(fruits2));

        // 내림차순
        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
        Arrays.sort(st_arr, Comparator.reverseOrder());

        // 기본형 타입은 Comparator로 처리 불가
        int [] intArr = {5,1,2,7,3,1,2};
        Arrays.sort(intArr); //  Comparator.reverseOrder() => 참조형 변수만 와야함 ( 기본형 타입 처리 못함 )
        // 방법1. 오름차순정렬 후 배열뒤집기

        // 방법2. streamapi, lambda를 활용한 내림차순 정렬
        int[] answer = Arrays.stream(intArr) // intArr 를 대상으로 Stream 객체 생성
                        .boxed() // int 요소를 Integer로 형변환 시키는 메서드
                        .sorted(Comparator.reverseOrder())
                        .mapToInt(a->a) //Integer를 다시 int로 형변환
                        .toArray(); // 배열로 변환

    }

}
