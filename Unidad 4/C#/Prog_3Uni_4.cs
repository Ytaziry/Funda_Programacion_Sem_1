using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double f = 0, k = 0;
            int Ttemp;
            Console.WriteLine("Escribe el total de Temperaturas: ");
            Ttemp = Convert.ToInt32(Console.ReadLine());

            double[] TempC = new double[Ttemp];

            for (int i = 0; i < Ttemp; i++)
            {
                Console.WriteLine("Ingrese Temperatura en índice" + i + ": ");
                TempC[i] = Convert.ToDouble(Console.ReadLine());

                f = (TempC[i] * 9 / 5) + 32;
                Console.WriteLine("Los grados Farenheit son: " + f);

                k = TempC[i] + 273.15;
                Console.WriteLine("Los grados Kelvin son: " + k);
            }
            
        }
    }
}