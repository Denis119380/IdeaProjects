package RichestCustomerWealth_1672;

class Main {
    public static int maximumWealth(int[][] accounts) {
        int wealth = 0;
        int results = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (wealth < results) wealth = results;
            results = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                results += accounts[i][j];
            }
        }
        return (wealth < results) ? results : wealth;
    }

    // найти самого богатого вкладчика
    public static int maximumWealth1(int[][] accounts) {
        int maxWealthSoFar = 0;

        for (int[] customer : accounts) {
            int currentCustomerWealth = 0;

            for (int bank : customer) {
                currentCustomerWealth += bank;
            }

            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        return maxWealthSoFar;
        // Time complexity = O(n * m)
        // Space complexity = O(1)
    }

    public static void main(String[] args) {
        int[][] ob1 = {{2,3},{10,2},{5,6}};
        System.out.println(maximumWealth(ob1));
        System.out.println(maximumWealth1(ob1));
    }
}
