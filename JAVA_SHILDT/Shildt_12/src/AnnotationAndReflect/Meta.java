package AnnotationAndReflect;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Объявление типа аннотации
// и указание правила удержания
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class Meta {
    // аннотировать метод
    @MyAnno(str = "Пример аннотации", val = 100)
    public static void myMeth(String s, int i) {
        Meta ob = new Meta();

        // получить аннотацию из метода
        // и вывести значения её членов
        try {
            // сначала получить объект типа Class,
            // представляющий данный класс (Meta)
            Class<?> c = ob.getClass();
//            Class<?> c = Meta.class;

            // затем получить объект типа Method,
            // представляющий данный метод (myMeth);
            // метод getMethod() генерирует исключение -
            // NoSuchMethodException, поэтому требуется try-catch;
            // если метод принимает аргументы, то нужно указать
            // объекты Class: String.class, int.class
            Method m = c.getMethod("myMeth", String.class, int.class);

            // далее получить аннотацию для данного класса
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // и наконец, вывести значение членов аннотации
            System.out.println(anno.str() + " " +
                    anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("Тест", 19);
    }
}
