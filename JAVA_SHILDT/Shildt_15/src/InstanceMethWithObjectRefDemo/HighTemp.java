package InstanceMethWithObjectRefDemo;

class HighTemp {
    private int highTem;
    HighTemp(int highTem) {
        this.highTem = highTem;
    }
    boolean sameTem(HighTemp obTemp) {
        return highTem == obTemp.highTem;
    }
    boolean lessThenTem(HighTemp obTemp) {
        return highTem < obTemp.highTem;
    }
}
