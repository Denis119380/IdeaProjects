package GenShortForm;

class GenDemo {
    public static void main(String[] args) {
        Gen<String,Integer> strIntOb = new Gen<>("Test", 115);
        Gen<String,Integer> strIntOb1 = new Gen<>("Test1", 115);
        System.out.println(strIntOb1.isSame(strIntOb));
        System.out.println(strIntOb.isSame(new Gen<>("Test", 115)));
    }
}
