package BitSetDemo;

import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        BitSet bitSet1 = new BitSet(16);
        BitSet bitSet2 = new BitSet(16);

        for (int i = 0; i < 16; i++) {
            if (i % 2 == 0) bitSet1.set(i);
            if (i % 5 != 0) bitSet2.set(i);
        }

        System.out.println("bitSet1: ");
        System.out.println(bitSet1);

        System.out.println("bitSet2: ");
        System.out.println(bitSet2);

        bitSet2.and(bitSet1);
        System.out.println("bitSet2 AND bitSet1:");
        System.out.println(bitSet2);

        bitSet2.or(bitSet1);
        System.out.println("bitSet2 OR bitSet1:");
        System.out.println(bitSet2);

        bitSet2.xor(bitSet1);
        System.out.println("bitSet2 XOR bitSet1:");
        System.out.println(bitSet2);
    }
}
