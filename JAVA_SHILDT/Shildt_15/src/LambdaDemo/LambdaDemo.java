package LambdaDemo;

class LambdaDemo {
    public static void main(String[] args) {
        MyNum myNum;
        myNum = () -> 123.45;
        System.out.println(myNum.getNum());
        myNum = () -> Math.random() * 100;
        System.out.println(myNum.getNum());
        System.out.println(myNum.getNum());

//        myNum = () -> "123.45"; // Ошибка! Несоответствие типов.

    }
}
