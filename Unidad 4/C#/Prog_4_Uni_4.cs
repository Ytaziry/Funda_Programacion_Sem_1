using System;

namespace Prog_4_Uni_4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] numeros = { 5, -2, 10, -8, 3, -1, 7 };


            int totalN = ContarN(numeros);


            Console.WriteLine($"El total de números negativos es: {totalN}");
        }

        static int ContarN(int[] array)
        {
            int contador = 0;


            foreach (int numero in array)
            {
                if (numero < 0)
                {
                    contador++;
                }
            }

            return contador;
        }
    }
}
