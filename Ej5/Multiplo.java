package Ej5;

import javax.swing.JOptionPane;

public class Multiplo 
{
    public static void main(String[] args) 
    {
        int numero;
        int numero2;
        int z;
        int z2;
        int zTnum;
        int zTnum2;
        int zc1;
        int zc2;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite su primer numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite su segundo numero: "));
        z = numero;
        z2 = numero2;
        zTnum = 0;
        zc1 = 0;
        zc2 = 0;
        zTnum2 = 0 ;

        if(numero%5 == 0 && numero2%5 ==0)
        {
        while(z != 0)
            {
                if(z%5 == 0)
                {
                    zc1 ++;
                    zTnum = zTnum + z;
                }
                z = z - 1;
            }
        while(z2 != 0)
            {
                if(z2%5 == 0)
                {
                    zc2 ++;
                    zTnum2 = zTnum2 + z2;
                }
                z2 = z2 - 1;
            }

        JOptionPane.showMessageDialog(null, "Dados los numeros: " + numero + ", y " + numero2 + "\nLa suma de los numeros menores del primero \nMultiplos de 5 es: " + zTnum + "\nY su promedio es; " + zTnum/zc1 , "Multiplos" , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Y la suma de los numeros menores del segundo \nMultiplos de 5 es: " + zTnum2 + "\nY su promedio es; " + zTnum2/zc2 , "Multiplos" , JOptionPane.INFORMATION_MESSAGE);

        }
        else if(numero%5 == 0)
        {
            while(z != 0)
            {
                if(z%5 == 0)
                {
                    zc1 ++;
                    zTnum = zTnum + z;
                }
                z = z - 1;
                JOptionPane.showMessageDialog(null, "Dados los numeros: " + numero + ", y " + numero2 + "\nLa suma de los numeros menores del primero \nMultiplos de 5 es: " + zTnum + "\nY su promedio es; " + zTnum/zc1 , "Multiplos" , JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Y El segundo no es multiplo de 5", "Multiplos" , JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if(numero2%5 == 0)
        {
            while(z2 != 0)
            {
                if(z2%5 == 0)
                {
                    zc2 ++;
                    zTnum2 = zTnum2 + z2;
                }
                z2 = z2 - 1;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Dados los numeros: " + numero + ", y " + numero2 + "\nNinguno es multiplo de 5", "Multiplos" , JOptionPane.INFORMATION_MESSAGE);
        }


    }   
}
