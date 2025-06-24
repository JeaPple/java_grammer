package C03Ingeritance;

// 'extends' 키워드를 통해 상속을 수행 -> 부모의 변수와 메서드를 자식클래스에서 물려받는 것.
// java에서는 클래스의 다중상속을 지원하지 않음.
public class C0301Inheritance extends Parents{
    public int b = 20;
    public static void main(String[] args) {
        C0301Inheritance c1 = new C0301Inheritance();
//        자식클래스에서 부모클래스의 a변수 상속
        System.out.println(c1.a);
        System.out.println(c1.b);
        c1.m1();
    }

    //    부모 메서드의 재정의(Overriding) : 부모클래스의 메서드명과 자식클래스의 메서드명이 동일한 상황
    @Override // override된 메서드임을 명시적으로 표현하는 표현식.
    public void m1() {
        System.out.println("C0301Inheritance.m1");
    }

    public void m2() {
        System.out.println("C0301Inheritance.m2");
    }
}

class Parents{
    public int a = 10;
//    private 접근제어자는 클래스내부에서만 접근가능
//    자식클래스에서도 접근 불가.
    private int b = 20;
    public void m1() {
        System.out.println("Parents.m1");
        System.out.println("Parents.b = " + b);
    }
}
