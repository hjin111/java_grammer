package C02ClassBasic;

public class C0203Person {
    private String name;
    private String email;
    private int age;
    public void eating(){
        System.out.println( this.name + "이 밥을 먹는다."); // this 에는 자기 자신 객체가  들어가니깐 person1이 들어감
    }

    // setter
    public void setName(String name){
        this.name = name;
    }

    // getter
    public String getName(){
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
