package RunningSumOf1dArray_1480;

class Main {
    // Первый элемент массива складывается со вторым, и сумма вставляется
    // вместо второго элемента, далее сумма складывается с третьим и т.д.
    public static int[] runningSum(int[] num) {
        int[] arr = new int[num.length];
        arr[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            arr[i] = num[i] + arr[i - 1];
        }
        return arr;
    }
    // time complexity = O(n)
    // space complexity = O(1)

    public static int[] runningSumSecondWay(int[] num) {
        for (int i = 1; i < num.length; i++) num[i] += num[i - 1];
        return num;
    }
    // time complexity = O(n)
    // space complexity = O(1)

    public static void main(String[] args) {
        int[] ob1 = {1, 2, 3, 4, 5};
        ob1 = runningSum(ob1);
        System.out.print("( ");
        for (int i : ob1) System.out.print(i + " ");
        System.out.print(")");
        System.out.println();
        int[] ob2 = {10, 20, 30, 40, 50};
        ob2 = runningSumSecondWay(ob2);
        System.out.print("( ");
        for (int i: ob2) System.out.print(i + " ");
        System.out.print(")");
    }
}
