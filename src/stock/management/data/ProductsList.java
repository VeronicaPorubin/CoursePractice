package stock.management.data;

import stock.management.data.util.ProductInput;

public class ProductsList {
    private Products [] products;

    public void setProducts(Products[] products) {
        this.products = products;
    }

    public Products[] getProducts() {
        return products;
    }
    public void printProducts (){

        for (Products product : this.products){
            System.out.println(product.toString());
        }
    }

    public void insertNewProduct(Products product) {
        int lenght = this. products.length;
        Products [] updatedProductList = new Products[lenght +1];

        for (int i=0 ; i < lenght; i++){
            updatedProductList [i] = products[i];
        }
updatedProductList [lenght] = product;

        this.products = updatedProductList;
    }
}
