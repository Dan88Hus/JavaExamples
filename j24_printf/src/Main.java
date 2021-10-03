public class Main {
    public static void main(String[] args){
        System.out.println("hello from printf");
//        printf = an optional method to control, format, and display text to the console window
//        2 arguments = format string + (object/variable/value)
//        % [flags] [precision] [ width] [conversion-character]
        System.out.printf("This is a format String %d",123);
        boolean myBoolean = true;
        String myString = "Daniel";
        char myChar ='@';
        int myInt = 4;
        double myDouble = 5.2;
        System.out.printf("%b", myBoolean);
        System.out.printf("Hello %10s", myString);
        System.out.printf("%c", myChar);
        System.out.printf("%.2f", myDouble); //makes 2 decimal
        System.out.println();
        System.out.printf("%+20f", myDouble); //makes plus sign before it

    }
}
