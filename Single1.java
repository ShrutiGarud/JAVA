class Base {
    public int A, B;

    public Base() {
        System.out.println("Base constructor");
    }

    public void fun() {
        System.out.println("INside the fun");
    }
}

class Derived extends Base {
    public int X, Y;

    public Derived() {
        System.out.println("derived constructor");
    }

    public void gun() {
        System.out.println("Inside derived gun");
    }
}

class Single1 {
    public static void main(String A[]) {
        Base bobj1 = new Base(); // nocasting
        Derived dobj1 = new Derived(); // nocasting
        Base bobj2 = new Derived(); // upcasting allowed
        Derived dobj2 = new Base(); // down casting NA

    }
}