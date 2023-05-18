/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3.Bai1;

/**
 *
 * @author Ngoc Nhi
 */
import java.time.LocalDate;

class Order {
    private int orderID;
    private LocalDate orderDate;
    private OrderDetail[] lineItems;
    private int count;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new OrderDetail[20];
        this.count = 0;
    }

    public void addLineItem(Product product, int quantity) {
        lineItems[count] = new OrderDetail(product, quantity);
        count++;
    }

    public double calcTotalCharge() {
        double totalCharge = 0;
        for (int i = 0; i < count; i++) {
            totalCharge += lineItems[i].calcTotalPrice();
        }
        return totalCharge;
    }

    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Mã HD: ").append(orderID).append("\n");
    sb.append("Ngày lập hóa đơn: ").append(orderDate).append("\n");
    sb.append(String.format("%-4s | %-9s | %-13s | %9s | %10s | %13s\n",
            "STT", "Mã SP", "Mô tả", "Đơn giá", "Số lượng", "Thành tiền"));

    for (int i = 0; i < count; i++) {
        OrderDetail item = lineItems[i];
        sb.append(String.format("%-4d | %-9s | %-13s | %9s | %10d | %13s\n",
                i + 1,
                item.getProduct().getProductID(),
                item.getProduct().getDescription(),
                item.getProduct().getPrice(),
                item.getQuantity(),
                item.calcTotalPrice()));
    }
    sb.append("Tổng tiền: ").append(calcTotalCharge());
    return sb.toString();
}


    public OrderDetail[] getLineItems() {
        return lineItems;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
}