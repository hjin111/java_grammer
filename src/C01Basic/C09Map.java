package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        Map<String,String> myMap = new HashMap<>();
//        myMap.put("basketball","농구");
//        myMap.put("soccer","축구");
//        myMap.put("baseball","야구");
////        System.out.println(myMap);
////        System.out.println(myMap.get("soccer"));
////        myMap.put("baseball","크리켓");
////        baseball을 map에서 검색하는 복잡도 O(1)
////        System.out.println(myMap.get("baseball"));
//        myMap.remove("baseball");
////        putIfAbsent : 비어있으면 put
//        myMap.putIfAbsent("basketball", "배구"); // 있는지 확인하고 넣는다.
////        getOrDefault : key가 없으면 default값 return
//        System.out.println(myMap.get("baseball"));
//        System.out.println(myMap.getOrDefault("baseball","비어있음"));
//        System.out.println(myMap.containsKey("baseball")); 값이 있는지 없는지
//        String[] arr = {"농구", "농구", "배구","야구","배구"};
////        우리반의 운동취향 농구:2 배구 :2 야구:2
//        Map<String,Integer> myMap = new HashMap<>();
//        for(String a : arr){
//            myMap.put(a, myMap.getOrDefault(a, 0)+1);
//        }
//        System.out.println(myMap);
//
////        keySet() : 키 목록을 반환
////        values() : value 목록을 반환
//
////        enhanced for문을 통해 key값 하나씩 출력
//        for(String a : myMap.keySet()){ // 컬렉션 자료구조면 향상된 포문 다 가능(?)
//            System.out.println(a);
//            System.out.println(myMap.get(a));
//        }
//        for(int a : myMap.values()){
//            System.out.println(a);
//        }
//
////        iterator를 통해 key값 하나씩 출력
//        Iterator<String> myIter = myMap.keySet().iterator();
////        next()메서드는 데이터를 하나씩 소모시키면서 return
////        System.out.println(myIter.next());
////          hasNext() : iterator 안에 값이 있는지 없는지 boolean return
//        while (myIter.hasNext()){
//            System.out.println(myIter.next());
//        }

////       프로그래머스 완주하지못한선수
//        String[] participant = {"mislav", "stanko", "mislav", "ana"};
//        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"stanko", "ana", "mislav"};
//        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
//
////        List<String> partiList = new ArrayList<>(Arrays.asList(participant2));
////        List<String> comList = new ArrayList<>(Arrays.asList(completion2));
////        for(String c:comList){
////            partiList.remove(c);
////        }
//
//        Map<String, Integer> parti = new HashMap<>();
//        for(String p : participant2){
//            parti.put(p,parti.getOrDefault(p,0)+1);
//        }
//        for(String c : completion2){
//            if(parti.containsKey(c)){
//                if(parti.get(c)==1){
//                    parti.remove(c);
//                }else {
//                    parti.put(c,parti.get(c)-1);
//                }
//            }
//        }
//        String answer ="";
//        for(String a : parti.keySet()){
//            answer = a;
//        }
//
////        프로그래머스 의상
//        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        Map<String,Integer> cMap = new HashMap<>();
//        for(int i=0;i<clothes.length;i++){
//            cMap.put(clothes[i][1],cMap.getOrDefault(clothes[i][1],0)+1);
//        }
//
////        Map<String,String> cMap = new HashMap<>();
////        for(int i=0;i<clothes.length;i++){
////            cMap.put(clothes[i][0],clothes[i][1]);
////        }
//        int answer =1;
//        for(int i: cMap.values()){
//            answer = answer *(i+1);
//        }
//        answer = answer-1;

////        LinkedHashMap : 데이터 삽입순서 유지
//        Map<String,Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5",1);
//        linkedMap.put("hello4",1);
//        linkedMap.put("hello3",1);
//        linkedMap.put("hello2",1);
//        linkedMap.put("hello1",1);
//        System.out.println(linkedMap);

////        TreeMap : key를 통해 데이터를 정렬(최적화 logN)
//        Map<String,Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5",1);
//        treeMap.put("hello4",1);
//        treeMap.put("hello3",1);
//        treeMap.put("hello2",1);
//        treeMap.put("hello1",1);
//        System.out.println(treeMap);

//        프로그래머스 문자열 내 마음대로 정렬하기
        String[] strings = {"sun", "bed", "car"};
        int n = 1;
//        Map<String,Character> treeMap = new TreeMap<>();
//        for(int i=0;i<strings.length;i++){
//            treeMap.put(strings[i], strings[i].charAt(n));
//        }
//        String[] answer = new String[strings.length];
//        int count =0;
//        for(String i : treeMap.keySet()){
//            answer[count] = i;
//            count++;
//        }

//        Map<String,String> treeMap = new TreeMap<>();
//        for(String a : strings){
//            treeMap.put(a.charAt(n)+a, a);
//        }
//        String [] answer = new String[strings.length];
//        int count =0;
//        for(String  a : treeMap.values()){
//            answer[count] = a;
//            count++;
//        }







    }
}