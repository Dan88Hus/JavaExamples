public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) { // this is constructor

        this.name = name;
        this.age = age;
        this.weight = weight;

    } //public yok onunde, this deyince class in instatiated edildiginde ki argumentleri belirtiyor burda

    void eat(){
        System.out.println(this.name+" is eating");
    }
    void drink(){
        System.out.println(this.name+" is drinking");
    }
}


