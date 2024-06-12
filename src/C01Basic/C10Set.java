package C01Basic;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {

//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

////        프로그래머스 폰켓몬
//        int[] nums = {3,1,2,3};
//        Set<Integer> mySet = new HashSet<>();
//        for(int n : nums){
//            mySet.add(n);
//        }
//        int answer =0;
//        if(mySet.size()> nums.length/2){
//            answer = nums.length/2;
//        }else {
//            answer = mySet.size();
//        }
//
//        List<String> myList = new ArrayList<>();
//        myList.add("tennis");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("basketball");
//        myList.add("basketball");
//
////       list를 인자값으로 받아서 초기값 세팅 가능
//        Set<String> mySet = new HashSet<>(myList);
//
//        String[]arr = {"baseball", "baseball","basketball"};
//        Set<String> mySet2 = new HashSet<>(Arrays.asList(arr));
//        mySet2.remove("baseball");
//        System.out.println(mySet2);

////        프로그래머스 전화번호 목록
//        String[] phone_book = {"119", "97674223", "1195524421"};
//        boolean answer = true;
//        Set<String> mySet = new HashSet<>(Arrays.asList(phone_book));
////        loop1:
////        for(String a : phone_book){
////            for(String b : phone_book){
////                if(!a.equals(b) && b.contains(a) && b.indexOf(a)==0){ // 마지막 조건 없으면 접두사가 아닌 것도 포함해 버린다.
////                    answer = false;
////                    break loop1;
////                }
////            }
////        }

////        집합관련함수 : 교집합(retainAll) 합집합(addAll) 차집합(removeAll)  set끼리
//        Set<String> set1 = new HashSet<>(Arrays.asList("java","python","javascript"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("java","html","css"));
//        set1.retainAll(set2); // set1자체가 교집합으로 변경
//        set1.addAll(set2);
//        set1.removeAll(set2); // set1.remove(set2);
////        System.out.println(set1);
////        관련문제 : 뉴스 클러스터링 // set은 중복제거에 탁월

//        LinkedHashSet TreeSet
        Set<String> mySet = new TreeSet<>();
        mySet.add("hello5");
        mySet.add("hello5");
        mySet.add("hello4");
        mySet.add("hello1");
        System.out.println(mySet);

//        두개 뽑아서 더하기 : 배열 리스트 treeset
        int[] numbers = {5,0,2,7};


//        import java.util.*;
//        class Solution {
//            public int[] solution(int[] numbers) {
//                Set<Integer> set = new TreeSet<>();
//                for(int i = 0; i<numbers.length; i++){
//                    for(int j = i+1; j < numbers.length; j++){
//                        set.add(numbers[i]+numbers[j]);
//                    }
//                }
//                int answer[] = new int[set.size()];
//                int count = 0;
//                for(int n: set){
//                    answer[count] = n;
//                    count++;
//                }
//                return answer;
//            }
//        }

    }
}