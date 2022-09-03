package Ej4;

import javax.swing.JOptionPane;

public class ProPa 
{
    public static void main(String[] args) 
    {
        int x;
        int z;
        int z2;
        int z3;
        int k;

        x = Integer.parseInt(JOptionPane.showInputDialog("Digite su numero: ")); 
        z = 0;
        z2 = 0;
        z3 = 0;
        k = x;

        if( x%2 != 0 )
        {
            z2 = x - 1;
        }

        while(x != 0)
        {
            if( x%2 == 0 )
            {
                z = z + x;
                x = x - 2;
                z3 ++;
            };
            if( x%2 != 0 )
            {
                z = z + z2;
                z2 = z2 - 2;
                z3 ++;
            }
        }


        JOptionPane.showMessageDialog(null,"Dado el numero " + k + " \nLa suma de los pares menores o iguales es: " + z + "\nY su promedio es: " + (z/z3), "Promedio" , JOptionPane.INFORMATION_MESSAGE);

    }   
}
