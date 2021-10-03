public class Main {
    public static void main(String[] args){
// overloaded methods = methods that share the same name but have different parameters
//        method name + parameters = method signature
        int x = 5;
        int y = 5;
        int z = 5;
        int t = 5;
        int f = 5;
        System.out.println(add(x,y));
        System.out.println(add(x,y,z,t,f));

    } // main curly bracket
    static int add(int a, int b){
        return a+b;

    }
    static int add(int a, int b, int c){
        return a+b+c;

    }
    static int add(int... args){ // returns an array list
        return args[0];
    }
}
