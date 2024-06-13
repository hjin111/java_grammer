package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {

        // 회원 리스트
        List<Author> authors = new ArrayList<Author>();
        // 게시글 리스트
        List<Post> posts = new ArrayList<Post>();

        while(true){
            System.out.println("1.회원가입 2.회원 전체 목록 조회 3.회원 상세 목록 조회 4.게시글 작성 5.게시글 목록 조회 6.게시글 상세 조회 7.종료");
            Scanner sc = new Scanner(System.in);
            int option = Integer.parseInt(sc.nextLine());
            // 회원가입
            if(option == 1){
                System.out.println("이름을 입력하세요.");
                String name = sc.nextLine();
                System.out.println("이메일을 입력하세요.");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력하세요.(숫자)");
                int password = Integer.parseInt(sc.nextLine());
                Author author = new Author(name, email, password);
                authors.add(author);
            }
            // 회원 전체 목록 조회
            else if(option == 2){
                if(authors.isEmpty()){
                    System.out.println("조회 할 회원이 없습니다 ㅡㅅㅡ 회원가입을 해주세요");
                }else{
                    for(int i = 0; i < authors.size(); i++){
                        System.out.println("------------------------");
                        System.out.println( ( i + 1 ) + "번 회원");
                        System.out.println("이름 : " + authors.get(i).getName());
                        System.out.println("이메일 : " + authors.get(i).getEmail());
                        System.out.println("------------------------");
                    }
                }
            }
            // 회원 상세 조회
            else if(option == 3){
                if(authors.isEmpty()){
                    System.out.println("조회 할 회원이 없습니다 ㅡㅅㅡ 회원가입을 해주세요");
                }else {
                    System.out.println("조회 할 id를 입력하세요.");
                    long inputId = Long.parseLong(sc.nextLine());
                    for (int i = 0; i < authors.size(); i++) {
                        if (authors.get(i).getId() == inputId) {
                            System.out.println("아이디 : " + authors.get(i).getId());
                            System.out.println("이름 : " + authors.get(i).getName());
                            System.out.println("이메일 : " + authors.get(i).getEmail());
                            System.out.println("비밀번호 : " + authors.get(i).getPassword());
                        } else if (authors.get(i).getId() != inputId) {
                            System.out.println("없는 회원입니다 ㅡㅅㅡ ");
                        }
                    }
                }

            }
            // 게시글 작성
            else if(option == 4){
                System.out.println("게시글 작성 할 이메일을 입력해주세요");
                String InputEmail = sc.nextLine();
                for(int i = 0; i < authors.size(); i++){
                    if(authors.get(i).getEmail().equals(InputEmail)){
                        System.out.println("제목을 입력하세요");
                        String InputTitle = sc.nextLine();
                        System.out.println("내용을 입력하세요");
                        String InputContent = sc.nextLine();
                        Post post = new Post(InputTitle, InputContent, InputEmail);
                        posts.add(post);
                        System.out.println("게시글이 작성 되었습니다.><");
                    }
                }
            }
            // 게시글 목록 조회
            else if(option == 5){
                if(posts.isEmpty()){
                    System.out.println("조회 할 게시글이 없습니다.");
                }else{
                    for(int i = 0; i < posts.size(); i++){
                        System.out.println("------------------------");
                        System.out.println("게시글 아이디 : " + posts.get(i).getId());
                        System.out.println("게시글 제목 : " + posts.get(i).getTitle());
                        System.out.println("------------------------");
                    }
                }
            }
            // 게시글 상세 조회
            else if(option == 6){
                if(posts.isEmpty()){
                    System.out.println("조회 할 게시글이 없습니다.");
                }else{
                    System.out.println("이메일을 입력하세요");
                    String InputEmail = sc.nextLine();
                    for(int i = 0; i < posts.size(); i++){
                        if(posts.get(i).getEmail().equals(InputEmail)){
                            System.out.println("아이디 : " + posts.get(i).getId());
                            System.out.println("제목 : " + posts.get(i).getTitle());
                            System.out.println("내용 : " + posts.get(i).getContents());
                            System.out.println("이메일 : " + posts.get(i).getEmail());
                        }
                    }
                }
            }
            // 종료
            else if (option == 7) {
                break;
            }

        }
    }
}

class Author {

    static long static_id = 0L;
    private long id;
    private String name;
    private String email;
    private int password;

    // 회원가입
    public Author(String name, String email, int password) {
        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter
    public int getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}

class Post{

    static long static_id = 0L;
    private long id;
    private String title;
    private String contents;
    private String email;

    // 게시글 작성
    public Post(String title, String contents, String email) {
        static_id += 1;
        this.id = static_id;
        this.title = title;
        this.contents = contents;
        this.email = email;
    }

    // Getter
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public String getEmail() {
        return email;
    }

}