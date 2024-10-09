import java.util.Scanner;

class Exception3 {
    public static void main(String[] args) {

        try {

            System.out.println("Inside the try block");

            Scanner sobj = new Scanner(System.in);
            int Arr[] = { 10, 20, 30, 40, 50 };

            System.out.println("Enter the index number:");
            int i = sobj.nextInt();

            System.out.println(Arr[i]);
        }

        catch (ArrayIndexOutOfBoundsException obj) {
            System.out.println("Inside the catch block");
        } finally {
            System.out.println("Indise the finally block");
        }

        System.out.println("End the code");
    }
}