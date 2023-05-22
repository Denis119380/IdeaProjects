class Client implements Callback{
    // реализовать интерфейс Callback
    public void callback(int p) {
        System.out.println("Метод callback()," +
                " вызываемый со значением " + p);
    }

    void nonFaceMeth() {
        System.out.println("В классах, реализующих интерфейсы," +
                " могут определяться и другие члены.");
    }
}
