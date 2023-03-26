package prototype;

public class Car implements Cloneable {

    private Brand brand;
    private String name;
    private String manufactureYear;
    private String color;

    public Car(Brand brand, String name, String manufactureYear, String color) {
        this.brand = brand;
        this.name = name;
        this.manufactureYear = manufactureYear;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(String manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car carClone = (Car) super.clone();
        carClone.brand = (Brand) carClone.brand.clone();
        return carClone;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca:" + brand +
                ", nome:" + name +
                ", ano de fabricação:'" + manufactureYear +
                ", cor:" + color  +
                "}";
    }
}
