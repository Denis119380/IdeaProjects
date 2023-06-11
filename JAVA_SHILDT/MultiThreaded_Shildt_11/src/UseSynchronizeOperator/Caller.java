package UseSynchronizeOperator;

class Caller implements Runnable {
    String msg; // переменная объявляется под сообщение
    Call target; // переменная объявляется под ссылку
    // на объект задействованный в конструкторе
    Thread t; // переменная объявляется под потоки исполнения

    Caller(Call target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
        t.start();
    }

    // синхронизированные вызовы метода call()
    public void run() {
        synchronized (target) {
            // синхронизированный объект
            target.call(msg);
        }
    }
}
