package C04Interface;

public class InterfaceMain {
    public static void main(String[] args) {

        CatImplements cat1 = new CatImplements();
        cat1.makesound();
        DogImplements dog1 = new DogImplements();
        dog1.makesound();

        AnimalInterface1 cat2 = new CatImplements();
        cat2.makesound();
        AnimalInterface1 dog2 = new DogImplements();
        dog2.makesound();
        // 다형성 : 하나의 객체가 여러개의 참조변수를 가질 수 있음을 의미

        CatMultiImplements cat3 = new CatMultiImplements();
        cat3.makesound();
        System.out.println(cat3.play("러시안블루", "먼치킨"));

        DogMultiImplements dog3 = new DogMultiImplements();
        dog3.makesound();
        System.out.println(dog3.play("진돗개", "시바견"));

//        AnimalInterface1 cat4 = new CatMultiImplements();
//        cat4.makesound();
//        System.out.println(cat4.play("러시안블루", "먼치킨"));
//
//        AnimalInterface2 dog4 = new DogMultiImplements();
//        dog4.makesound();
//        System.out.println(dog4.play("진돗개", "시바견"));

        // 기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나
        // 익명내부클래스 방식으로 생성 가능 / ai1은 익명 객체이다
        AnimalInterface1 ai1 = new AnimalInterface1() {
            @Override
            public void makesound() {
                System.out.println("hello");
            }
        };
        ai1.makesound();
    }
}
