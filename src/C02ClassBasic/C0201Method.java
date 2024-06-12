package C02ClassBasic;

public class C0201Method {
    public static void main(String[] args) {

        // for 문을 이요해서 1-10까지 total 값 출력
        int total = 0;
        for(int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println(total);

        // for 문을 이요해서 10-20까지 total 값 출력 => 중복 발생
        int total2 = 0;
        for(int i = 10; i <= 20; i++) {
            total2 += i;
        }
        System.out.println(total2);

        // 코드의 중복이 발생하므로, 반복을 피하기 위해 위 기능을 분리

        System.out.println(sumAcc(100,200));
        // sumAcc(100,200);

        // 클래스명.메서드 : 기본방식
        // 같은 클래스 내에서의 클래스 메서드 호출은 클래스명 생략 가능
        System.out.println(C0201Method.sumAcc(100,200));

    } // main 메서드

    // int 라는 리턴 타입을 가짐
    // input(매개변수) 값을 int 2개로 정의
    // 메서드 구성요소 : 매개변수, 리턴타입(리턴 타입이 없으면 void), 접근제어자(public), 클래스 메서드 여부(static) : static 이 붙어 있으면 클래스 함수이고 안 붙어 있으면 객체 함수이다.
    public static int sumAcc(int start, int end){
        int total = 0;
        for(int i = start; i <= end; i++) {
            total += i;
        }
        return total;
    }

    // 리턴 값이 void 일때
//    public static void sumAcc(int start, int end){
//        int total = 0;
//        for(int i = start; i <= end; i++) {
//            total += i;
//        }
//        System.out.println(total);
//    }

}
