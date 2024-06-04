package C01Basic;

public class C03Operator {
    public static void main(String[] args) {
        // 산술연산자 : 사칙연산
//        int n1 = 8, n2 = 3;
//        // *:곱셈, /:나눗셈(몫), %:나머지
//        // +,-,*,/,% 결과값 출력
//        System.out.println("n1 + n2 = " + (n1 + n2));
//        System.out.println("n1 - n2 = " + (n1- n2));
//        System.out.println("n1 / n2 = " + (n1 / n2));
//        System.out.println("n1 * n2 = " + (n1 * n2));
//        System.out.println("n1 % n2 = " + (n1 % n2));

        // 대입 연산자
//        int n1 = 7;
//        int n2 = 7;
//        int n3 = 7;
//
//        n1 = n1 - 3;
//        n2 -= 3;
//        n3 =- 3; // -3
//        System.out.println(n1);
//        System.out.println(n2);
//        System.out.println(n3);

//        int n4 = 10;
//        int n5 = 10;
//        n4 /= 3;
//        System.out.println(n4);
//        n5 %= 3;
//        System.out.println(n5);

        // 증감연산자
        int a = 10;
        a = a+1;
        System.out.println(a); // 11
        a += 1;
        System.out.println(a); // 12
        a++; // 13 후위 증감 연산자
        ++a; // 14 전위 증감 연산자
        System.out.println(a);

        // 후위증감연산자
        int b = 5;
        int c = b++; // 실행문이 끝나고 b 값이 증가
        int d = ++b; // 실행문이 끝나기 전에 b 값이 증가
        System.out.println(c); // 5
        System.out.println(d); // 7

//        int b = 5;
//        int c = b;
//        b++;
//        b++;
//        int d = b;

        // 비교연산자 : ==, !=, >, >= 등
        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println(ch1 == ch2); // false
        System.out.println(ch1 != ch2); // true

        //  논리 연산자 : &&, ||, !
        int num1 = 10; int num2 = 20;
        boolean result1;
        // num1이 5보다 큰지와 num1이 20보다 작은지 and 조건을 통해 boolean 값 세팅
        result1 = num1 > 5 && num1 < 20;
        System.out.println(result1);
        // num2가 10보다 작은조건과 num2가 30보다 작은 조건을 or 조건으로 boolean 값 세팅
        // 해당 결과값에 부정의 ! 추가
        boolean result2 = !(num2 < 10 || num2 < 30);
        System.out.println(result2);

        // 비트연산자 : &, |, ^, ~
        int n1 = 5; //101
        int n2 = 4; //100
        int n3=n1&n2;
        System.out.println(n3);
        int n4=n1|n2;
        System.out.println(n4);
        int n5=n1^n2;
        System.out.println(n5); // 1 => 00000001 => 11111110

        // 시프트 연산 : <<(왼쪽으로 이동), >>(오른쪽으로 이동)
        // 00000101 => 00001010
        // 왼쪽으로 한칸 이동 한다는 의미는 2를 곱한다는 의미
        System.out.println(n4 << 1); // 한칸 이동
    }
}
