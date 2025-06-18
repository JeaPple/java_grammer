package C02ClassBasic;

public class C04Person {
//    private접근제어자는 해당 클래스 내에서만 접근 가능
//    클래스에서 객체변수는 일반적으로 변수의 안정성을 위해 private으로 설정
    private String name;
    private String email;
    private int age;

    //    메서드는 public하게 별도로 만들어서 의도를 명확히 하여, 변수의 안정성 향상


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String printPerson() {
        return "이름: " + name + ", 이메일: " + email + ", 나이: " + age;
    }

//    객체 메서드들끼리의 호출은 객체가 만들어져 있다 라는 것을 가정하고 있으므로, 문제없이 호출 가능.

}
