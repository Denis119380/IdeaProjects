public class Main {
    public static void main(String[] args) {
        String name1 = "Иван";
        String name2 = "Фёдор Иванов";

        System.out.println(checkUserName(name1, name2));

        System.out.println(checkLengthName(name1));

        System.out.println(lengthNameWithoutSpace(name1));
    }

    private static String checkUserName(String name1, String name2) {
        boolean reaction;
        String message;
        if (reaction = name1.equalsIgnoreCase(name2)) {
            message = "Выберите другое имя пользователя";
        } else {
            message = "Отличное имя";
        }
        return message;
    }
    private static String checkLengthName(String name1) {
        int value = name1.length();
        String message2 = "Ваше имя имеет длину " + value + " символов";
        return  message2;
    }
    private static  String lengthNameWithoutSpace(String name1) {
        String[] prepare = name1.split(" ");
        int sum = 0;
        for (int i = 0; i < prepare.length; i++) {
            int value = prepare[i].length();
            sum = sum + value;
        }
        String message3 = "А без пробелов Ваше имя занимает " + sum + " символов";
        return  message3;
    }
}