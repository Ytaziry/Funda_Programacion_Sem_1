using System;

namespace Unidad_3_Programa_5 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double p1, p2, p3, total;
            Console.WriteLine("Escribe precio 1: ");
            p1 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Escribe precio 2: ");
            p2 = Convert.ToDouble(Console.ReadLine());
            Console.WriteLine("Escribe precio 3: ");
            p3 = Convert.ToDouble(Console.ReadLine());
            total = p1 + p2 + p3;
            if (total >= 1500)
            {
                total = total - (total * 0.30);
                Console.WriteLine("El total (30% desc): " + total);
            }
            else if (total < 1500 && total >= 1000)
            {
                total = total - (total * 0.20);
                Console.WriteLine("El total (20% desc): " + total);
            }
            else if (total < 1000 && total >= 700)
            {
                total = total - (total * 0.10);
                Console.WriteLine("El total (10% desc): " + total);
            }
            else
            {
                Console.WriteLine("El total del descuento es de 0%: " + total);

            }
        }
    }
}