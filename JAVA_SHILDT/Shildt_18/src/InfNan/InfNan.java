package InfNan;

class InfNan {
    public static void main(String[] args) {
        Double ob1 = Double.valueOf(1/0.);
        Double ob2 = Double.valueOf(0/0.);
        System.out.println(ob1 + ": " + ob1.isInfinite() + " " + ob1.isNaN());
        System.out.println(ob2 + ": " + ob2.isInfinite() + " " + ob2.isNaN());
    }
}
