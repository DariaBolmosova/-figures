package hilleltask2;

public class Car {
private String name ;
private String model;
private int yearOfManufacture;
private int registrationNumber;
private int mileage;
private int price;

    public Car(String name, String model, int yearOfManufacture, int registrationNumber, int mileage, int price) {
        this.name = name;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.registrationNumber = registrationNumber;
        this.mileage = mileage;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }
}
