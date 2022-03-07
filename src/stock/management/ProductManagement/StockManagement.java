package stock.management.ProductManagement;

import stock.management.data.StockList;
import stock.management.data.util.ValidationInput;

public class StockManagement {
    public void checkAvailableStock(StockList stockList) {
        ValidationInput validationInput = new ValidationInput();
        int productId;
        boolean isAvailableStock;
        int stockId = 0;

        System.out.println("Give the product id to find stock");
        productId = validationInput.intInput();

        isAvailableStock = stockList.isAvailableStockForProduct (productId);
        if (isAvailableStock) {
            stockId = stockList.getStockByProductId (productId).getId();
        }
        System.out.println(isAvailableStock ?
                ("Stock with id[" + stockId + "] found for product with id [" + productId + "]") :
                ("For product with id [" + productId +  "], no stock was found. "));
    }

    public void addStock(StockList stockList) {
        int productId;
        int length = stockList.getStocks().length;

        System.out.println("Give the product id for the new stock: ");



    }
}
