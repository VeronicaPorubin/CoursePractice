package stock.management.ProductManagement;

import stock.management.data.Products;
import stock.management.data.ProductsList;
import stock.management.data.util.ProductInput;

public class ProductManagement {
    public void addProduct (ProductsList productsList){
        int length = productsList.getProducts().length;
        Products products = ProductInput.enterNewProduct(length+1);
        productsList.insertNewProduct(products);
    }
}
