package Lesson15.HomeWork;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("Washing Machine", "LG 6 kg", 5, 6999);
        invoice.getAmount();
        double invoiceAmound = invoice.getAmount();
        int qtyOfProductPurchased = invoice.getQtyOfProdPurchased();
        System.out.println("Invoice for " + qtyOfProductPurchased + " appliances: " + invoiceAmound + " lei");

        System.out.println("-----------------------------------------------------------------------------------------");

        Date date = new Date(31,12,2025);
        date.displayDate();


    }
}
