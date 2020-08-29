/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamodisplay;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diana Servellón
 */
public class Prestamo { //bank loan
    private double amount; //"saldo"
    private double interestRate; //"tasa de interés"
    private double timeFrame; //"periodo de tiempo" //"plazo"
    
    public Prestamo(double am, double inR, double timF){
        amount = am; 
        interestRate= inR /100; // percentage
        timeFrame= timF; 
    }   

    Prestamo() {
        
    }
    public double monthlyPayment(double amount_, double interestRate_, double timeFrame_){
        double payment = (amount_ * interestRate_) / (1 - Math.pow(1 + interestRate_, 0 - timeFrame_)); 
        
        return payment; //"cuota"
    }
    
    //
    //"Mensualidades", It should print a list of monthly payments until 
    //the loan is repaid.
    //
    public List<Mensualidad> mensualidades(){ 
        List<Mensualidad> resultado = new ArrayList(); 
        
        int number = 0; 
        double currentAmount = amount; 
        double currentInterest; 
        double amortizationAmount=0;  
        double time = timeFrame; 
        
        
        while(time != 0){
            
            number ++; 
            
            currentInterest = interestRate * currentAmount; 
            amortizationAmount = (monthlyPayment(currentAmount,(currentInterest/currentAmount), time)) - currentInterest; 
            
            Mensualidad nuevo = new Mensualidad(number, Math.round(currentAmount), Math.round(currentInterest), Math.round(amortizationAmount), Math.round(monthlyPayment(currentAmount,(currentInterest/currentAmount), time)));
            resultado.add(nuevo); 
            
            time--; 
            currentAmount = currentAmount - amortizationAmount; 
            
        }
       
        return resultado; 
    }
    
    
    public String toString(){ 
        return " MONTO: " + amount +
               "        TASA:  " + interestRate +
               "        PLAZO: " + timeFrame +
               "        CUOTA: " + mensualidades().get(0).getPayment(); 
    }    
    
}
