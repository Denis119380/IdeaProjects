//class  Main {
//    public static void main(String[] args) {
//        Balance.addLeft();
//        Balance.addRight();
//        System.out.println(Balance.getSituation(20,10));
//    }
//}
//public class Balance {
//    // write your code here
//    public static void main(String[] args) {
//        System.out.println(Balance.getSituation(20,10));
//    }
//    static void addRight() {
//        System.out.println("Right side balance = 20");
//    }
//    static void addLeft() {
//        System.out.println("Left side balance = 10");
//    }
//    public static String getSituation(int r, int l) {
//        String result;
//        if (r == l) {
//            result = "=";
//        } else if (r > l) {
//            result = "R";
//        } else {
//            result = "L";
//        }
//        return result;
//    }
//}

public class Balance {
    // write your code here
    int l, r;
    void addRight(int n) {
        r += n;
    }
    void addLeft(int n) {
        l += n;
    }
    String getSituation() {
        String result;
        if (l == r) {
            result = "=";
        } else if (l > r) {
            result = "L";
        } else {
            result = "R";
        }
        return result;
    }
}