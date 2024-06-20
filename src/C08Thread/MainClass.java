package C08Thread;

public class MainClass {
    public static void main(String[] args) throws InterruptedException{

        // 스레드 생성 방법 2가지 : 1.스레드 상속 방식
//        Thread1 t1 = new Thread1();
//        // start 메서드가 상속되어 있고, 이 메서드를 통해 run 메서드 실행
//        t1.start();
//        Thread t2 = new Thread1();
//        t2.start();
//
//        // 2. Runnable 구현한 객체를 Thread 클래스에 주입 방식
//        Thread t3 = new Thread(new Thread2());
//        t3.start();
//        new Thread(new Thread2()).start();
//        new Thread(()->System.out.println("익명 Runnable 객체 주입 후 실행 Thread")).start();
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("익명 Runnable 객체 주입 후 실행 Thread");
//            }
//        }).start();


//
//        // Thread 동시성 이슈 테스트
//        // 단일 스레드, 동기화 되어 있는 코드
//        for (int i = 0; i < 1000; i++) {
//            Library.borrow();
//        }
//        System.out.println("최종적으로 남은 수량 " + Library.bookCount);

        // 멀티 스레드, 동기화 되어 있지 않은 코드
        for(int i = 0; i < 500000; i++){
            Thread t1 = new Thread(() -> Library.borrow());
            t1.start(); // run 메서드 구현체를 집어넣은 () -> Library.borrow() 이게 실행이 됨 // 사실상 완전한 동시는 아님...

            // 동시성 이슈 해결 방법 첫번째. join() 메서드 사용
            // join() : 다른 스레드의 완료 전까지 새로운 스레드가 실행되지 않음
            t1.join();
        }
        System.out.println("최종적으로 남은 수량 " + Library.bookCount);

    }
}
