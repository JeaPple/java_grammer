package C05AnonymousLambda;

import java.util.*;

public class C03ComparatorComparable {
//    - 백준
//    단어 정렬
//    절댓값 힙
//    선 긋기

    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스가 대표적으로 2개가 제공
//        Comparable 인터페이스 : compareTo 메서드 선언
//        Comparator 인터페이스 : compare 메서드 선언 -> 강사님 추천

//        String클래스에 compareTo메서드 내장
//        String클래스 및 java의 많은 클래스에서 Comparable을 구현하여 compareTo메서드를 구현.
        String a = "hello";
        String b = "world";
        System.out.println(a.compareTo(b)); // 마이너스

        List<String> myList = new ArrayList<>();
        myList.add("java");
        myList.add("python");
        myList.add("javascript");
//        String안의 compareTo메서드를 사용하여 정렬이 이뤄짐.
        Collections.sort(myList);

//        직접만든 Student를 List에 담아 정렬
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("hong1", 20));
        studentList.add(new Student("hong2", 18));
        studentList.add(new Student("hong3", 11));
        studentList.add(new Student("hong4", 12));
        studentList.add(new Student("hong5", 19));


////        Collections.sort(studentList); -> Compareble을 상속받지 않아서 오류가 발생.
////        정렬방법1. Student객체에서 Comparable을 직접 구현한 방식
////        단점 : Student객체를 직접 수정해야 하므로, 유연성이 떨어짐.
//        Collections.sort(studentList);
//        System.out.println(studentList);

//        정렬방법2. Comparator를 이용한 익명객체를 사용.
//        Comparator 활용도가 높은 이유는 많은 정렬 메서드에서 Comparator객체를 요구하기 때문.
//        studentList.sort(new Comparator<>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        studentList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        System.out.println(studentList);

//        배열 정렬
        String[] stArr = {"hellkkkko", "java", "C++", "world2"};
        Arrays.sort(stArr);
        Arrays.sort(stArr, Comparator.reverseOrder());
//        글자 길이를 기준으로 내림차순 정렬
        Arrays.sort(stArr, (o1, o2) -> o2.length() - o1.length());
        System.out.println(Arrays.toString(stArr));
        Arrays.sort(stArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

//// - 백준 단어 정렬
//        Arrays.sort(arr, new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int i = o1.length() - o2.length();
//                if (i == 0) {
//                    i = o1.compareTo(o2);
//                }
//                return i;
//            }
//        });
//        StringBuilder sb = new StringBuilder();
//        for (int j = 0; j < arr.length; j++) {
//
//        }
//        // 방법 2.
//        Set<String> mySet1 = new TreeSet<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int i = o1.length() - o2.length();
//                if (i == 0) {
//                    i = o1.compareTo(o2);
//                }
//                return i;
//            }
//        });

//        백준 - 절댓값 힙
//        절대값 -> Math.abs(-1); 활용
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                } else {
                    return Math.abs(o1) - Math.abs(o2);
                }
            }
        });

//        -- 배열 안의 배열 정렬
//        [4,5], [1,2], [5,0], [3,1]
        List<int[]> myList1 = new ArrayList<>();
        myList1.add(new int[]{4, 5});
        myList1.add(new int[]{1, 2});
        myList1.add(new int[]{5, 0});
        myList1.add(new int[]{3, 1});
//        정렬 : 리스트안의 배열에 index 1번째 값을 기준으로 오름차순
        myList1.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int[] ints : myList1) {
            System.out.println(Arrays.toString(ints));
        }

//        백준 : 선긋기
//        arr[0]기준으로 정렬
//        3가지 경우의 수 따져준다.


    }
}

// implements Comparable<Student>
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

////    정렬은 결국 2개의 값을 비교하는 것으로, A와 B대상 2개만 있으면 충분.
////    두수(또는 문자)의 비교의 경우 음수, 0, 양수 세 값 중에 하나만 return. 이를 통해 정렬수행.
////    this가 앞에 있을 땐 오름차순, this가 뒤에 있으면 내림차순으로 내부적으로 정렬로직 동작.
//    @Override
//    public int compareTo(Student o) {
////        return this.getName().compareTo(o.getName());
//        return this.getAge() - o.getAge();
//    }
}

