package stock.management.data;

public class StockList {
    private Stock [] stocks;
    public void setStocks(Stock[] stocks) {
        this.stocks = stocks;
    }
public Stock [] getStocks () {
        return stocks;
}

    public boolean isAvailableStockForProduct(int productId) {
        boolean availableForProduct = false;
        for (Stock stock : stocks){
            if (stock.getProductId() == productId){
                availableForProduct = true;

            }
        }
        return availableForProduct;
    }

    public Stock getStockByProductId(int productId) {
        Stock foundStock = null;
        for (Stock stock: stocks){
            if(stock.getProductId()==productId){
                foundStock = stock;
                break;
            }
        }
        return foundStock;

    }
    public void printStocks () {
        for (Stock stock: this.stocks) {
            System.out.println(stock.toString());
        }
    }
    public  Stock getStockProductId (int productId){
        Stock foundStock =  null;
        for (Stock stock: stocks){
            if (stock.getProductId() == productId){
                foundStock = stock;
            }
        }
        return foundStock;
    }
}

