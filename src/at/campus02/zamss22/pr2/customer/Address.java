package at.campus02.zamss22.pr2.customer;

public class Address {
    private String street;
    private String zip;
    private String city;
    private String country;


    public Address(String street, String zip, String city, String country){
      //  System.out.println(street +"," + zip + ","+city+","+country);
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.country = country;
      //  String[] add ={street, zip, city, country};

    }
    /*
    public String toString(){
        return address.toString(add);
        //System.out.println(address.toString(add));
    }

     */

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", zip='" + zip + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
