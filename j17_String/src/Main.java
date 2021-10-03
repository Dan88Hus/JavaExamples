import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        System.out.println("welcome Strings");
        String name = "Daniel";
        boolean result = name.equals("daniel"); // returns boolean result
        boolean result2 = name.equalsIgnoreCase("daniel");

        System.out.println(result);
        System.out.println(result2);

        int result3 = name.length();
        char result4 = name.charAt(4);
        int result5 = name.indexOf("i");
        System.out.println(result5);
        boolean result6 = name.isEmpty();
        System.out.println(result6);
        String result7 = name.toLowerCase();

    }
}
