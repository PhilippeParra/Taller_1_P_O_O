package Ej2;

import javax.swing.JOptionPane;

public class Papeleria 
{
        public static void main(String[] args) 
        {
        int x;
        int z;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio neto del articulo: ")); 
        z = 0;

        if(x < 3000)
        {
            z = (x * 15)/100 + x ;
        }
        else if (3000 <= x && x <= 6000)
        {
            z =(int)x +500;
        }
        else if (x >= 6001)
        {
            z = (int)((x*25)/100) + x;
        };
        JOptionPane.showMessageDialog(null, "El precio de venta del articulo es; " + z + "$", "Papeleria" , JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
        }
}
