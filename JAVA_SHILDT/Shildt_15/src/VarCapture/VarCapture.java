package VarCapture;

class VarCapture {
    public static void main(String[] args) {
        int var = 9;
        MyFunc myLambda = n -> {
            int v = var + 10;
//            var++;     // Недопустимо видоизменять.
//            var = 10;  // Недопустимо
            return v;
        };
//        var = 10; // Ошибка, т.к. нарушается конечное состояние переменной.
    }
}
