package UseSynchronized1;

class Teletype extends Thread{

    String message;

    Teletype(String message) {
        this.message = message;
    }

    static Teletype lock = new Teletype("lock"); // не понятно как работает данный элемент, он
                                                 // помогая вывести в консоль сначала один поток
                                                 // затем другой, без их смешивания

    public void run() {
        synchronized (lock) {
            for (int i = 0; i < message.length(); i++) {
                System.out.print(message.charAt(i));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }
            }
        }
    }
}
