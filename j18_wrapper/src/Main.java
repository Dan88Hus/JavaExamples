import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        wrapper class = provides a way to use primitive data types as reference data types
//                            reference data types contain useful methods
//                        can be used with collections (ex. ArrayList, trim, length and etc but wrappers are slower)
//        primitive   wrapper
//        --------------------
//        boolean     Boolean
//        char        Character
//        int         Integer
//        double      Double
//    autoboxing = the automatic conversion that Java compiler makes between the primitive types to Wrapper
//        unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive
        Boolean a = true ;
        Character b ='@';
        Integer c = 123;
        Double d = 3.14;
        String name = "Daniel";

//        ArrayList = a resizable array.
//        Elements can be added and removed after compilation phase
//        store reference data types
        ArrayList<String> food = new ArrayList<String>(); //for ArrayList type wrapper always
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
//normally we use .length but with ArrayList we use .size
for(int i=0; i<food.size(); i++){
//    System.out.println(i); // this will give us 0 ,1,2 which are keys
//    we need to use getter setter to get the values
    System.out.println(food.get(i));

}
food.set(0, "sushi");
food.remove(2);
//food.clear(); // deletes ArrayList
System.out.println(food.get(0));

//-----------------
//2DArrayList = a dynamic list of lists
//        you can change the size of these lists during runtime
        ArrayList<ArrayList<String>> groceryList = new ArrayList();
ArrayList<String> bakeryList = new ArrayList();
bakeryList.add("pasta");
bakeryList.add("garlic bread");
        System.out.println(bakeryList.get(0));
// ArrayList , they can be in different sizes
ArrayList<String> produceList = new ArrayList();
        produceList.add("pastaProduce");
        produceList.add("garlic breadProduce");
        System.out.println(produceList.get(0));

// and we merge them together in ArrayList
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        System.out.println(groceryList); // [[pasta, garlic bread], [pastaProduce, garlic breadProduce]]
        System.out.println(groceryList.get(0).get(1)); //garlic bread

    }
}
