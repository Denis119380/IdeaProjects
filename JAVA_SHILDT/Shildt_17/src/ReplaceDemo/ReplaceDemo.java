package ReplaceDemo;

class ReplaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Это простой тест.");
        sb.replace(4, 8, "былось");
        System.out.println(sb);
    }
}
