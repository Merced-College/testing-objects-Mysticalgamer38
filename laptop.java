public class laptop {
    
    private String brand;
    private int ramGB;
    private double screenSize;

    public laptop() {
        this.brand = "Unknown";
        this.ramGB = 0;
        this.screenSize = 0.0;
    }

    public laptop(String brand, int ramGB, double screenSize) {
        this.brand = brand;
        this.ramGB = ramGB;
        this.screenSize = screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRamGB() {
        return ramGB;
    }

    public void setRamGB(int ramGB) {
        if (ramGB >= 0) {
            this.ramGB = ramGB;
        }
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        if (screenSize > 0) {
            this.screenSize = screenSize;
        }
    }

    @Override
    public String toString() {
        return "Laptop{brand='" + brand + "', ramGB=" + ramGB + ", screenSize=" + screenSize + "}";
    }
}
