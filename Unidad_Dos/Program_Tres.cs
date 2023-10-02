using System;

namespace Prog_3 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int c1, c2, c3, c4, c5, c6;
            float promedio;
            Console.WriteLine("Escribe calificación 1: ");
            c1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificación 2: ");
            c2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificación 3: ");
            c2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificación 4: ");
            c4 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificación 5: ");
            c5 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe calificación 6: ");
            c6 = Convert.ToInt32(Console.ReadLine());
            promedio = (c1 + c2 + c3 + c4 + c5 + c6) / 6;
            Console.WriteLine("Tu promedio es: " + promedio);
        }
    }
}