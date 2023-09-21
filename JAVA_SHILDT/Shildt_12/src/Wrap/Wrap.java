package Wrap;
// Демонстрация оболочки числового типа
class Wrap {
    public static void main(String[] args) {

        // значение 100 упаковывается в объект типа Integer
        Integer iOb = Integer.valueOf(100);

        // значение упаковывается устаревшим способом,
        // применяющимся с самой первой версии Java
        Integer jOb = new Integer(200);

        // автоупаковка
        Integer aOb = 300;

        // значение распаковывается из объекта iOb
        int i = iOb.intValue();

        // ошибка!!! распаковки из объекта aOb
        int b = aOb.byteValue();

        // автораспаковка
        int a = aOb;

        System.out.println(i + " " + iOb);
        System.out.println(jOb);
        System.out.println(a + " " + aOb);

        System.out.println(b);
    }
}