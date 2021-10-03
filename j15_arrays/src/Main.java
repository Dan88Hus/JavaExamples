public class Main {
    public static void main(String[] args){
        // arrays used to store multiple values in a single variable
        String[] cars = {"camaro","Corvet", "Tesla", "BMW"};

//        cars[0]; //camaro
        cars[0] = "Mustang";
//        System.out.println(cars[3]);
//        elements of arrays must be in same type.
//        or we can create Array in another way as additional way
        String[] carsp = new String[3];
        carsp[0] = "camaro";
        carsp[1] = "Corvette";
        carsp[2] = "Corvettepfdsfs";

        for(String i : carsp){
            System.out.println(i);
        }
// 2D Arrays = an arrays of arrays (row and columns, or something like matrix)
        String[][] cars2d = new String[3][3];
        cars2d[0][0] = "camarro";
        cars2d[0][1] = "corvette";
        cars2d[0][2] = "Mustang";
//        ... etc
//        or we can create 2darray as
        String[][] cars2da = {{"camarro", "corvette", "BMW"}, {"Mustang", "toyota", "BMW"}};



    }
}
