import java.util.Scanner;

class Car {
    private String model;
    private int plate;
    private int km;
    boolean rented;
    
    public Car(String model, int plate, int km) {
        this.model = model;
        this.plate = plate;
        this.km = km;
        this.rented = false;
    }
    public String getModel() {
        return model;
    }
    public int getPlate() {
        return plate;
    }
    public int getKm() {
        return km;
    }
    public boolean isRented() {
        return rented;
    }
    public void rent() {
        this.rented = true;
    }
    public void returnCar() {
        this.rented = false;
    }
    public void addKm(int km) {
        this.km += km;
    }
}

public class CarRental {
    public static void main(String[] args) {
        System.out.println("Welcome to the Car Rental!");

        Car [] cars = {
                new Car("BMW", 123456, 110),
                new Car("Mercedes", 654321, 137),
                new Car("Audi", 789012, 200),
                new Car("Volvo", 321654, 120),
                new Car("Ford", 210987, 60)
        };

        while (true) {
            System.out.println("(1) rent a car");
            System.out.println("(2) return a car");
            System.out.println("(3) display all cars");
            System.out.println("(4) exit");

            Scanner input = new Scanner(System.in);
            System.out.print("Give option: ");
            String option = input.nextLine();

            if (option.equals("1")) {
                System.out.print("Give car plate number: ");
                int carNumber = input.nextInt();
                boolean rented = false;
                for (Car car : cars) {
                    if (car.getPlate() == carNumber) {
                        if (car.isRented()) {
                            System.out.println("This car is already rented!");
                        }
                        else {
                            car.rented = true;
                            System.out.println("Car rented!");
                        }
                        rented = true;
                        break;
                    }
                }
            }
            else if (option.equals("2")) {
                System.out.print("Give car plate number: ");
                int carNumber = input.nextInt();
                boolean found = false;

                for (Car car : cars) {
                    if (car.getPlate() == carNumber) {
                        found = true;
                        if (!car.isRented()) {
                            System.out.println("This car is not rented!");
                        }
                        else {
                            System.out.print("Give new value for km: ");
                            int newKm = input.nextInt();
                            car.addKm(newKm);
                            System.out.println("Car returned!");
                            car.returnCar();
                        }
                        break;
                    }
                }
            }

            else if (option.equals("3")) {
                for (int i = 0; i < cars.length; i++) {
                    System.out.println("- " + cars[i].getModel() + ": plate number " + cars[i].getPlate() + " " + cars[i].getKm() + " km");
                }
            }
            else if (option.equals("4")) {
                System.out.println("Exiting...");
                break;
            }
        }
    }
}
