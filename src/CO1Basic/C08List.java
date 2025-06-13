package CO1Basic;

import java.util.*;

public class C08List {
    public static void main(String[] args) {
////        선언방법1
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList<>();


////        List 선언방법2 : 가장 일반적인 방법
//        List<String> myList3 = new ArrayList<>();


////        초기 값 세팅방법2. 배열을 리스트로 변환
//        String[] arr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(arr));

//        int[] intArr = {10, 20, 30};
//        List<Integer> myIntList = new ArrayList<>();
//        for (int i : intArr) {
//            myIntList.add(i); // auth 박싱
//        }


////        add 메서드 : 리스트에 값을 하나씩 추가하는 메서드
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(0, 30); // List는 중간 데이터 삽입은 성능 비효율적.
//        System.out.println(myList);
//
////        get(index) : 특정 index의 요소 반환
//        System.out.println(myList.get(0));
//
////        size() : 리스트의 개수를 반환
//        System.out.println(myList.size());
//
//
////        for문을 활용해서 myList값 하나씩 모두 출력
//        for (Integer i : myList) {
//            System.out.println(i);
//        }
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }

////        remove : 요소삭제
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
////        1) index를 통한 삭제 2) value를 통한 삭제(중복삭제이기에 일반적이지 않음)
//        myList.remove(0);
//        myList.remove(Integer.valueOf(30));
//        System.out.println(myList);
////        clear: 요소 전체 삭제
//
////        indexOf : 특정값을 찾아 index return (가장 먼저 나오는 값)
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(10);
//        myList2.add(20);
//        myList2.add(30);
//        myList2.add(40);
//        System.out.println(myList2.indexOf(30));
//
////        contains : 값의 유무를 리턴
//        System.out.println(myList2.contains(20));
//
//
////        프로그래머스 - n의 배수 고르기
//        int n = 5;
//        int[] numlist = {1, 9, 3, 10, 13, 5};
//        List<Integer> arrList = new ArrayList<>();
//        for (int i : numlist) {
//            if (i % n == 0) {
//                arrList.add(i);
//            }
//        }
//        int[] answer = new int[arrList.size()];
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = arrList.get(i);
//        }
//        System.out.println(Arrays.toString(answer));


////        정렬 : 방법2가지 (Collections클래스 사용, 객체 사용) - 외우자!
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(11);
//        myList.add(9);
//        myList.add(1);
//
////        Collections.sort()
//        Collections.sort(myList); // 오름차순
//        Collections.sort(myList, Comparator.reverseOrder()); // 내림차순
//        System.out.println(myList);
//
////        객체(ArrayList클래스).sort()
//        myList.sort(Comparator.naturalOrder()); // 오름차순
//        myList.sort(Comparator.reverseOrder()); // 내림차순

//        이중리스트 : 리스트안 리스트
//        [[1, 2], [3, 4], [5, 6]]
        List<List<Integer>> myList = new ArrayList<>();
        List<Integer> myList1 = new ArrayList<>();
        myList.add(myList1);
        myList.add(new ArrayList<>());
        myList.get(0).add(1);
        myList.get(0).add(2); // [[1, 2],[]]
        myList.get(1).add(3);
        myList.get(1).add(4); // [[1, 2],[3, 4]]
        myList.add(new ArrayList<>());
        myList.get(2).add(4); // [[1, 2], [3, 4], [4]]

//        for문 이용해서 [[1,2,3],[4,5,6],[7,8,9],[10,11,12]] 이중리스트 생성
        List<List<Integer>> arrList = new ArrayList<>();
        int n = 1;
        for (int i = 0; i < 4; i++) {
            arrList.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                arrList.get(i).add(n++);
            }
        }
        System.out.println(arrList);

//        리스트안에 배열 - 꼭 알아야 된다. / 알고리즘에서 활용된다
//        [{1, 2}, {1, 2, 3}, {1, 2, 3, 4}]
        List<int[]> intArrList = new ArrayList<>();

        intArrList.add(new int[]{1, 2});
        intArrList.add(new int[]{1, 2, 3});
        intArrList.add(new int[]{1, 2, 3, 4});
        intArrList.add(new int[5]);
        intArrList.get(3)[0] = 1;
        intArrList.get(3)[1] = 2;
        intArrList.get(3)[2] = 3;
        intArrList.get(3)[3] = 1;
        intArrList.get(3)[4] = 10;
        for (int[] ints : intArrList) {
            System.out.print(Arrays.toString(ints) + ", ");
        }


    }
}
