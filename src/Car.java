public class Car {

    private String brand;
    private String model;
    private int year;
    private int doors;
    private String type;
    private String fuel;
    private int horsePower;

    Car(String brand,String model,int year,int doors,String type,String fuel, int horsePower){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.doors = doors;
        this.type = type;
        this.fuel = fuel;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getDoors() {
        return doors;
    }

    public String getType() {
        return type;
    }

    public String getFuel() {
        return fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }
}

