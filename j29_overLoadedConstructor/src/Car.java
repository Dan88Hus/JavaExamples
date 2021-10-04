public class Car {
        String make = "Ford";
        String model = "Mustang";
        String color = "red";
        int year = 2021;

        public String toStringOverride(){
                return make + "\n"+ model+"\n"+color+"\n"+year;
        }


}
