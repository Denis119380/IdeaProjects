import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance(); // создание объекта

        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy MMM dd HH:mm:ss"); // второй путь использования
        // создание паттернов и его дальнейшее использование
        System.out.println("Now is: " + dateFormat.format(calendar.getTime()));
        // метод getTime() переводит объект из класса Calendar в Date

//        int era = calendar.get(Calendar.ERA); // первый путь использования Calendar
//        int year = calendar.get(Calendar.YEAR);
//        int month = calendar.get(Calendar.MONTH);
//        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
//        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
//        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
//        int weekOfMonth = calendar.get(Calendar.WEEK_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR);
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

//        System.out.println("Now is era: " + era);
//        System.out.println("Now is year: " + year);
//        System.out.println("Now is month: " + month);
//        System.out.println("Now is dayOfMonth: " + dayOfMonth);
//        System.out.println("Now is dayOfWeek: " + dayOfWeek);
//        System.out.println("Now is weekOfYear: " + weekOfYear);
//        System.out.println("Now is weekOfMonth:" + weekOfMonth);

        System.out.println();

        System.out.println("Now is hour: " + hour);
        System.out.println("Now is hourOfDay: " + hourOfDay);
        System.out.println("Now is minute: " + minute);
        System.out.println("Now is second: " + second);
        System.out.println("Now is millisecond: " + millisecond);

        System.out.println();

//        calendar.add(hourOfDay, -1);
        calendar.add(Calendar.HOUR_OF_DAY, -1); // метод добавляет либо отнимает значение времени
//        System.out.println("Add to now hourOfDay: " + hourOfDay);
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println();

        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
        calendar1.clear(); // метод обнуляющий все переменные в объекте Calendar
        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
        boolean c1 = calendar1.after(calendar2); // метод сравнивающий время объектов, первый > второго = true
        boolean c2 = calendar1.before(calendar2); // метод сравнивающий время объектов, первый > второго = false
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(calendar1.getTime()); // метод возвращает объект класса Date, содержащий время
        System.out.println(calendar2.getTime());
        calendar1.set(Calendar.HOUR_OF_DAY, 4); // метод устанавливает компоненты даты и времени
        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));



    }
}