package VerDemo;

class VerDemo {
    public static void main(String[] args) {
        Runtime.Version ver = Runtime.version();

        // different version output (main and add numbers, and security number)
        // Methods deprecated, in JDK10 use in preference: feature(), interim(), update()
        System.out.println("Main number version: " + ver.major());
        System.out.println("Add number version: " + ver.minor());
        System.out.println("Security number version: " + ver.security());
    }
}
