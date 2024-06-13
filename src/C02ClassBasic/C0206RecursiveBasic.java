package C02ClassBasic;

public class C0206RecursiveBasic {
    public static void main(String[] args) {

        // for 문으로 1~10까지 누적합계
        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println(total);
        System.out.println(addAcc(10));

        // 피보나치 수열 구현 => 100번째
        // 1 1 2 3 5
        int first = 1;
        int second = 1;
        for(int i = 2; i < 5; i++){
            int temp = first;
            first = second;
            second = temp + first;
        }
        System.out.println(second);

        System.out.println(fibonacci(5));

    }

    static int fibonacci(int a){
        if(a <= 2){
            return 1;
        }
        return fibonacci(a-1) + fibonacci(a-2);
    }

    static int addAcc(int n){
        if(n == 1){
            return 1;
        }
        return n + addAcc(n-1);
    }
}
