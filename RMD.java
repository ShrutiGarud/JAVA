class Base {
    public int A, B;

    public void fun() {
        System.out.println("INside the fun");
    }

    public void gun() {
        System.out.println("INside the gun");
    }

    public void sun() {
        System.out.println("INside the sun");
    }

    public void run() {
        System.out.println("INside the run");
    }
}

class Derived extends Base {
    public int X, Y;

    public void gun() {
        System.out.println("Inside derived gun");
    }

    public void run() {
        System.out.println("INside the fun");
    }

    public void mun() {
        System.out.println("INside the fun");
    }
}

class RMD {
    public static void main(String A[]) {
        Base bobj = new Derived();
        bobj.fun();
        bobj.gun();
        bobj.sun();
        bobj.run();
        bobj.mun();
    }
}