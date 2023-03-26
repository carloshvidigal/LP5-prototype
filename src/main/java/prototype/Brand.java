package prototype;

public class Brand implements Cloneable{

    private String country;
    private String city;

    public Brand(String country, String city){
        super();
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Marca(" +
                "País:" + country +
                ", cidade:" + city +
                '}';
    }
}
