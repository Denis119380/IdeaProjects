package DateTimeAPI;
import java.time.*;
import java.util.Date;

public class Test {

    // Метод принимает объект Date и возвращает
    // LocalTime время переданного объекта
    // в моём часовом поясе
    public static LocalTime methTwo(Date date) {
        Instant instant = date.toInstant();
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        return zonedDateTime.toLocalTime();
    }

    public static boolean meth(LocalTime time, Duration duration) {
        return time.plus(duration).isAfter(LocalTime.now());
    }

    public static void main(String[] args) {
        if(meth(LocalTime.of(19,5), Duration.ofMinutes(20)))
            System.out.println("Текущее время меньше заданного");
        else System.out.println("Текущее время больше заданного");

        LocalDate date = LocalDate.of(2026, Month.AUGUST, 13); // строка 1
        LocalTime time = LocalTime.of(16,45); // строка 2
        LocalDateTime dateTime = LocalDateTime.of(date, time); // строка 3
        System.out.println(dateTime);

        System.out.println(methTwo(new Date()));
    }
}
