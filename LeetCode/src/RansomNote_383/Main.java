package RansomNote_383;

import java.util.HashMap;

public class Main {
    public static boolean method(String o1, String o2) {
        int count = 0;
        HashMap<Integer, Character> hashMap = new HashMap<>();
            for (int i = 0; i < o1.length(); i++) {
                for (int j = 0 ; j < o2.length(); j++) {
                    if (o1.charAt(i) == o2.charAt(j) && !hashMap.containsKey(j)) {
                        hashMap.put(j, o2.charAt(j));
                        count++;
                        break;
                    }
                }
            }
        return count == o1.length();
    }

    public static void main(String[] args) {
        System.out.println(method("aab", "aa"));
    }
}
