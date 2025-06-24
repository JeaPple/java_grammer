package C05AnonymousLambda;

public class C02AnonymousClass {
    public static void main(String[] args) {
//        abstractAnimal을 상속한 클래스가 별도로 존재하지 않고,
//        익명클래스가 만들어짐과 동시에 익명객체가 생성되고 있음.
//        구현체가 없는 추상클래스 또는 인터페이스는 익명객체로 생성 가능.
        AbstractAnimal a1 = new AbstractAnimal() {
            @Override
            void makeSound1() {

            }
        };



    }
}

abstract class AbstractAnimal {
    abstract void makeSound1();

    void makeSound2() {

    }
}
