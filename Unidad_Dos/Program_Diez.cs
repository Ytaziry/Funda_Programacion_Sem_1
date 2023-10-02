using System;

namespace Prog_10 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int val1, val2;
            float suma, resta, multiplicacion, division;
            Console.WriteLine("Escribe valor 1: ");
            val1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe valor 2: ");
            val2 = Convert.ToInt32(Console.ReadLine());
            suma = val1 + val2;
            Console.WriteLine("Resultado de suma = " + suma);
            resta = val1 - val2;
            Console.WriteLine("Resultado de resta = " + resta);
            multiplicacion = val1 * val2;
            Console.WriteLine("Resultado de mulriplicacion = " + multiplicacion);
            division = val1 / val2;
            Console.WriteLine("Resultado de division = " + division);
        }
    }
}