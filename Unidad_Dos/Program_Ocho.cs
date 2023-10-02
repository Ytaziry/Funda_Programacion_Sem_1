using System;

namespace Prog_8 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int p;
            float metros;
            Console.WriteLine("Ingrese cantidad de pies: ");
            p = Convert.ToInt32(Console.ReadLine());
            metros = p * 0.3048;
            Console.WriteLine("El resultado es: " + metros);

        }
    }
}