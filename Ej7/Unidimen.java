package Ej7;

import java.util.Random;

public class Unidimen 
{
    public static void main(String[] args) 
    {
        // tamaño del array
        final int BASETOTAL = 6;
        
        // Array
        double[]bases;
        double[]resultados;

        // inicializacion del array
        bases = new double[BASETOTAL];
        resultados = new double[BASETOTAL];
        Random NumerosAleatorios = new Random();

        // ingresar los elementos del array
        for(int i=0; i<bases.length; i++)
        {
            bases[i]= Math.round(NumerosAleatorios.nextDouble() * 9.0 *10.0 / 10.0);
        };

        for(int i=0; i<resultados.length; i++)
        {
            if(bases[i]%2 == 0)
            {
                resultados[i]= bases[i] * bases[i];
            }
            if(bases[i]%2 != 0)
            {
                resultados[i]= bases[i] * bases[i] * bases[i];
            }
        };


        String salida1 = "Bases = [";
        for(int i=0; i<bases.length; i++)
        {
            if(i != (BASETOTAL - 1))
            {
                salida1 = salida1 + bases[i] + ", ";
            }
            else
            {
                salida1 = salida1 + bases[i];
            }
        };
        salida1 = salida1 + "]";

        String salida2 = "Resultados = [";
        for(int i=0; i<resultados.length; i++)
        {
            if(i != (BASETOTAL - 1))
            {
                salida2 = salida2 + resultados[i] + ", ";
            }
            else
            {
                salida2 = salida2 + resultados[i];
            }
        };
        salida2 = salida2 + "]";
        
        System.out.println(salida1);
        System.out.println(salida2);
    }
}
