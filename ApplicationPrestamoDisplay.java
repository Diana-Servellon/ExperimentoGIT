/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamodisplay;

/**
 *
 * @author Diana Servellón
 */
public class ApplicationPrestamoDisplay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Prestamo bankLoan1 = new Prestamo(); 
        /*
        PrestamoDisplay ps = new PrestamoDisplay(); 
        ps.setVisible(true);
        ps.show(bankLoan1);
*/
        FormDisplay p = new FormDisplay(); 
        p.setVisible(true);
        p.show(p.getPrestamo());
    }
    
}
