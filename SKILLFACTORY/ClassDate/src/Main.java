import java.util.Date;

public class Main { // демонстрация класса Date, его методов
    public static void main(String[] args) {

        Date date = new Date();

        Date dat = new Date(11111111111L);

        long time = System.currentTimeMillis();

        Date date1 = new Date(7000);
        Date data2 = new Date(6000);

        Date date3 = new Date();
        date3.setTime(1900); // устанавливает дату в виде числа от 01.01.1970

        System.out.println(date); // вывод в консоль текущей даты, Date()

        System.out.println(dat); // вывод в консоль даты от 0 (01.01.1970) + 11111111111мсек

        System.out.println(time); // вывод текущей даты в милисекундах (от 01.01.1970)

        System.out.println(date1.after(data2)); // сравнение дат, первая > вторая = true

        System.out.println(date1.before(data2)); // сравнение дат, первая > вторая = false

        System.out.println(date1.compareTo(data2)); // сравненние дат, d1>d2=1, d1<d2=-1, d1=d2=0

        System.out.println(date.getTime()); // вывод текущей даты в милисекундах (от 01.01.1970)

        System.out.println(date3.getTime()); // вывод даты в виде числа от 01.01.1970
    }
}