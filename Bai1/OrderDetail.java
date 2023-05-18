/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3.Bai1;

/**
 *
 * @author Ngoc Nhi
 */
class OrderDetail {
    private int quantity;
    private Product product;

    public OrderDetail(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double calcTotalPrice() {
        return quantity * product.getPrice();
    }

    @Override
    public String toString() {
        return product.getProductID() + " - " + product.getDescription() + " - $" + product.getPrice() + " - Quantity: " + quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
}

