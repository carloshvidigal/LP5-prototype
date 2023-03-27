package prototype;

public class Brand implements Cloneable{
    private String name;
    private String country;
    private String city;

    public Brand(String name, String country, String city){
        super();
        this.name = name;
        this.country = country;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "(" +
                "Nome: " + name +
                ", País: " + country +
                ", Cidade: " + city +
                ')';
    }
}
