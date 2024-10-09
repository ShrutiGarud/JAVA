class Marvellous {
    public int i, j;

    public Marvellous() {
        System.out.println("MArvellous Constructor");
    }

    protected void finalize() {
        System.out.println("Inside the finalize method");
    }
}

// class ObjectDemo extends object
class ObjectDemo1 {
    public static void main(String Arg[]) {
        Marvellous obj = new Marvellous();
        System.out.println(obj.hashCode());
        obj = null;
        System.gc();
    }
}