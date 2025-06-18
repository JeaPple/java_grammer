package CO1Basic;

import java.util.*;

public class C07Array {
    public static void main(String[] args) {
//        배열표현식1. 배열 선언 후 할당 방식
//        배열은 반드시 사전에 길이가 결정되어야 함.

//        리터럴 배열표현식2
//        int[] arr2 = {1, 2, 3, 4, 5};

//        배열표현식3
        int[] arr3 = new int[]{10, 20, 30, 40, 50};
//        배열표현식3.예시
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{1,2,3,4,5});
        list.add(new int[3]);
        System.out.println(list.get(0)[1]);

//        배열표현식4 : 불가 -> 배열의 길이를 반드시 확정시켜야 함.
//        int[] arr4 = new int[];

////        Arrays.fill : 배열에 모든 값을 변경
//        String[] arr = new String[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = "";
//        }
//        Arrays.fill(arr, "");

//        문제 : 85, 65, 90으로 구성된 int배열을 선언하고, 총합과 평균을 구해보시오.
        int[] arrInt = new int[]{85, 65, 90};
        int total = 0;
        int avg = 0;
        for (int i : arrInt) {
            total += i;
        }
        System.out.println(total);
        System.out.println(total / arrInt.length);

////        문제 : 배열의 최대값, 최소값
//        int[] arrInt2 = {1, 213, 12, -2, 4, 5600, 3, 12, 3};
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (int i : arrInt2) {
//            if (i > max) {
//                max = i;
//            } else if (i < min) {
//                min = i;
//            }
//        }
//        System.out.println("arrInt2의 최대값: " + max + ", 최소값: " + min);
//        System.out.println(Arrays.stream(arrInt2).max());

////        배열의 자리 바꾸기
//        int[] arrInt3 = {20, 10, 30};
//        int temp = arrInt3[0];
//        arrInt3[0] = arrInt3[1];
//        arrInt3[1] = temp;
//        System.out.println(Arrays.toString(arrInt3));

//        배열의 정렬
        int[] arrInt5 = {17, 12, 20, 10, 16};
        Arrays.sort(arrInt5); // 오름차순 정렬
//        Arrays.sort(arrInt5, Comparator.reverseOrder()); 원시자료형은 Comparator 사용불가능
//        숫자형 내림차순 만들러면 Integer로 하면 된다.
        System.out.println(Arrays.toString(arrInt5));
        String[] strInt = {"abc", "aaa", "acd", "abb"};
        Arrays.sort(strInt, Comparator.reverseOrder()); // 내림차순
        System.out.println(Arrays.toString(strInt));

//        선택 정렬 알고리즘 직접구현 : 1)min값찾기 2)자리change 3)2중for문(index주의)
//        복잡도는 n^2 이다.
//        현대적인 최적 알고리즘은 n*logn이다.
        int[] sortArr = {17, 12, 20, 10, 15};

        for (int i = 0; i < sortArr.length; i++) {
            int min = sortArr[i];
            int minIdx = i;

            for (int j = i + 1; j < sortArr.length; j++) {
                if (min > sortArr[j]) {
                    min = sortArr[j];
                    minIdx = j;
                }
            }
            sortArr[minIdx] = sortArr[i];
            sortArr[i] = min;
        }
        System.out.println(Arrays.toString(sortArr));

////        조합문제 : 모두 각기 다른 숫자의 배열이 있을 때, 만들어질 수 있는 두 숫자의 조합을 문자열 형태로 출력
////        ex) (10, 20) (10, 30) (10, 40) (20, 30) ...
//        int[] intArr = {10, 20, 30, 40, 50};
//        for (int i = 0; i < intArr.length; i++) {
//            for (int j = i + 1; j < intArr.length; j++) {
//                System.out.print("(" +intArr[i] + " " + intArr[j] + "), ");
//            }
//        }

////        배열의 중복제거 : set 자료구조(중복x, 순서x)를 활용하여 중복
//        int[] arr = {10, 10, 20, 30, 30, 40};
//        Set<Integer> mySet = new HashSet<>();
//        for (int a : arr) {
//            mySet.add(a);
//        }
//        System.out.println(mySet);
//        int[] answer = new int[mySet.size()];
//        int index = 0;
//        for (int a : mySet) {
//            answer[index] = a;
//            index++;
//        }
//        Arrays.sort(answer);
//        System.out.println();

////        프로그래머스 - 두 개 뽑아서 더하기 (조합 + 중복제거)
//        // 항상 프로그래머스에서 패키지 import 시켜줘야 됨.
//        // 테스트 예시
//        int[] numbers = {5,0,2,7};
//
//        // 값 더하기
//        Set<Integer> mySet = new HashSet<>();
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i + 1; j < numbers.length; j++) {
//                mySet.add(numbers[i] + numbers[j]);
//            }
//        }
//
//        // 더한 값 배열에 담기
//        int[] answer = new int[mySet.size()];
//        int answerIndex = 0;
//        for (Integer i : mySet) {
//            answer[answerIndex] = i;
//            answerIndex++;
//        }
//        Arrays.sort(answer);
//        System.out.println(Arrays.toString(answer));

////        배열의 검색
//        int[] arr = {4, 1, 13, 2, 5};
//        int target = 13;
////        8이 몇번째 index에 있는지 출력
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                System.out.println("target은 " + i + "번째 인덱스에 있다.");
//                break; // 찾으면 종료
//            }
//        }

////        이진 검색(이분탐색) - binary search
////        전제: 사전에 데이터가 오름차순 정렬되어 있을 경우, 이분탐색 가능
////        복잡도를 logN으로 현저하게 줄일 수 있다.
////        이분 탐색의 한계 : 중복 된 값을 확실하게 뽑아낼 수 없다.
//
//        int[] arr = {1, 3, 6, 8, 9, 11, 16};
////        값이 있으면 해당 index리턴
////        값이 없으면 마이너스 값
//        System.out.println(Arrays.binarySearch(arr, 16));

//        백준 문제 - 수 찾기 (1920)

//        그냥 피지컬로 풀었을 경우
//        - 강사님에게 보냄

////        배열값 비교
//        int[] arr1 = {10, 20, 30};
//        int[] arr10 = {10, 20, 30};
//        System.out.println(arr1 == arr10);  // false
//        System.out.println(Arrays.equals(arr1, arr10)); // true

////        2차원 배열의 선언과 값 할당
////        {{1,2},{3,4},{1,2,21,1,2}}
//
//        int[][] arr = new int[3][];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][1] = 1;
//        arr[2][2] = 2;
//        arr[2][3] = 21;
//        arr[2][4] = 1;
//        arr[2][5] = 2;
//        System.out.println(Arrays.toString(arr));

//////        가변배열 : 배열의 전체길이는 반드시 할당.
//////        {{1,2},{3,4},{1,2,21,1,2}}
//        int[][] arr = new int[3][];
//
//// 각 1차원 배열의 크기를 초기화
//        arr[0] = new int[2];  // arr[0]의 크기는 2
//        arr[1] = new int[2];  // arr[1]의 크기는 2
//        arr[2] = new int[6];  // arr[2]의 크기는 6
//
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[1][0] = 3;
//        arr[1][1] = 4;
//        arr[2][1] = 1;
//        arr[2][2] = 2;
//        arr[2][3] = 21;
//        arr[2][4] = 1;
//        arr[2][5] = 2;
//
//        System.out.println(Arrays.toString(arr));

//        2차원 배열의 출력
//        System.out.println(이차원배열); // 2차원배열의 주소값
//        System.out.println(Arrays.toString(이차원 배열)); // 각 1차원 배열의 주소값 모음
//        System.out.println(Arrays.deepToString(이차원 배열)); // 각 2차원 배열 값


////        문제 : [3][4] 사이즈 선언하고 1~12까지 숫자 값을 각 배열에 순차적으로 할당
////        {1,2,3,4}, {5,6,7,8}, {9,10,11,12}
////        2차원 배열 출력은 Arrays.deepToString(arr3)
//        int[][] arr = new int[3][4];
//        int n = 1;
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                arr[i][j] = n;
//                n++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));


////        가변배열 값 채우기
////        {1,2,3,4}, {5,6,7,8}, {9,10,11,12}
//        int[][] arr = new int[3][];
//        int n = 1;
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new int[4];
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = n;
//                n++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));


////        프로그래머스 - 행렬의 덧셈
//        int[][] arr1 = {{1, 2}, {2, 3}}; // [2][2]
//        int[][] arr2 = {{2, 3}, {5, 6}};
//
//        int[][] answer = new int[arr1.length][arr1[0].length];
//        for (int i = 0; i < answer.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                answer[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//
//        System.out.println(Arrays.deepToString(answer));


//        프로그래머스 - K번째 수
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] com = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] answer = new int[com.length];
        for (int i = 0; i < com.length; i++) {
            int a = com[i][0];
            int b = com[i][1];
            int k = com[i][2];
            int[] bucket = new int[b - a + 1];
            for (int j = 0; j < bucket.length; j++) {
                bucket[j] = arr[a - 1];
                a++;
            }
            Arrays.sort(bucket);
            answer[i] = bucket[k - 1];
        }



//        배열복사 메서드
//        Arrays.copyOf(배열명, length), Arrays.copyOfRange(배열명, start, end)
//        강사님: for문으로 대체 가능하니 그렇게 중요하지는 않는다







    }
}
