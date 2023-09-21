package TwoParamGen;

class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<Integer, String>(100, "Generalization");
        twoGen.showType();

        System.out.println(twoGen.getOb1());
        int val = twoGen.ob1;
        System.out.println(val);

        System.out.println();

        System.out.println(twoGen.getOb2());
        String str = twoGen.ob2;
        System.out.println(str);
    }
}
