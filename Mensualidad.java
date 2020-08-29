
package prestamodisplay;

/**
 *
 * @author Diana Servellón
 */
public class Mensualidad {
    private int number; //consecutive number of payments
    private double currentAmount; //"saldo" // current amount at "x" time
    private double interestAmount; //current interest rate related with the current amount
    private double amortizationAmount; //monto de amortización
    
    private double payment; // cuota de ese mes // lo que pagó
    
    
    public Mensualidad(int num, double ca, double ia, double am, double pp){
        number = num; 
        currentAmount = ca; 
        interestAmount = ia; 
        amortizationAmount = am; 
        payment = pp; 
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public double getInterestAmount() {
        return interestAmount;
    }

    public void setInterestAmount(double interestAmount) {
        this.interestAmount = interestAmount;
    }

    public double getAmortizationAmount() {
        return amortizationAmount;
    }

    public void setAmortizationAmount(double amortizationAmount) {
        this.amortizationAmount = amortizationAmount;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    
    public String toString() {
        return "Mensualidad{" + "number=" + number +
                ", currentAmount=" + currentAmount +
                ", interestAmount=" + interestAmount +
                ", amortizationAmount=" + amortizationAmount +
                ", payment=" + payment + '}';
    }
    
}
