using System;

namespace Prog_9 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int prod1, prod2, prod3, iva;
            float subtotal, t;
            Console.WriteLine("Escribe valor de Producto1: ");
            prod1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe valor de Producto2: ");
            prod2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe valor de Producto3: ");
            prod3 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escibe valor de iva: ");
            iva = Convert.ToInt32(Console.ReadLine());
            subtotal = prod1 + prod2 + prod3;
            Console.WriteLine("Subtotal de productos: " + subtotal);
            t = (prod1 * iva) + (prod2 * iva) + (prod3 * iva);
            Console.WriteLine("Total es: " + t);
        }
    }
}
