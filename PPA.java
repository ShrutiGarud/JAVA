import Marvellous.Arithmatic;
import Infosystems.Mathamatics;

class PPA {
    public static void main(String arg[]) {
        Arithmatic aobj = new Arithmatic();
        Mathamatics mobj = new Mathamatics();

        System.out.println(aobj.Addition(11, 10));
        System.out.println(aobj.Substraction(11, 10));

        System.out.println(mobj.Multiplication(11, 10));
        System.out.println(mobj.Division(11, 10));

    }
}