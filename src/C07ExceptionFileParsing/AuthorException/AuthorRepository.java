package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

// list 에 add 등 메모리 DB에 저장하는 로직
// DB 조회
public class AuthorRepository {

    private List<Author> authorList;

    AuthorRepository() {
        authorList = new ArrayList<>();
    }

    void register(Author author){
        this.authorList.add(author);
    }

    List<Author> getAuthorList(){
        return this.authorList;
    }

}
