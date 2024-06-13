package C03Inheritance;

public class C0303MethodOverriding {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound2();

        // 상속관계일때 부모클래스타입을 자식클래스 객체의 타입으로 지정 가능
        // animal 클래스에 정의된 메서드만 사용가능하도록 제약 발생
        Animal myDog2 = new Dog();
        // myDog2.sound2(); // 컴파일 에러 발생
    }
}

    class Animal{
        void sound(){
            System.out.println("동물은 소리를 냅니다.");
        }
    }
    class Dog extends Animal{
        void sound(){
            System.out.println("멍멍");
        }
        void sound2(){

        }
    }
    class Cat extends Animal{
        void sound(){
            System.out.println("야옹");
        }
    }

