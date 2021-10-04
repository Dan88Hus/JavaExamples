package package1;

import package2.*;

public class A {
    protected String protectedMessage = "THIS IS PROTECTEDMESSAGE FROM A";

    public static void main(String[] args) {
        C c = new C();
//        System.out.println(c.defaultMessage); //'defaultMessage' is not public in 'package2.C'. Cannot be accessed from outside package
        System.out.println(c.publicMessage);
        // public is visible within public methods

        B b = new B();
//        System.out.println(b.privateMessage); // only accesible in classs B

    }
}
