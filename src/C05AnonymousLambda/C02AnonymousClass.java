package C05AnonymousLambda;

public class C02AnonymousClass {
    public static void main(String[] args) {
//        abstractAnimal을 상속한 클래스가 별도로 존재하지 않고,
//        익명클래스가 만들어짐과 동시에 익명객체가 생성되고 있음.
//        구현체가 없는 추상클래스 또는 인터페이스는 익명객체로 생성 가능.
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound1() {
                System.out.println("C02AnonymousClass.makeSound1");
            }
        };
        a1.makeSound1();
        a1.makeSound2();

        Animal1 a2 = new Animal1() {
            @Override
            public void makeSound1() {

            }

            @Override
            public void makeSound2() {

            }
        };

//        인터페이스의 익명객체에 구현메서드가 1개밖에 없을 때에는 람다표현식(화살표함수) 사용가능
        Animal2 animal2 = () -> {
            System.out.println("hello world1");
            System.out.println("hello world2");
        };
        animal2.makeSound1();

        //    매개변수가 있는 익명객체의 람다함수 생성
        Animal3 getAnimal3 = (i, j, k) -> {
            return i + ", " + j + ", " + k;
        };
        Animal3 getAnimal4 = (i, j, k) -> i + ", " + j + ", " + k;
        System.out.println(getAnimal3.makeSound1("a", "b", "c"));

//        실습
//        Animal4 인터페이스 정의. makeSound메서드 선언(매개변수는 String, String, int. 리턴타입은 String)
//        익명객체 생성 : 메서드의 기능 - int숫자값이 10이상이면 a+b를 리턴, int숫자값이 10미만이면 a만 리턴.
        Animal4 animal4 = (a, b, i) -> (i >= 10) ? a + b : a;
        System.out.println(animal4.makeSound("java", "python", 11));




    }
}

abstract class AbstractAnimal {
    abstract void makeSound1();

    void makeSound2() {
        System.out.println("AbstractAnimal.makeSound2");
    }

    Animal3 animal3 = new Animal3() {
        @Override
        public String makeSound1(String a, String b, String c) {
            return null;
        }
    };
}

interface Animal1 {
    void makeSound1();

    void makeSound2();
}
interface Animal2 {
    void makeSound1();
}

interface Animal3 {
    String makeSound1(String a, String b, String c);
}

interface Animal4{
    String makeSound(String a, String b, int c);
}