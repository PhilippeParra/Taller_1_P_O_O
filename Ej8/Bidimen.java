package Ej8;

import java.util.Random;

public class Bidimen 
{
    public static void main(String[] args) 
    {
        // tamaño del array
        final int TOTAL_m = 4;
        final int TOTAL_n = 3;
        

        // Array
        double[][] bases;
        double[][] pares;
        double[][] impares;

        // inicializacion del array
        bases = new double[TOTAL_m][TOTAL_n];
        pares = new double[TOTAL_m][TOTAL_n];
        impares = new double[TOTAL_m][TOTAL_n];
        Random NumerosAleatorios = new Random();

        // ingresar los elementos del array
        for(int i=0; i<bases.length; i++)
        {
            for(int j=0; j<TOTAL_n; j++)
            {
                bases[i][j]= Math.round(NumerosAleatorios.nextDouble() * 20.0 *10.0 / 10.0);
            }
        }
        for(int i=0; i<bases.length; i++)
        {
            for(int j=0; j<TOTAL_n; j++)
            {
                if(bases[i][j] %2 == 0)
                {
                    pares[i][j] = bases[i][j];
                }  
                if(bases[i][j] %2 != 0)
                {
                    impares[i][j] = bases[i][j];
                } 
            }
        }
        String salida1 = "Bases = [";
        for(int i=0; i<bases.length; i++)
        {
            for(int j=0; j<TOTAL_n; j++)
            {
                if(i != (TOTAL_m - 1))
                {
                    salida1 = salida1 + bases[i][j] + ", ";
                }
                else
                {
                    salida1 = salida1 + bases[i][j];
                }
        }
        };
        salida1 = salida1 + "]";

        String salida2 = "Pares = [";
        for(int i=0; i<pares.length; i++)
        {
            for(int j=0; j<TOTAL_n; j++)
            {
                if(i != (TOTAL_m - 1))
                {
                    salida2 = salida2 + pares[i][j] + ", ";
                }
                else
                {
                    salida2 = salida2 + pares[i][j];
                }
        }
        };
        salida2 = salida2 + "]";

        String salida3 = "ImPares = [";
        for(int i=0; i<impares.length; i++)
        {
            for(int j=0; j<TOTAL_n; j++)
            {
                if(i != (TOTAL_m - 1))
                {
                    salida3 = salida3 + impares[i][j] + ", ";
                }
                else
                {
                    salida3 = salida3 + impares[i][j];
                }
        }
        };
        salida3 = salida3 + "]";

        System.out.println(salida1);
        System.out.println(salida2);
        System.out.println(salida3);
    }    
}
