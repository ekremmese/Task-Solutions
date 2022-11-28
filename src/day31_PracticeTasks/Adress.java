package day31_PracticeTasks;

public class Adress {
    public  int buldingNumber;
    public String street, city,state;
    public int zipCode;

    public Adress(int buldingNumber, String street, String city, String state, int zipCode) {
        this.buldingNumber = buldingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "buldingNumber=" + buldingNumber +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
