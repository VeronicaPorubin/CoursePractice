package Lesson15.HomeWork;

public class Invoice {
    private String deviceModel;
    private String productDescription;
    private int qtyOfProdPurchased;
    private double priceForProduct;

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getQtyOfProdPurchased() {
        return qtyOfProdPurchased;
    }

    public void setQtyOfProdPurchased(int qtyOfProdPurchased) {
        this.qtyOfProdPurchased = qtyOfProdPurchased;
    }

    public double getPriceForProduct() {
        return priceForProduct;
    }

    public void setPriceForProduct(double priceForProduct) {
        this.priceForProduct = priceForProduct;
    }

    public Invoice(String deviceModel, String productDescription, int qtyOfProdPurchased, double priceForProduct) {
        this.deviceModel = deviceModel;
        this.productDescription = productDescription;
        this.qtyOfProdPurchased = qtyOfProdPurchased;
        this.priceForProduct = priceForProduct;
    }

    public double getAmount() {
        double invoiceAmount;
        invoiceAmount = priceForProduct * qtyOfProdPurchased;


        return invoiceAmount;
    }
}
