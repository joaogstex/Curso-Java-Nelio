package interfaceatv;
public class Vehicle {
    
    private String carModel;

    public Vehicle(String carModel) {
        this.carModel = carModel;
    }

    public Vehicle() {}

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public String toString() {
        return carModel;
    }
}
