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

class DerivedX extends Base {
    public int P, Q;

    public DerivedX() {
        System.out.println("DerivedX constructor");
    }

    public void Sun() {
        System.out.println("INside derivedx sun");
    }
}

class Hierarchal {
    public static void main(String A[]) {
        Derived dobj1 = new Derived();
        DerivedX dobj2 = new DerivedX();
    }
}