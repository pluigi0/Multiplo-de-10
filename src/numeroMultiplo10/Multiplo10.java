
package numeroMultiplo10;

import javax.swing.JOptionPane;

/*Hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10*/
public class Multiplo10 {
    public static void main(String[] args) {
        int numero;
        
        JOptionPane.showMessageDialog(null, "Programita que calcula un numero multiplo de 10");
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if (numero%10 == 0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es multiplo de 10");
        }
        else {
            JOptionPane.showMessageDialog(null, +numero+" no es multiplo de 10");
        }
    }
    
}
