package C07ExceptionFileParsing.memberException;

public class Member {
    private static Long staticId = 0L;
    private Long id;
    private String name;
    private String email;
    private String password;

    public Member(String name, String email, String password) {
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
        staticId++;
    }

    public Long getId() {
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

    @Override
    public String toString() {
        return String.format("ID: %d | 이메일: %s | 이름: %s", id, email, name);
    }

}
