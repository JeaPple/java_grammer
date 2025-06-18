package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;

public class C06MethodOverLoading {
    public static void main(String[] args) {
//        메서드 오버로딩 사례
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(0,20);

//        직접 메서드 오버로딩 후 호출
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10.5, 20.5));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

}
