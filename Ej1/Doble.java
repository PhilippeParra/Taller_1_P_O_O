package Ej1;

import javax.swing.JOptionPane;

public class Doble
{
    public static void main(String[] args) 
    {
        int x;
        int R;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero: "));

        R = x * x;

        JOptionPane.showMessageDialog(null, "El doble de su numero: " + x + ", es " + R, "Doble" , JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}