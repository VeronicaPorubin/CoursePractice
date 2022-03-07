package stock.management.data;

import stock.management.data.enums.ProductCategory;
import stock.management.data.enums.ProductCategory;

public class Products {
    private int id;
    private String name;
    private ProductCategory category;
    private String madeOf;
    private double price;

    public Products(int id, String name, ProductCategory category, String madeOf, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.madeOf = madeOf;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(String madeOf) {
        this.madeOf = madeOf;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", madeOf='" + madeOf + '\'' +
                ", price=" + price +
                '}';
    }
}

