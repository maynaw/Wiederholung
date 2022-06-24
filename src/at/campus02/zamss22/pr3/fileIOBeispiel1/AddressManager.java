package at.campus02.zamss22.pr3.fileIOBeispiel1;

import java.util.ArrayList;

public class AddressManager {
   private ArrayList<Address> addresses;

    public AddressManager(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }

    public void add(Address a){
        addresses.add(a);
    }

    public void exportToCsv(String path, String sepatator){

    }
}
