using System;

namespace Prog_11 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int lad, apo;
            float area;
            Console.WriteLine("Escribe lado del exagono: ");
            lad = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe apotema del exagono: ");
            apo = Convert.ToInt32(Console.ReadLine());
            area = ((lad * 6) * apo) / 2;
            Console.WriteLine("El area es: " + area);
        }
    }
}