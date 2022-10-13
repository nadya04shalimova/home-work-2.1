public class Car {
    private String brand;
    private String model;
    private double engineValume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    public double getEngineValume() {
        return engineValume;
    }

    public void setEngineValume(double engineValume) {
        this.engineValume = engineValume;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public Car(String brand, String model, double engineValume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineValume = engineValume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }



    @Override
    public String toString(){
        return "Car{"+
                "brand='"+brand+'\''+
                ", model='"+model+'\''+
                ", engineValume='"+engineValume+
                ", color'"+color+'\''+
                ", productionYear="+productionYear+
                ", productionCountry='"+productionCountry+'\''+
                '}';


    }
}

