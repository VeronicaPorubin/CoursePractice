package stock.management.data.util;

import stock.management.data.Products;
import stock.management.data.enums.ProductCategory;

import java.awt.*;

public class ProductInput {
    public static Products enterNewProduct(int id) {
        Products products = null;
        String newProductName;
        ProductCategory newProductCategory;
        String newProductMadeOf;
        double newProductPrice;
        ValidationInput validationInput = new ValidationInput();

        System.out.println("Enter the product name: ");
        newProductName = validationInput.inputString();

        System.out.println("Enter the product category: ");
        newProductCategory = getInputCategory(validationInput);

        System.out.println("Enter the product manufacturer");
        newProductMadeOf = validationInput.inputString();

        System.out.println("Enter the product price: ");
        newProductPrice =  validationInput.inputDouble();
        products = new Products(id, newProductName, newProductCategory,newProductMadeOf, newProductPrice);
        return products;
    }

    private static ProductCategory getInputCategory(ValidationInput validationInput) {
        ProductCategory productCategory = null;
        boolean isValid = true;
        while (isValid) {
            System.out.println("Choose one of the categories id: ");
            System.out.println("1." + ProductCategory.FOOD + "\n2." + ProductCategory.ACCESSORIES + "\n3" + ProductCategory.MEDICINE);
           int newProductCategoryId = validationInput.intInput();
           switch (newProductCategoryId){
               case 1:
                   productCategory = ProductCategory.FOOD;
                   isValid = false;
                   break;
               case 2:
                   productCategory = ProductCategory.ACCESSORIES;
                   isValid = false;
                   break;
               case 3:
                   productCategory = ProductCategory.MEDICINE;
                   isValid = false;
                   break;
               default:System.out.println("You have introduced a non-existing category \n");
           }
        }
        return productCategory;
    }
}
