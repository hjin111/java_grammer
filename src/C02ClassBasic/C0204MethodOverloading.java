package C02ClassBasic;

public class C0204MethodOverloading {
    public static void main(String[] args) {
       C0204MethodOverloading c1 = new C0204MethodOverloading();
        System.out.println(c1.sum(10,20));
        System.out.println(c1.sum(10,20,30));
        System.out.println(c1.sum(10.1,10.2));
    }

    // 접근제어자를 안 붙이면 기본적으로 default 접근 제어자 : 같은 패키지 내에서만 유효
    int sum(int a, int b) {
        return a + b;
    }

    // 매개변수의 타입 또는 개수가 다르면, 같은 이름의 메소드 정의 가능. 즉, 메서드 오버로딩
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    double sum(double a, double b) {
        return a + b;
    }

}
