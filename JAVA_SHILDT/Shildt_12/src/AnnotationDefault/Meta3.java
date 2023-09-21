package AnnotationDefault;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Объявление типа аннотации, включая значения
// её членов по умолчанию
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}
class Meta3 {

    // аннотировать метод, используя значение по умолчанию
    @MyAnno()
    public static void myMeth() {
        Meta3 ob = new Meta3();

        // получить аннотацию для данного метода
        // и вывести значения её членов
        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }

}
