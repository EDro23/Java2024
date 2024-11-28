package ca.nl.cna.ethan.drover.Project;

public class InvoiceItem {

    private Billable billable;
    private int quantity;

    public InvoiceItem(Billable billable, int quantity) {
        this.billable = billable;
        this.quantity = quantity;
    }

    public Billable getBillable() {
        return billable;
    }

    public void setBillable(Billable billable) {
        this.billable = billable;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getItemTotal() {
        if (billable instanceof Product) {
            return billable.getPrice() * quantity; // Total = price per unit * quantity
        } else {
            return billable.getPrice(); // Total = price for the service
        }
    }
}