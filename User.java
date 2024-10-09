
import java.util.*;

class AgeInValid extends Exception {

}

class User {
    public static void main(String[] args) {
        try {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Please  enter your age:");
            int Age = sobj.nextInt();

            if (Age < 18) {
                throw new AgeInValid();
            } else {
                System.out.println("You successfully loged in on site");
            }
        }

        catch (AgeInValid obj) {
            System.out.println("Age is invalid to register for this site");
        }
    }
}