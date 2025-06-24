package C03Ingeritance.ProtectedPackage;

// 같은 패키지내의 클래스가 아닌 경우에는 import필요
// 패키지 바로 하위의 모든 class는 *로 import 가능.
// 다만, 패키지내의 패키지안의 class는 *로 import불가
import C03Ingeritance.*;

// class에는 public, default 접근제어자만 존재
public class ProtectedTest extends C04ProtectedClass{
    public static void main(String[] args) {
        C04ProtectedClass p1 = new ProtectedTest();
//        public : 접근제어자는 프로젝트 전역에서 접근가능
//        private : 클래스내에서만 접근가능
//        default : 생략가능. 패키지내에서만 접근가능
//        protected : 패키지를 벗어나더라도 상속관계인 경우에는 접근가능


        p1.st1 = "hello python";
//        패키지가 달라졌으므로 default변수는 접근 불가
        p1.st4 = "hello python";

        C04ProtectedClass p2 = new C04ProtectedClass();
//        p2는 부모클래스의 객체이므로, 상속관계가 있는 객체가 아니므로, protected변수

    }
}
