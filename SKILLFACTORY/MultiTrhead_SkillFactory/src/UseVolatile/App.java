package UseVolatile;
// Использование ключевого слова volatile
// для исключения вероятности игнорирования
// реализации метода shutDown()
public class App {
    public static void main(String[] args) throws
            InterruptedException{
        Processor processor = new Processor();
        processor.start();

        Thread.sleep(1000);

        processor.shutDown();
    }
}
