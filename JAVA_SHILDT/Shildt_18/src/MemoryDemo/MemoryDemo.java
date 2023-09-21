package MemoryDemo;

class MemoryDemo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        long mem1, mem2;
        Integer[] someInt = new Integer[1000];

        System.out.println("Total memory: " + rt.totalMemory());
        // общее количество байтов оперативной памяти доступное программе

        mem1 = rt.freeMemory();
        // приблизительное количество байтов свободной памяти
        // доступной исполняющей системе

        System.out.println("Free memory started: " + mem1);
        rt.gc(); // инициирует сборку мусора
        mem1 = rt.freeMemory();
        System.out.println("Free memory after Garbage Collector: " + mem1);

        for (int i = 0; i < 1000; i++) someInt[i] = Integer.valueOf(i);

        mem2 = rt.freeMemory();
        System.out.println("Free memory after memory allocation: " + mem2);
        System.out.println("Memory used for allocation: " + (mem1 - mem2));

        for (int i = 0; i < 1000; i++) someInt[i] = null;

        rt.gc();
        mem2 = rt.freeMemory();
        System.out.println("Free memory after clear: " + mem2);
    }
}
