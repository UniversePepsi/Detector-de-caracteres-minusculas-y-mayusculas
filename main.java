/*
Ustedes deberán colocar la clase y el package.

Ejemplo:

package Test;

public class test
*/

import javax.swing.JOptionPane;

    public static void main(String[] args) {
        char caracter = 'A';
        int numeroCaracter = (int) caracter;
        
        numeroCaracter = JOptionPane.showInputDialog("Introduce un caracter: ").charAt(0);
        
        if(numeroCaracter >= 65 && numeroCaracter <= 90){
            JOptionPane.showMessageDialog(null, ">> Es mayuscula");
        }
        else if (numeroCaracter >= 97 && numeroCaracter <= 122){
            JOptionPane.showMessageDialog(null, ">> Es minuscula");
        }
        else {
            JOptionPane.showMessageDialog(null, ">> Error");
        }
    }
