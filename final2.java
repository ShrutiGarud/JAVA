class Base {
    public void fun() {
        System.out.println("Inside the fun");
    }

    public final void gun() {
        System.out.println("Inside the gun");
    }
}

class Derived extends Base {
    public void fun() {
        System.out.println("Inside the Derived fun");
    }

    public void gun() {
        System.out.println("Inside derived gun");
    }

}

class final2 {
    public static void main(String A[]) {

    }
}