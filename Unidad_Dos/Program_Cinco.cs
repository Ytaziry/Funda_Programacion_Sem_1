using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int y, a;
            float x;
            Console.WriteLine("Escribe valor de y: ");
            y = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe valor de a: ");
            a = Convert.ToInt32(Console.ReadLine());
            x = y + a + 3;
            Console.WriteLine("X = " + x);
        }
    }
}