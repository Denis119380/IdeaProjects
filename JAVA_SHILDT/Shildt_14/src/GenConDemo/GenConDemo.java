package GenConDemo;

class GenConDemo {
    public static void main(String[] args) {
        Integer i = 5;
        Float f = 5.5f;
        Short s = 1;
        GenCon iOb = new GenCon(i);
        GenCon fOb = new GenCon(f);
        GenCon sOb = new GenCon(s);
        GenCon numOb = new GenCon(4.5f);
        iOb.show();
        fOb.show();
        sOb.show();
        numOb.show();
    }
}
