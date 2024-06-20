package C07ExceptionFileParsing.AuthorException;

import java.util.List;

public class AuthorService {

    private AuthorRepository authorRepository;

    AuthorService(){ // AuthorService 생성자 호출되면 AuthorRepository 가 초기화 됨
        authorRepository = new AuthorRepository();
    }

    public void register(String name, String email, String password){
        Author author = new Author(name, email, password); // 메모리상에 author 객체 만들어짐
        authorRepository.register(author);
    }

    public void login(String email, String password) throws IllegalArgumentException {
        // 해당하는 email이 있는지 : authorList 목록 조회
        // 그 email에 이 password가 맞는지
        List<Author> authorList = authorRepository.getAuthorList();
        boolean emailNotFound = false;
        boolean passwordNotEqual = false;
        for( Author a : authorList ){
            if(a.getEmail().equals(email)){
                emailNotFound = true;
                if(a.getPassword().equals(password)){
                    passwordNotEqual = true;
                }
            }
        }
        if(emailNotFound == false){
            throw new IllegalArgumentException("이메일이 없습니다.");
        }
        if(passwordNotEqual == false){
            throw new IllegalArgumentException("password가 일치하지 않습니다.");
        }

    }

}
