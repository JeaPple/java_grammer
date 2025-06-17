package CO1Basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C11QueStackDeque {
    public static void main(String[] args) {
////        Queue인터페이스를 LinkedList가 구현한 아래와 같은 방식을 가장 많이 사용
////        강사님: 이 자료구조의 특징이 무엇인지 알고있는 게 중요하다.
////              단순히 메서드를 외우은 것보다,,
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
////        poll: queue에서 데이터를 삭제하면서, 동시에 return하는 메서드 - 무조건 외우라
//        int temp = myQue.poll(); // 10
//        System.out.println(temp);
//        System.out.println(myQue); // 20, 30
////        peek : queue에서 데이터를 삭제하지 않고, 가장 앞의 데이터를 반환
//        int temp2 = myQue.peek(); // 20
//        System.out.println(temp2);
//        System.out.println(myQue); // 20, 30
//
////        LinkedList와 ArrayList 성능차이 비교
//        long startTime = System.currentTimeMillis();
//        LinkedList<Integer> linkedList = new LinkedList<>();
//        for (int i = 0; i < 10000000; i++) {
//            linkedList.add(0, i);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linkedList에 값 중간 add 시에 소요시간: " + (endTime - startTime));
//
//        long startTime2 = System.currentTimeMillis();
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        for (int i = 0; i < 10000000; i++) {
//            arrayList.add(0, i);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("arrayList에 값 중간 add 시에 소요시간: " + (endTime2 - startTime2));
////      복습 타임: 여기서 왜 arrayList는 복잡도가 n^2이 될까?
//
////        정답 : for문으로 앞에 넣어주는 작업 n * index를 전부 미루는 작업 n
////        linkedList는 index를 전부 미루는 작업 n이 없기때문에 n의 복잡도를 가진다.

        Queue<String> myQue = new LinkedList<>();
        myQue.add("문서1");
        myQue.add("문서2");
        myQue.add("문서3");
        myQue.add("문서4");
        myQue.add("문서5");







    }
}
