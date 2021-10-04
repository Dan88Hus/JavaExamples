public class Main {
    public static void main(String[] args){
//        Super = keyword refers to the superclass ( parent) of an object
//   very similar to this. keyword
 Hero hero1 = new Hero("Batman", 42, "$$$");
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.Power);
        // super can be used to call method as well from parent class
//    like super.mETHODNAME
    }
}
