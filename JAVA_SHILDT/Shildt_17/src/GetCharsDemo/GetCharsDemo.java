package GetCharsDemo;

public class GetCharsDemo {
    public static void main(String[] args) {
        String s = "This is demonstration method's getChars().";
        int start = 8;
        int end = 12;
        char[] target = new char[end - start];
        s.getChars(start, end, target, 0);
        System.out.println(target);
    }
}
