package BoundedType;

class BoundsDemo {
    public static void main(String[] args) {
        Integer[] intNum = new Integer[] {1, 2, 3, 4, 5};
        Stats<Integer> iNum = new Stats<Integer>(intNum);
        double val = iNum.average();
        System.out.println("Average value: " + val);
        System.out.println();

        Double[] dobNum = new Double[] {1.0, 2.0, 3.0, 4.0, 5.0};
        Stats<Double> dNum = new Stats<Double>(dobNum);
        System.out.println("Average value: " + dNum.average());

        Short[] shNum = new Short[] {1, 2, 3, 4, 5};
        Stats<Short> sNum = new Stats<Short>(shNum);

        Float[] floNum = new Float[] {1.0F, 2.0F, 3.0F, 4.0F, 6.0F};
        Stats<Float> fNum = new Stats<Float>(floNum);

//        String[] str = new String[] {"1", "2", "3", "4", "5"};
//        Stats st = new Stats(str);

        iNum.sameAverage(dNum); // сравнение средних значений массивов iNum и dNum

        iNum.sameAverage(fNum); // сравнение средних значений массивов iNum и fNum
    }
}
