package Ej6;

import javax.swing.JOptionPane;

public class Capita 
{
    public static void main(String[] args) 
    {
        int c1;
        int c2;
        int c3;
        int meses;

        c1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el capital de pedro: "));
        c2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el capital de juan: "));
        c3 = Integer.parseInt(JOptionPane.showInputDialog("Digite el capital requerido para el negocio: "));
        meses = 0;

        while(c1+c2 < c3)
        {
            c1 = (int)(c1 * 1.03);
            c2 = (int)(c2 + (c2 * 0.04));
            meses ++;
        }
        JOptionPane.showMessageDialog(null,"Dados los capitales los meses que tardarian en tener el capita necesario seria de: " + meses + " meses.", "Promedio" , JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
