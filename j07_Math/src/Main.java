import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        double x = 3.14;
        double y = -10;
        double z = Math.max(x , y);
        System.out.println(z);

        // ceil ir round up floor is round down
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x");
//        x = scanner.nextDouble();
        System.out.println("Enter side y");
//        y = scanner.nextDouble();

        z= Math.sqrt((x*x)+(y*y));
//        System.out.println("the Hypotenuse is: "+z);

        scanner.close();
// RANDOM CLASS
        Random random = new Random();
        int r = random.nextInt();
        System.out.println(r); // random value of r sacale under -2b to +2b
//         to limit size we pass value as arg
        int ra = random.nextInt(6); // 0 to 5 so we may add +1 for 0 to 6
        // double ile de cozulebilinir random.nextDouble() bize 0 ile 1 arasi deger verir
        double ran = random.nextDouble();
        System.out.println(ran);
//        random.nextBoolean() ayni sekilde true veya false verir



    }
}
