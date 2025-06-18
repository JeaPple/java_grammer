package C02ClassBasic;

public class C04PersonMain {
    public static void main(String[] args) {

//        회원가입 예시
        String name1 = "hong1";
        String email1 = "hong1@naver.com";
        int age1 = 30;

        String name2 = "hong2";
        String email2 = "hong2@naver.com";
        int age2 = 35;
        printMember(name2, email2, age2);
//        위와 같은 방식의 문제점
//        어떤 요소들이 그룹화되어 있지 않다보니, 중복과 코드의 가독성이 저하

//        위와 같은 문제점을 해결하기 위해 클래스에 속성을 정의하고, 객체로 생성하여 그룹화.
//        C04Person p2 = new C04Person();
//        p2.name = "hong2";
//        p2.email = "hong2@naver.com";
//        p2.age = 20;

//        p1을 별도의 메서드 없이 그냥 출력할 경우 p1의 힙메모리 주소값이 출력.

////        Person의 변수값이 public 오픈돼 있을 경우 다른 클래스(패키지)에서 쉽게 변경가능
//        p2.name = "hone";

        C04Person p3 = new C04Person();
        p3.setName("hong");
        p3.setEmail("hong@naver.com");
        p3.setAge(20);
        p3.printPerson();
    }


    public static void printMember(String name, String email, int age) {
        System.out.println("이름은: " + name + " 이메일은: " + email + " 나이는: " + age);
    }


}
