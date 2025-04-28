package interfaceatv;
public class Invoice {
    
    private Double basicPayment;
    private Double tax;
    
    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public Invoice() {}

    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double totalPayment() {
        return getBasicPayment() + getTax();
    }

    @Override
    public String toString() {
        return "Invoice [basicPayment=" + basicPayment + ", tax=" + tax + "]" + totalPayment();
    }
}
