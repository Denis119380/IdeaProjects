package OverrideDemo;

class OverRideDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(102);
        Gen1<Integer> iOb1 = new Gen1<Integer>(103);
        System.out.println(iOb.getOb());
        System.out.println(iOb1.getOb());
    }
}
