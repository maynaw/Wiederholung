package at.campus02.zamss22.pr3.ue11;

public class Produkt {
    String productName;
    double price;
    String productCategory;

    @Override
    public String toString() {
        return "Produkt{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}
