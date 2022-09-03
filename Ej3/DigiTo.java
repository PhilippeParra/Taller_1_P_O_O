package Ej3;

import javax.swing.JOptionPane;

public class DigiTo 
{
    public static void main(String[] args) 
    {
        int numero;
        int numero2;
        int z;

        z = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero: "));
        numero2 = numero;

        while(numero2 != 0)
        {
            numero2 = numero2 / 10;
            z ++;
        };

        JOptionPane.showMessageDialog(null, "Su numero: " + numero + ", tiene " + z + " Digitos", "Digitos" , JOptionPane.INFORMATION_MESSAGE);

    }
}