package InstanceOf;

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}
public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new  B();
        C c = new C();
        D d = new D();

        if (a instanceof A) System.out.println("a является экземпляром A");
        if (c instanceof A) System.out.println("c можно привести к типу A");
        if (a instanceof C) System.out.println("a можно привести к типу C");
//        if (c instanceof D) // Error

        System.out.println();
        // сравнение с порождёнными типами
        A ob;
        ob = d; // ob ссылается на d
        if (ob instanceof D) System.out.println("ob является экземпляром класса D");

        System.out.println();

        ob = c; // ob ссылается на c
        if (ob instanceof D) System.out.println("ob можно привести к типу D");
        else System.out.println("ob нельзя привести к типу D");

        if (ob instanceof A) System.out.println("ob можно привести к типу A");

        System.out.println();
        // все объекты могут быть приведены к типу Object
        if (b instanceof Object) System.out.println("b можно привести к типу Object");
    }
}
