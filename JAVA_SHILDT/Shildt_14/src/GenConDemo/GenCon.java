package GenConDemo;

class GenCon {
    private double d;
    <T extends Number> GenCon(T d) {
        this.d = d.doubleValue();
    }
    void show() {
        System.out.println("Value equaled: " + d);
    }
}
