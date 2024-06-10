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
//        Arrays.fill(stArr2, "java"); // 공백으로 채워넣고 시작
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

//        // 배열의 자리 바꾸기 - temp 로 값 keep
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

//        //  정렬
//        int[] arr = {5,1,2,3,1,2};
//        Arrays.sort(arr); // 오름차순 정렬이 기본
//        System.out.println(Arrays.toString(arr));
//
//        // 문자 정렬
//        // 아스키코드 기준으로 => 대문자가 소문자보다 아스키코드 숫자가 낮다
//        String[] fruits = {"banana", "apple", "cherry", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
//        // 문자열의 index 순서로 비교
//        String[] fruits2 = {"apple1", "apple11", "apple2"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));
//
//        // 내림차순
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//
//        // 기본형 타입은 Comparator로 처리 불가
//        int [] intArr = {5,1,2,7,3,1,2};
//        Arrays.sort(intArr); //  Comparator.reverseOrder() => 참조형 변수만 와야함 ( 기본형 타입 처리 못함 )
//        // 방법1. 오름차순정렬 후 배열뒤집기
//
//        // 방법2. streamapi, lambda를 활용한 내림차순 정렬
//        int[] answer = Arrays.stream(intArr) // intArr 를 대상으로 Stream 객체 생성
//                        .boxed() // int 요소를 Integer로 형변환 시키는 메서드
//                        .sorted(Comparator.reverseOrder())
//                        .mapToInt(a->a) //Integer를 다시 int로 형변환
//                        .toArray(); // 배열로 변환

//        // k번째 수 프로그래머스
//        int [] array = {1, 5, 2, 6, 3, 7, 4};
//        int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int[] answer = new int[commands.length];
//        for(int i = 0; i < commands.length; i++){
//                int a = commands[i][0];
//                int b = commands[i][1];
//                int k = commands[i][2];
//                int [] result = new int[b - a + 1];
//                for(int j = a - 1; j < b; j++){
//                    result[j - (a - 1)] = array[j];
//                }
//                Arrays.sort(result);
//                answer[i] = result[k - 1];
//
//        }
//        System.out.println(Arrays.toString(answer));

//        // 선생님 풀이
//        int [] array = {1, 5, 2, 6, 3, 7, 4};
//        int [][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        int [] answer = new int[commands.length];
//        for (int i = 0; i < commands.length; i++) {
//            int start = commands[i][0] - 1;
//            int end = commands[i][1];
//            int value = commands[i][2] - 1;
//            int [] temp = new int[end - start];
//            int count = 0;
//            for(int j = start; j < end; j++){
//                temp[count] = array[j];
//                count++;
//            }
//            Arrays.sort(temp);
//            answer[i] = temp[value];
//        }
//        System.out.println(Arrays.toString(answer));

        // 선택정렬 알고리즘 - 1번째 방법
//        int[] arr = {17, 20, 19, 25, 12};
//        for(int i = 0; i < arr.length - 1; i++){
//            int min = arr[i];
//            int index = i;
//            for(int j = i + 1; j < arr.length; j++){
//                if(min > arr[j]){
//                    min = arr[j];
//                    index = j;
//                }
//            }
//            int temp = arr[i];
//            arr[i] = arr[index];
//            arr[index] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        // 선택정렬 알고리즘 - 2번째 방법
//        int[] arr = {17, 20, 19, 25, 12};
//        for(int i = 0; i < arr.length - 1; i++){
//            for(int j = i + 1; j < arr.length; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        // 숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을 때,
        // 만들어질 수 있는 2개의 조합의 합을 출력
//        int[] intArr = {10,20,30,40,50,60};
//        for(int i = 0; i < intArr.length; i++){
//            for(int j = i + 1; j < intArr.length; j++){
//                int sum = intArr[i] + intArr[j];
//                System.out.println(sum);
//            }
//        }

//        // 배열의 복사
//        // copyOf(배열, length), copyOfRange(배열, start, end)
//        int[] arr = {10,20,30,40,50};
//        int[] newArr1 = Arrays.copyOf(arr, 10);
//        System.out.println(Arrays.toString(newArr1));
//        int[] newArr2 = Arrays.copyOfRange(arr, 1,4);
//        System.out.println(Arrays.toString(newArr2));

        // 배열의 중복제거
