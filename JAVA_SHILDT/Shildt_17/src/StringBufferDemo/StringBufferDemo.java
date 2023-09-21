package StringBufferDemo;

class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Morning!");
        System.out.println("buffer: " + sb);
        System.out.println("length: " + sb.length());
        System.out.println("capacity: " + sb.capacity());
    }
}
