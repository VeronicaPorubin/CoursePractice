package stock.management.data;

import java.util.Arrays;

public class Order {
    private  int id;
    private String customer;
    private String name;
    private Products [] productsList;
    private int [] qtyList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Products[] getProductsList() {
        return productsList;
    }

    public void setProductsList(Products[] productsList) {
        this.productsList = productsList;
    }

    public int[] getQtyList() {
        return qtyList;
    }

    public void setQtyList(int[] qtyList) {
        this.qtyList = qtyList;
    }

    public Order(int id, String customer, String name, Products[] productsList, int[] qtyList) {
        this.id = id;
        this.customer = customer;
        this.name = name;
        this.productsList = productsList;
        this.qtyList = qtyList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", name='" + name + '\'' +
                ", productsList=" + Arrays.toString(productsList) +
                ", qtyList=" + Arrays.toString(qtyList) +
                '}';
    }
}
