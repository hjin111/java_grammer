package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.peek()); // 값을 꺼내만 보고 그대로
//        System.out.println(myQue);
//        System.out.println(myQue.poll()); // 값을 아예 빼낸다.
//        System.out.println(myQue);

////        linkedlist와 arraylist 비교   /// 안된다...어디서 졸았지...
////        LinkedList의 add
//
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i=0;i<10000;i++) {
//            list1.add(0,10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist의 중간삽입 :" + (endTime-startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i=0;i<10000;i++) {
//            list2.add(0,10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("arraylist의 중간삽입 :" + (endTime2-startTime2));

//
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i=0;i<10000;i++) {
//            list1.get(i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedlist의 조회 :" + (endTime-startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i=0;i<10000;i++) {
//            list2.get(i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("arraylist의 조회 :" + (endTime2-startTime2));





        // LinkedList 와 ArrayList 시간 복잡도 비교
        // LinkedList 의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list1.add(0, 10);
//        }
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("LikedList의 중간 삽입 : " + (endTime - startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list2.add(0, 10);
//        }
//
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입 : " + (endTime2 - startTime2));
//
//        long startTime3 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("LikedList의 조회 : " + (endTime3 - startTime3));
//
//        long startTime4 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list2.add(0, 10);
//        }
//
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입 : " + (endTime4 - startTime4));

//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }

////        ArrayBlockingQueuq : 길이제한큐
//        Queue<String> queue = new ArrayBlockingQueue<>(3);
////        add 를 사용시 길이제한 초과시 예외 발생
////        queue.add("10");
////        queue.add("20");
////        queue.add("30");
////        queue.add("40");
//        queue.offer("10");
//        queue.offer("20");
//        queue.offer("30");
//        queue.offer("40"); // 예외가 안생겨용
//        System.out.println(queue);

//        우선순위 queue // 우선순위 : 데이터를 꺼낼 때 정렬된 데이터 pop // 데이터가 들어갔다가 나왔다가 하면서도 정렬~
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(50);
        System.out.println(pq);
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

//      더 맵게 :  특정 숫자들을 꺼내서 재조립해서 다시 집어 놓고, 그 다음 가장 작은 값을 꺼내고
//      마지막 1개 남으면 2번 poll 하면 에러나니깐 마지막값 check peek()
//      섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        Queue<Integer> scov = new PriorityQueue<>();
        for(int i:scoville){
            scov.add(i);
        }


        // stack
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
        st1.push(20);
        st1.push(30);
        // pop:스택에서 요소를 제거 후 해당 요소 반환
        System.out.println(st1.pop());
        System.out.println(st1.peek()); // 20
        System.out.println(st1.size());
        System.out.println(st1.isEmpty());

        // String 객체 5개 정도 Stack 추가 후에 while문을 통해 출력
        Stack<String> st2 = new Stack<>();
        st2.push("a1");
        st2.push("b1");
        st2.push("c1");
        st2.push("d1");
        st2.push("e1");
        while(!st2.isEmpty()){
            System.out.println(st2.pop());
        }

        // 같은 숫자는 싫어 ( 프로그래머스 )
        // stack 코드 - 뒤에서부터 꺼내볼 수 있음
        int[] arr = {1,1,3,3,0,1,1};
        Stack<Integer> stack = new Stack<>();
        for(int a : arr){
            if(stack.isEmpty()){
                stack.push(a);
            } else {
                if(stack.peek() != a){ // 앞에 들어간 값 살짝 꺼내봐서 같은지 안같은지 확인해서 push 하기
                    stack.push(a);
                }
            }
        }
        int[] answer = new int[stack.size()];
//        for(int a : stack){
//            System.out.println(a);
//        }
        for(int i = answer.length - 1; i >= 0; i--){
            answer[i] = stack.pop();
        }
        System.out.println(Arrays.toString(answer));

        // 중복 제거 코드
        List<Integer> myList = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if( i==0 || arr[i-1] != arr[i]){
                myList.add(arr[i]);
            }
        }
        System.out.println(myList);

        // 올바른 괄호
        // Deque
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        System.out.println(d1);
        d1.addFirst(30);
        System.out.println(d1);
        System.out.println(d1.peekFirst()); // poll
        System.out.println(d1.peekLast()); // pop
        System.out.println(d1.pop()); // 뒤에서 꺼내는것

        // 다리를 지나는 트럭 ( Deque 문제 )

    }
}