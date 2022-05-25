package at.campus02.zamss22.pr3.ue11;
public class Produkt {
    protected String name;
    protected double price;
    protected String productCategory;

    public Produkt(String name, double price, String productCategory) {
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", productCategory='" + productCategory + '\'' +
                '}';
    }
}