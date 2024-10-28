package emad;

import java.time.LocalDate;

public class Sale {
    private int OrderID;
    private String ProductName;
    private String Category;
    private String SalesPerson;
    private int Quantity;
    private int Price;
    private int TotalAmount;
    private LocalDate OrderDate;

    public Sale(int orderID, String productName, String category, String salesPerson, int quantity, int price,int totalAmount, LocalDate localDate) {
        this.OrderID = orderID;
        this.ProductName = productName;
        this.Category = category;
        this.SalesPerson = salesPerson;
        this.Quantity = quantity;
       this.Price = price;
        this.TotalAmount = totalAmount;
        this.OrderDate = localDate;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getSalesPerson() {
        return SalesPerson;
    }

    public void setSalesPerson(String salesPerson) {
        SalesPerson = salesPerson;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(int totalAmount) {
        TotalAmount = totalAmount;
    }

    public LocalDate getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        OrderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Sale [OrderID=" + OrderID + ", ProductName=" + ProductName + ", Category=" + Category + ", SalesPerson="
                + SalesPerson + ", Quantity=" + Quantity + ", Price=" + Price + ", TotalAmount=" + TotalAmount
                + ", OrderDate=" + OrderDate + "]";
    }
    

    
}