package stock.management.data.util;

import stock.management.data.Products;
import stock.management.data.Stock;
import stock.management.data.enums.ProductCategory;

public class InitData {

    public static Products [] initProducts (){
        Products product1 = new Products(1, "Milk", ProductCategory.FOOD, "Alba", 11.25);
        Products product2 = new Products(2, "Citramon", ProductCategory.MEDICINE, "BalkanFarm", 4.40);
        Products product3 = new Products (3, "watch", ProductCategory.ACCESSORIES, "Fossil", 1800);
        return new Products[] {product1, product2, product3};
    }
    public static Stock[] initStock () {
        Stock stock1Product1 = new Stock (1, 1, 200, "level 1", "12.02.2022" );
        Stock stock2Product1 = new Stock (2,1, 10, "Level1", "03.09.2021");
        Stock stock1Product2 = new Stock (3, 2,24,"Level0","12.04.2021");//citramon alt stock
        Stock stock1Product3 = new Stock(4,3,20,"Level3", "02.02.2020"); //watch

        return new Stock[] {stock1Product1,stock1Product3,stock1Product2,stock2Product1};
    }
}










