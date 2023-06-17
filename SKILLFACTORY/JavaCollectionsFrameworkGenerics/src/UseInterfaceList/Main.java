package UseInterfaceList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Задача: в консоль должен выводиться список автомобилей
// в котором исключается марка KIA
// и марка TOYOTA вся идёт на продажу
public class Main {

    private static final String TOYOTA = "Toyota";
    private static final String BMW = "BMW";
    private static final String KIA = "KIA";

    public static void main(String[] args) {
        Car car1 = new Car(TOYOTA, "Camry", false);
        Car car2 = new Car(KIA, "Rio", false);
        Car car3 = new Car(BMW, "X3", false);
        Car car4 = new Car(BMW, "X5", false);
        Car car5 = new Car(BMW, "X6", false);
        Car car6 = new Car(TOYOTA, "Rav-4", true);
        Car car7 = new Car(KIA, "Spectra", false);
        Car car8 = new Car(TOYOTA, "Prius", false);
        Car car9 = new Car(BMW, "320-i", false);
        Car car10 = new Car(TOYOTA, "Corolla", false);

        // для решения поставленной задачи используется
        // интерфейс List
        List<Car> carList = new ArrayList<>();
        carList.add(car1); // добаляем в лист экземляр car1
        carList.add(car2); // добаляем в лист экземляр car2
        carList.add(car3); // добаляем в лист экземляр car3
        carList.add(car4); // добаляем в лист экземляр car4
        carList.add(car5); // добаляем в лист экземляр car5
        carList.add(car6); // добаляем в лист экземляр car6
        carList.add(car7); // добаляем в лист экземляр car7
        carList.add(car8); // добаляем в лист экземляр car8
        carList.add(car9); // добаляем в лист экземляр car9
        carList.add(car10); // добаляем в лист экземляр car10

        // данный код выдаст ОШИБКУ
        // Java не даёт удалять во время итерации компонент коллекции
        // для решения представлен ниже код с ипользованием Iterator
//        for (Car car : carList) {
//            if (car.getBrand().equals(KIA)) {
//                carList.remove(car);
//            } else if (car.getBrand().equals(TOYOTA)) {
//                car.setOnSale(true);
//            }
//        }

        Iterator<Car> iterator = carList.iterator();
        // данный класс позволяет удалять из списка компоненты
        // во время итерации не вызывая ошибки
        while (iterator.hasNext()) {
            // iterator.hasNext() означае, пока есть в списке
            // итератор, будет true
            Car car = iterator.next();
            if (car.getBrand().equals(KIA)) {
                iterator.remove();
            } else if (car.getBrand().equals(TOYOTA)) {
                car.setOnSale(true);
            }
        }

        for (Car car : carList) {
            System.out.println(car);
        }
    }
}
