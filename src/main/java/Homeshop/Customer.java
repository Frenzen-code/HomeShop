package Homeshop;

public class Customer {
    private String fullname;
    private String adress;

    public Customer(String fullname, String adress) {
        this.fullname = fullname;
        this.adress = adress;
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return adress;
    }
}
