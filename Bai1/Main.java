/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB3.Bai1;
import java.time.LocalDate;


/**
 *
 * @author Ngoc Nhi
 */
  public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Nuoc tuong", "sp4", 10.0);
        Product product2 = new Product("Gao", "sp1", 15.0);
        Product product3 = new Product("Duong", "sp3", 20.0);
       
        
        Order order = new Order(1, LocalDate.now());
        order.addLineItem(product1, 10);
        order.addLineItem(product2, 5);
        order.addLineItem(product3, 1);
        
        System.out.println(order.toString());
    }
}