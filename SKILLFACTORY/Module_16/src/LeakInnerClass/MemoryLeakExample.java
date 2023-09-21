package LeakInnerClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MemoryLeakExample {

    static class CyclicCollection {
        private final List<byte[]> list = new ArrayList<>(10);

        CyclicCollection() {
            for (int i = 0; i < 10; i++)
                list.add(new byte[1024 * 1024]);
        }

        Element getElement(int index) {
            return new Element(list.get(index % 10));
        }

        class Element { // класс необходимо сделать статическим
                        // чтобы предотвратить утечку памяти
            final byte[] data;
            Element(byte[] data) {
                this.data = data;
            }
        }

    }

    public static void main(String[] args) {
        List<CyclicCollection.Element> list = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            CyclicCollection collection = new CyclicCollection();
            list.add(collection.getElement(i));
            // после окончания метода getElement() во время каждой итерации,
            // в куче(heap) нужно удалить объект типа Element;
            // использоваться он больше не будет, но удалить его сборщик мусора
            // не может, если класс Element не статичный
        }
    }
}
