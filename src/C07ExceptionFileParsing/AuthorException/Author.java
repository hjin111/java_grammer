package C07ExceptionFileParsing.AuthorException;

public class Author {

    static int static_id;
    private int id;
    private String name;
    private String email;
    private String password;

    // 생성자
    public Author(String name, String email, String password){
        static_id++;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
