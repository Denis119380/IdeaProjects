package HierGenSubClass;

class GenDemo {
    public static void main(String[] args) {
        Gen<String> obGen = new Gen<String>("Value of int equal: ", 102);
        System.out.print(obGen.getOb());
        System.out.println(obGen.getI());
    }
}
