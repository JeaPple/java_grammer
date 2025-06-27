package C06etcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C02Calendar {
    public static void main(String[] args) {
////        java.util패키지의 Calendar클래스
//        Calendar myCalendar = Calendar.getInstance();
//        System.out.println(myCalendar.getTime());
//        System.out.println(myCalendar.get(Calendar.YEAR));
//        System.out.println(myCalendar.get(Calendar.MONTH));
//        System.out.println(myCalendar.get(Calendar.DAY_OF_WEEK)); // 4요일 -> 일, 월, 화, 수(4)
//        System.out.println(myCalendar.get(Calendar.DAY_OF_MONTH)); // 날짜

//        java.time패키지의 LocalDateTime, LocalDate, LocalTime 클래스
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

//        get메서드와 ChronoField매개변수로 다양한 형식의 날짜/시간정보 조회
        System.out.println(localDateTime.get(ChronoField.YEAR));
        System.out.println(localDateTime.get(ChronoField.AMPM_OF_DAY)); // 0:오전, 1:오후
        System.out.println(localDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY)); // 24시형식


//        .of : 임의로 특정시간정보객체를 만들어 내고 싶을 때 사용
        LocalDate birthDay = LocalDate.of(2000, 11, 12);
        System.out.println(birthDay);

//        LocalDateTime birthDayTime = LocalDateTime.of(2000,1,)


    }
}
