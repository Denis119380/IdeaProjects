package AppendDemo;

class AppendDemo {
    public static void main(String[] args) {
        String s;
        int a = 56;
        StringBuffer sb = new StringBuffer(40);
        s = sb.append("a = ").append(a).append("!").toString();
        System.out.println(s);
    }
}
