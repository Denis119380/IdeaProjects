package StringReplace;
// Замена подстроки
class StringReplace {
    public static void main(String[] args) {
        String org = "This is test. This is, too.";
        String search = "is";
        String sub = "was";
        String result = "";
        int i;

        do {
            System.out.println(org);
            i = org.indexOf(search);
            System.out.println(i);
            if (i != -1) {
                result = org.substring(0, i);
                result = result + sub;
                result = result + org.substring(i + search.length());
                org = result;
            }
        } while (i != -1);
    }
}