//        int[] temp = {10,10,5,7,40,40,10,10};
//        // 5, 7, 10, 10, 10, 40, 40
//        // list, set 도 쓰지 않고 중복 제거
//        // hint : 옆에 숫자와 같은지 안같은지 비교
//        // 새로운 배열의 길이는 넉넉하게 temp 길이만큼 배정 후 추후 copyofrange
//        Arrays.sort(temp);
//        int[] newTemp = new int[temp.length];
//        int num = 0;
//        for (int i = 0; i < temp.length; i++) {
//            if(i == 0 || temp[i] != temp[i-1]){
//                newTemp[num] = temp[i];
//                num++;
//            }
//        }
//        int [] answer2 = Arrays.copyOfRange(newTemp, 0, num);
//        System.out.println(Arrays.toString(answer2));

//        // 프로그래머스 - 두 개 뽑아서 더하기
//        int [] numbers = {2,1,3,4,1};
//        int [] temp = new int[numbers.length * numbers.length]; // 배열 크기 넉넉하게 잡기
//        int count = 0;
//        for(int i = 0; i < numbers.length; i++){
//            for(int j = i + 1; j < numbers.length; j++){
//                temp[count] = numbers[i] + numbers[j];
//                count++;
//            }
//        }
//        temp = Arrays.copyOf(temp, count);
//        Arrays.sort(temp);
//        // 중복 제거
//        int[] newTemp = new int[temp.length];
//        int num = 0;
//        for(int i = 0; i < temp.length; i++) {
//            if(i == 0 || temp[i] != temp[i+1]){
//                newTemp[num] = temp[i];
//                num++;
//            }
//        }
//        int [] answer = Arrays.copyOf(newTemp, num);
//        System.out.println(Arrays.toString(answer));

//        // 배열의 검색
//        int [] arr = {5,3,1,8,7};
//        int num = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == 8){
//                num = i;
//                break;
//            }
//        }
//        System.out.println(num);

//        // 이진검색(Binary Search) : 절반씩 잘라들어가면서 찾는 방식 ( 전제조건으로 정렬이 되어있어야 함 ) - 이분탐색
//        // 복잡도 O(logn)
//        int [] arr = {1,3,6,8,9,11,15};
//        // 사전에 오름차순 정렬이 되어 있어야 이진검색 가능
//        System.out.println(Arrays.binarySearch(arr,15));
//
//        // 배열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1 == arr2);
//        // Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1, arr2));

//        // 2차원배열 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//
//        // 리터럴 방식으로 할당
//        int[][] arr2 = {{1,2,3},{4,5,6}};
//        // {{1,2,3},{4,5,6}}
//
//        // 2차원 배열의 출력 : deepToString() 사용!!
//        System.out.println(Arrays.deepToString(arr2));

//        // 2차원 가변배열 선언 후 할당
//        int[][] arr = new  int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//
//        // 가변배열 리터럴 방식
//        int[][] arr2 = {{10,20},{10,20,30}};
//
//        // [3][4] 사이즈 배열을 선언한 뒤
//        // 1~12까지 숫자값 각 배열에 할당 후 출력
//        // {1,2,3,4}, {5,6,7,8}, {9,10,11,12}
//        int[][] temp = new int[3][4];
//        int count = 1;
//        for(int i = 0; i < temp.length; i++){
//            for(int j = 0; j < temp[i].length; j++){
//                temp[i][j] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(temp));
//    }

        // 행렬의 덧셈 프로그래머스
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] answer = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(answer));

        // 가변배열실습 : 행의 길이(전체배열의길이)5 => {{10},{20,20},{30,30,30},{40,40,40,40},{50,50,50,50,50}}
        int[][] test = new int[5][];
        for(int i = 0; i < test.length; i++){
            test[i] = new int[i+1];
            for(int j = 0; j < test[i].length; j++){
                test[i][j] = (i+1) * 10;
            }
        }
        System.out.println(Arrays.deepToString(test));

    }
}
