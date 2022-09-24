public class Car {
    private String brand;
    private String model;
    private String color;
    private String productionCountry;
    private double engineVolume;
    private String productionYear;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getProductionYear() {
        return productionYear;
    }



    public Car(String brand, String model, String color, String productionCountry, double engineVolume, String productionYear) {
        if(model==null) {
            this.model = "default";
        } else{
            this.model = model;}
        if(brand==null) {
            this.brand = "default";
        } else{
            this.brand = brand;}
        if(color==null) {
            this.color = "default";
        } else{
            this.color = color;}
        if(productionCountry==null) {
            this.productionCountry = "default";
        } else{
            this.productionCountry = productionCountry;}
        if(engineVolume==0) {
            this.engineVolume = 1.5;
        } else{
            this.engineVolume = engineVolume;}
        if(productionYear==null) {
            productionYear = "default";
        } else{
            this.productionYear = productionYear; }

    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + color + ", " + productionCountry + ", объем двигателя " + engineVolume + ", " +
                productionYear + ".";
    }
}