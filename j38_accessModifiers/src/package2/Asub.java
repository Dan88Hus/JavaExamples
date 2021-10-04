package package2;

//import package1.A;
import package1.*;

public class Asub extends A {
//    public static void main(String[] args) {
//        C c = new C();
//        System.out.println(c.defaultMessage); //'defaultMessage' is public in 'package2.C'. Can be accessed from inside package
//    }
// protected work in here becasue they are in extending version even in different package
public static void main(String[] args) {
Asub asub = new Asub();
    System.out.println(asub.protectedMessage);


}
}
