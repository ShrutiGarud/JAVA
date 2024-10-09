interface Circle {
    float Radius = 10.5f;
    float PI = 3.14f;

    float Area();
    float Circumferance();

}

class Marvellous implements Circle {
    public float Area() {
        return PI * Radius * Radius;
    }

    public float Circumferance() {
        return 2 * PI * Radius;
    }
}

class Blueprint {
    public static void main(String arg[]) {
        Marvellous mobj = new Marvellous();

        System.out.println("Area is :" + mobj.Area());
        System.out.println("Circumferance is:" + mobj.Circumferance());

        System.out.println("Value of Radius is:" + Circle.Radius);
        System.out.println("Value of PI is:" + Circle.PI);

        // Circle.PI = 7.12;

    }
}