package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

// public 클래스는 한 파일 안에 하나만 있어야 한다.
public class C0202Class {
    public static void main(String[] args) {
        System.out.println(MyCalculator.sum(10,20));

        // A 부서의 매출
        // 20원 발생
        MyCalculator.sumAcc(20);
        System.out.println(MyCalculator.total);
        // 30원 발생
        MyCalculator.sumAcc(30);
        System.out.println(MyCalculator.total);
        // 40원 발생
        MyCalculator.sumAcc(40);
        System.out.println(MyCalculator.total);

        // B 부서의 매출
        MyCalculator.total = 0;
        // 클래스메서드 호출 방식 : 클래스명.메서드명()
        MyCalculator.sumAcc(10);
        MyCalculator.sumAcc(20);
        MyCalculator.sumAcc(30);
        System.out.println(MyCalculator.total);

        // 객체를 사용한 회계프로그램 : 객체 고유의 메모리 공간 할당
        // A 회사의 매출
        MyCalculatorInstance m1 = new MyCalculatorInstance(); // m1이라는 복제본을 하나 만듬
        //  객체메서드 호출 방식 : 객체명.메서드명()
        m1.sumAcc(10);
        m1.sumAcc(20);
        m1.sumAcc(30);
        MyCalculatorInstance m2 = new MyCalculatorInstance();
        m2.sumAcc(100);
        m2.sumAcc(200);
        m2.sumAcc(300);

        System.out.println(m1.total);
        System.out.println(m2.total); // 자기 각자 고유의 total 값을 가지게 된다.(static 이랑은 다름)

        // 우리의 클래스 만들어서 -> 우리의 객체를 만들겠다.
        C0203Person person1 = new C0203Person();
        // 변수 값에 직접 접근하여 값을 할당하는 방식
//        person1.name = "홍길동";
//        person1.email = "홍길동@naver.com";
//        person1.age = 18;
//        person1.eating();
//        System.out.println("이름 : " + person1.name + "이메일은 " + person1.email);

        // 일반적인 패턴은 변수 값에 직접 접근하지 않는다.
        // 의도를 명확히한 메서드를 통해 변수값을 할당하고 가져옴.
        person1.eating();
        person1.setName("홍길동");
        System.out.println(person1.getName());
        person1.eating();
    }
}

class MyCalculator {

    // 공용변수, 공용메서드
    static int total = 0;
    static int sum(int a, int b) {
        return a + b;
    }

    static void sumAcc(int a){
        total += a;
    }
}

class MyCalculatorInstance {
// static이 붙어있는 변수는 클래스변수, static 이 붙어 있지 않으면 객체 변수(메서드도 마찬가지)

    int total = 0;
    int sum(int a, int b) {
        return a + b;
    }

    void sumAcc(int a){
        // this 는 객체 그 자신을 의미
        this.total += a;
    }

}