public class Car {
    private String make; // this means only this class has access to this members
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
//        this.year = year;
        this.setYear(year);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
