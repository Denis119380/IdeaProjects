package SetCharAtDemo;

public class SetCharAtDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Morning!");
        System.out.println(sb);
        System.out.println("before changed, symbol with index 0: " + sb.charAt(0));
        sb.setCharAt(0, 'N');
        sb.setLength(2);
        System.out.println(sb);
    }
}
