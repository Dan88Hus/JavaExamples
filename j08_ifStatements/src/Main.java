public class Main {
    public static void main(String[] args){
        int age = 15;
        String day = "Monday";
        if(age==18){
            System.out.println("You are an hero");
        } else if(age<=15) {
            System.out.println("you are an bird yet");
        }
        switch (day){
            case "Sunday":
                System.out.println("its Sunday");
                break;
            case "Monday":
                System.out.println("its Monday");
                break;
            default:
                System.out.println("its not a Day");
                break;
        }
//        Logical operators: used to connect 2 or more expressions
//        && , || , !=
    }
}
