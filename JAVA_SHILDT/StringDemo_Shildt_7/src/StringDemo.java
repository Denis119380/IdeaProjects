public class StringDemo {
    public static void main(String[] args) {

        String strOb1 = "Первая строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1; // общая ссылка на символьную строку

        System.out.println("Длина строки strOb1: " + strOb1.length());

        System.out.println("Символ по индексу 4"
        + " в строке strOb1: " + strOb1.charAt(4));

        if (strOb1.equals(strOb2)) System.out.println(
                "strOb1 == strOb2"
        );
        else System.out.println(
                "strOb1 != strOb2"
        );

        if (strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");

        String[] str = {"one", "two", "three"}; // пример массива символьных строк

        for (int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "] " + str[i]);
    }

}