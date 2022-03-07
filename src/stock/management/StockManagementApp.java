package stock.management;

import stock.management.ProductManagement.ProductManagement;
import stock.management.ProductManagement.StockManagement;
import stock.management.data.Products;
import stock.management.data.ProductsList;
import stock.management.data.Stock;
import stock.management.data.StockList;
import stock.management.data.enums.ProductCategory;
import stock.management.data.util.InitData;
import stock.management.data.util.ValidationInput;

import java.util.Scanner;

public class StockManagementApp {
    public static void main(String[] args) {

        ValidationInput validationInput = new ValidationInput();
        ProductsList productsList = new ProductsList();
        productsList.setProducts(InitData.initProducts());
        StockList stockList = new StockList();
        stockList.setStocks(InitData.initStock());
        ProductManagement productManagement = new ProductManagement();
        StockManagement stockManagement = new StockManagement();

        while (true) {
            int k;
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("Stock management app. " +
                    "\nPlease enter the corresponding number of the action you want to run!");
            System.out.println(" 1. Visualise available products.");
            System.out.println(" 2. Add new product.");
            System.out.println(" 3. Edit an existing product.");
            System.out.println(" 4. Visualise available stock.");
            System.out.println(" 5. Visualise available stock for a product.");
            System.out.println(" 6. Add stock for a product.");
            System.out.println(" 7. Edit an existing stock.");
            System.out.println(" 8. Delete stock.");
            System.out.println(" 9. Check available stock.");
            System.out.println(" 10. Pick an order.");
            System.out.println("Pick an order. ");
            System.out.println("Pick all order. ");
            System.out.println(" 0. Exit the MAIN menu!");
            System.out.println("-----------------------------------------------------------------------------------------------");
            k = validationInput.intInput();

            switch (k) {
                case 1: {
                    productsList.printProducts();
                    break;
                }
                case 2:
                    productManagement.addProduct(productsList);
                    break;
                case 3:
                    break;
                case 4:
                    productsList.printProducts();
                    break;
                case 5:
                case 6:
                    stockManagement.addStock(stockList);
                    break;
                case 7:
                case 8:
                case 9:
                    stockManagement.checkAvailableStock(stockList);
                    break;
                case 10:
                case 0:
                    return;
                default:
                    System.out.println("You have not entered a valid option!");
            }
        }
    }
}