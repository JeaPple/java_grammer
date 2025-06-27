package C01Basic;

import java.util.*;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        "queue의 대전제 : 선입선출!!"

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

////        --
//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        myQue.add("문서4");
//        myQue.add("문서5");
//
////        queue는 일반적으로 while을 통해 요소 소모 - 외우
////        for문은 poll할 시 myQue.size()가 변환되기 때문에 부적절함.
//        while (!myQue.isEmpty()) {
//            System.out.println(myQue.poll());
////            2개씩 poll을 할 경우에는 queue가 empty가 되지 않도록 유의.
////            짝수는 문제없지만 '홀수'개로 2개씩 poll할 경우 마지막 empty이기에 문제 발생.
//        }

//      -- 백준 : 카드2
//      -- 백준 : 요세푸스 문제 0

//        -- 길이 제한 큐 (그렇기 중요하지는 않는다)
//        Queue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        blockingQueue.add("문서1");
//        blockingQueue.add("문서2");
//        blockingQueue.add("문서3");
//        blockingQueue.add("문서4"); // -> 문제 터짐
//        blockingQueue.add(); -> 길이 추가 시 에러 발생.
//        blockingQueue.offer(); -> 이 친구는 에러가 안터지고 그냥 안 들어감.

////        -- 우선 순위 큐: 데이터를 poll할 때 정렬된 데이터결과값 보장 - 매우 중요함!
////        궁금증: 아니 그냥 리스트에 담아서 sort시키면 똑같이 nlog(n)아니야? -> 데이터 가변성일 때
////        전체 데이터가 계속해서 변경되면서 '지속적으로' 최소값을 추출해야 하는 경우.
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq); // add할 때 까지는 전체 정렬이 돼 있지 않음.
//        while (!pq.isEmpty()) {
//            System.out.println(pq.poll()); // 10, 20, 30, 40, 50 -> 순서가 정렬된 결과값 도출
//        }
//          pq.poll() -> 하나 뽑을 때 복잡도는 log(n)이다. -> 최소 트리구조에서 높이 만큼 가져오니까
//        최소 값을 찾음 -> 복잡도 n

//        -- 백준 : 최소힙
//        이 문제는 풀기는 쉽지만 왜 pq를 써야 되는 지 생각해야 된다.

////        -- 최대 힙
//        Queue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
//        pq1.add(30);
//        pq1.add(20);
//        pq1.add(10);
//        pq1.add(40);
//        pq1.add(50);
//        System.out.println(pq1); // add할 때 까지는 전체 정렬이 돼 있지 않음.
//        while (!pq1.isEmpty()) {
//            System.out.println(pq1.poll()); // 순서가 정렬된 최대 결과값 도출
//        }


////        -- 프로그래머스 : 더 맵게
//        int[] scoville = {1, 2};
//        int K = 7;
//
//        Queue<Integer> pq = new PriorityQueue<>();
//        for (int j : scoville) {
//            pq.add(j);
//        }
//
//
//        int i = 0;
//        while (pq.peek() < K) {
//            if (pq.size() == 1) {
//                i = -1;
//                break;
//            }
//            int first = pq.poll();
//            int second = pq.poll();
//            pq.add(first + (second * 2));
//            i++;
//        }
//        System.out.println(i);

//        -- stack : 후입선출
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop()); // 제거되면서 값 return
        System.out.println(stack.peek()); // 값만 return
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        // 프로그래머스 - 같은 숫자는 싫어
        int[] arr = {1,1,3,3,0,1,1};
        Stack<Integer> stack1 = new Stack<>();
        for (int i : arr) {
            if (stack1.isEmpty()) {
                stack1.push(i);
            } else {
                if (stack1.peek() != i) {
                    stack1.push(i);
                }
            }
        }
        int[] answer1 = new int[stack1.size()];
        for (int i = answer1.length - 1; i >= 0; i--) {
            answer1[i] = stack1.pop();
        }
        System.out.println(Arrays.toString(answer1));

        // 프로그래머스 - 올바른 괄호
//        String s = ")()(";
        // deque 사용X
//        int sum = 0;
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                sum++;
//            } else {
//                sum--;
//            }
//            if (sum < 0) {
//                System.out.println(false);
//                break;
//            }
//        }
//        System.out.println(sum == 0);


        String s = "(())()";
        Stack<Character> stack2 = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack2.isEmpty() || c == '(') {
                stack2.push(c);
            } else {
                if (c == ')' && stack2.peek() == '(') {
                    stack2.pop();
                }
            }
        }
        System.out.println(stack2.isEmpty());
        System.out.println(stack2);


        // deque : addLast, pollLast, pollFirst, peekFirst, peekLast
        Deque<Integer> dq1 = new ArrayDeque<>();
        dq1.addLast(10);
        dq1.addLast(20);
        dq1.addLast(30);
        System.out.println(dq1.pollLast());
        System.out.println(dq1.pollFirst());
        System.out.println(dq1.peekLast());








    }
}
