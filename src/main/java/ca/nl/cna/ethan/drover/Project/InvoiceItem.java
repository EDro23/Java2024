package ca.nl.cna.ethan.drover.Project;

public class InvoiceItem {

    private Billable billabe;
    private int quantity;

    public InvoiceItem(Billable billabe, int quantity) {
        this.billabe = billabe;
        this.quantity = quantity;
    }

    public Billable getBillabe() {
        return billabe;
    }

    public void setBillabe(Billable billabe) {
        this.billabe = billabe;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void getItemTotal() {
        
    }
}