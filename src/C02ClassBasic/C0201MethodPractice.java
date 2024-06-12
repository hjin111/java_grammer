package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {
        // 어떤 숫자값이 소수인지 아닌지를 판별하는 메서드 생성 => 리턴타입은 boolean, 매개변수는 int 숫자
        // main 메서드 안에서 해당 메서드 호출해서 판별 출력
        // if(참) 소수입니다. else 거짓입니다.
        if(isPrime(10)){
            System.out.println("소수입니다.");
        }else {
            System.out.println("소수가 아닙니다.");
        }

    }
    public static boolean isPrime(int number) {
        // 소수면 true, 소수가 아니면 false
        boolean isPrime = true;
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
//                isPrime = false;
//                break;

                // 메서드는 return을 만나면 바로 메서드를 종료 ( 메서드 자체를 종료 )
                // void 리턴 타입에서도 메서드 강제 종료를 위해 return 사용
                return false;
            }
        }
        return true;
//        return isPrime;
    }

    public static void isPrimePrint(int number) {
        // 소수면 true, 소수가 아니면 false
        boolean isPrime = true;
        for (int i = 2; i*i <= number; i++) {
            if (number % i == 0) {
//                isPrime = false;
//                break;

                // 메서드는 return을 만나면 바로 메서드를 종료 ( 메서드 자체를 종료 )
                // void 리턴 타입에서도 메서드 강제 종료를 위해 return 사용
                System.out.println("소수가 아닙니다.");
                return; // 메서드 종료
            }
        }
        System.out.println("소수입니다.");
//        return isPrime;
    }


}
