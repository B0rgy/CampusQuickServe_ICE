package campusquickserve_ice;

import javax.swing.JOptionPane;

public class QuickServeApp {

    public static void main(String[] args) {

        // Input using JOptionPane
        String name = JOptionPane.showInputDialog("Enter Customer Name:");
        String studentNo = JOptionPane.showInputDialog("Enter Student Number:");
        String item = JOptionPane.showInputDialog("Enter Item Ordered:");
        
        int quantity = Integer.parseInt(
                JOptionPane.showInputDialog("Enter Quantity:")
        );
        double price = Double.parseDouble(
                JOptionPane.showInputDialog("Enter Price per Item:")
        );

        //Order object
        Order order = new Order(name, studentNo, item, quantity, price);

        //Receipt layout to display out put
        String receipt = "====== Campus QuickServe Receipt ======\n"
                + "Customer Name: " + order.getCustomerName() + "\n"
                + "Student Number: " + order.getStudentNumber() + "\n"
                + "Item Ordered: " + order.getItemName() + "\n"
                + "Quantity: " + order.getQuantity() + "\n"
                + "Price per Item: (R)" + String.format("%.2f", order.getPricePerItem()) + "\n"
                + "---------------------------------------\n"
                + "Subtotal: R" + String.format("%.2f", order.calculateSubtotal()) + "\n"
                + "Discount Applied: R" + String.format("%.2f", order.calculateDiscount()) + "\n"
                + "VAT (15%): R" + String.format("%.2f", order.calculateVAT()) + "\n"
                + "---------------------------------------\n"
                + "Final Total: R" + String.format("%.2f", order.calculateFinalTotal()) + "\n"
                + "=======================================";

        //Display receipt
        JOptionPane.showMessageDialog(null, receipt);

        //Also print to console to check formatting
        System.out.println(receipt);
    }
}
