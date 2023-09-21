package HierGenSuperClass;

class HieGenDemo {
    public static void main(String[] args) {
        Gen1<Integer> iOb1 = new Gen1<Integer>(100);
        System.out.println("Value iOb1: " + iOb1.getOb());

        Gen2<String, Integer> strIOb1 = new Gen2<String, Integer>("Integer value of strIOb1: ", 101);
        System.out.print(strIOb1.getOb());
        System.out.println(strIOb1.getObV());
    }
}
