public class Main {
    public static void main(String[] args) {

        Car car = new Car("Mitsubishi","ASX", 2015,5,"Crossover","Petrol", 145);
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getDoors());
        System.out.println(car.getType());
        System.out.println(car.getFuel());
        System.out.println(car.getHorsePower());
    }
}