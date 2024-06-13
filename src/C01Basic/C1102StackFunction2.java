package C01Basic;

public class C1102StackFunction2 {

    public static void main(String[] args) {
        System.out.println("main 함수 시작");
        function1(1);
        System.out.println("main 함수 끝");
    }

    static int function1(int a) {
        System.out.println("function1 시작 " + a);
        System.out.println("function1 끝");
        return function1( a + 1  );
    }

    // 재귀함수를 잘못 사용하게 되면 스택오버플로우가 발생할 수 있다.

}
