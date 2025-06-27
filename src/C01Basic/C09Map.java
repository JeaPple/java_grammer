package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
        // key, value로 이루어진 자료구조
        // key값은 중복이 있으면 value를 덮어쓰기
//        Map<String, Integer> sports = new HashMap<>();
//        sports.put("축구", 2);
//        sports.put("배구", 1);
//
//        // map은 key를 통해 value를 get
//        // map에서 key 값을 통한 검색 복잡도는 0(1)
//        System.out.println(sports.get("농구"));
//
//        // 맵의 전체데이터 출력
//        // map의 key값 접근 시에 인덱스 사용 불가능 (순서가 없음)
//        // 따라서, 밑 코드 작동 안함
//        System.out.println(sports);
//        myList.add(10);
//        myList.add(20);
//        System.out.println(myList);
//        int total = 0;
//        for (int m : myList) {
//            total += m;
//        }
//
//
//        // keySet() : map의 key목록을 리턴하는 메서드
//        // valueSet() : map의 value 목록을 리턴
//        int total = 0;
//        for (int v : sports.values()) {
//            total += v;
//        }
//
//        int total2 = 0;
//        for (String k : sports.keySet()) {
//            total2 += sports.get(k);
//
//        }
//
//        // remove : 키를 통해 map요소 삭제
//        sports.remove("농구");
//        System.out.println(sports);
//
//        // map에서 기존의 key값에 put할 경우 덮어쓰기
//        sports.put("배구", 10);
//        System.out.println(sports);
//
//        Map<String, String> sports = new HashMap<>();
//        sports.put("soccer", "축구");
//        sports.put("baseball", "야구");
//        sports.put("basketball", "농구");
//
//        // putIfAbsent : key 값이 없는 경우에만 put
//        sports.putIfAbsent("soccer", "운동");
//
//        // containsKey : 키가 있으면 true, 없으면 false
//        System.out.println(sports.containsKey("tennis"));
//        System.out.println(sports.containsKey("baseball"));
//
//        // map 출력 방법 2가지 :
//        // 1) foreach문
//        // 2) iterator
//
//        // foreach:
//        for (String curr : sports.keySet()){
//            System.out.println(curr);
//            System.out.println(sports.get(curr));
//        }

        Map<String, String> sports = new HashMap<>();
        sports.put("soccer", "축구");
        sports.put("baseball", "야구");
        sports.put("basketball", "농구");

        // iterator 활용
//        Iterator<String> iterators = sports.keySet().iterator();
//        // next 메서드는 데이터를 하나씩 소모시키면서 값을 변환
//        System.out.println(iterators.next());
//        System.out.println(iterators.next());
//        System.out.println(iterators.next());
//        System.out.println(iterators.next()); // 값이 없을 시 nullPointerException 발생함
//
//        // hasNext 메서드는 iterator 안에 그 다음 값이 있는지 boolean으로 리턴
//        System.out.println(iterators.hasNext());
//        while (iterators.hasNext()) {
//            System.out.println(iterators.next());
//        }

//        - map은 key의 value수를 count하는 목적으로 많이 활용
//        String[] arr = {"농구", "축구", "농구", "아구", "축구"};
//        농구:2, 축구:2, 야구:1
//        Map<String, Integer> likeSport = new HashMap<>();
//        for (String s : arr) {
//            if (likeSport.containsKey(s)) {
//                likeSport.put(s, likeSport.get(s) + 1);
//            } else {
//                likeSport.put(s, 1);
//            }
//        }

//        getOrDefault(키값, 초기값) : key값이 없을 경우 초기값 리턴 - 외우자
//        for (String s : arr) {
//            likeSport.put(s, likeSport.getOrDefault(s, 0) + 1);
//        }
//        System.out.println(likeSport);
//
//        String[] removeArr = {"농구", "농구", "아구", "축구", "농구"};
////        축구 : 1
//        for (String s : removeArr) {
//            if (likeSport.containsKey(s)) {
//                likeSport.put(s, likeSport.get(s) - 1);
//            }
//            if (likeSport.getOrDefault(s, 0) <= 0) {
//                likeSport.remove(s);
//            }
//        }
//        System.out.println(likeSport);

//        - 약간 심화 문제
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("농구", 2);
        myMap.put("축구", 3);
        myMap.put("야구", 10);
//        가장 value가 큰 key값 찾기
        int max = Integer.MIN_VALUE;
        String maxKey = "";
        for (String s : myMap.keySet()) {
            if (myMap.get(s) > max) {
                max = myMap.get(s);
                maxKey = s;
            }
        }
        System.out.println(maxKey);

//        미완료: 백준 문제 : 베스트셀러 - 다시 풀어보기 (string 메서드, arrayList 이용)
//        미완료: 프로그래머스 : 완주하지 못한 선수 .
//        복잡도: map-n < array-n * log n
//        메모리: map > array
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Map<String, Integer> participantMap = new HashMap<>();
        for (String s : participantMap.keySet()) {
            if (participantMap.containsKey(s)) {

            }
        }

//        프로그래머스  : 의상
//        미완료: String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//
//        Map<String, Integer> map = new HashMap<>();
//        for (String[] clothe : clothes) {
//            if (map.containsKey(clothe[1])) {
//                map.put(clothe[1], map.get(clothe[1]) + 1);
//            } else {
//                map.put(clothe[1], 1);
//            }
//        }
//
//        int total = 0;
//        for (int i = 0; i < map.size(); i++) {
//            map
//        }

//        LinkedHashMap : 데이터의 삽입순서를 보장(유지)
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("hello5", 1);
        linkedMap.put("hello4", 2);
        linkedMap.put("hello3", 3);
        linkedMap.put("hello2", 4);
        linkedMap.put("hello1", 5);
        System.out.println(linkedMap);

//        TreeMap : key를 정렬(오름차순)하여 map을 저장
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("hello5", 1);
        treeMap.put("hello4", 2);
        treeMap.put("hello3", 3);
        treeMap.put("hello2", 4);
        treeMap.put("hello1", 5);
        System.out.println(treeMap);

//        백준 : 파일정리
//        문자열 자르기 : .은 특수문자로 취급되어 "." -> "\\."







    }
}
