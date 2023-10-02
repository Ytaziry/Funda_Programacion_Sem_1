using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int pi, radio;
            float area;
            Console.WriteLine("Escribe valor de Pi: ");
            pi = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe valor de radio: ");
            radio = Convert.ToInt32(Console.ReadLine());
            area = pi * (radio * radio);
            Console.WriteLine("Tu area es:" area);
        }
    }
}