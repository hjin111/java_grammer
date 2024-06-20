package C07ExceptionFileParsing.AuthorException;

import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {

        // 한 번만 AuthorService 만들기 -> 매번 AuthorService 를 만들면 authorList 가 비워진다
        AuthorService authorService = new AuthorService();

        while(true){

            // 입력
            // 1.회원가입 2.로그인
            System.out.println("1.회원가입 2.로그인");
            Scanner sc = new Scanner(System.in);
            int choice = Integer.parseInt(sc.nextLine());
            // 회원가입
            if(choice == 1){

                System.out.print("이름을 입력하세요 : ");
                String name = sc.next();
                System.out.print("이메일을 입력하세요 : ");
                String email = sc.next();
                System.out.print("비밀번호를 입력하세요 : ");
                String password = sc.next();
                authorService.register(name, email, password);

            }

            // 로그인
            else if(choice == 2){
                System.out.println("이메일을 입력하세요");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력하세요");
                String password = sc.nextLine();
                try {
                    authorService.login(email, password);
                }catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace(); // 콘솔에 로그 남김
                }

            }
        }

    }
}
