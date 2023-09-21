package AllAnnotationView;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Annotation tested class")
@MyAnno(str = "Meta2", val = 99)
class Meta2 {

    @What(description = "Аннотация тестового метода")
    @MyAnno(str = "Testing", val = 100)
    public static void myMeth() {

        Meta2 ob = new Meta2();

        Annotation[] annoS = ob.getClass().getAnnotations();
        // вывести все аннотации для класса Meta2
        System.out.println("Все аннотации класса Meta2");
        for (Annotation a : annoS)
            System.out.println(a);

        System.out.println();

        try {
            // вывести все аннотации для метода myMeth()
            Method m = ob.getClass().getMethod("myMeth");
            annoS = m.getAnnotations();

            System.out.println("Все аннотации для метода myMeth");
            for (Annotation a : annoS)
                System.out.println(a);
        } catch (NoSuchMethodException e) {
            System.out.println("Метод не найден");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}
