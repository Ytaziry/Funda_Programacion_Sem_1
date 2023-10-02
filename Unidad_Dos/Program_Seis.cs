using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int b, a;
            float area, perimetro;
            Console.WriteLine("Escribe valor de a: "); // valor de altura
            a = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe valor de b: "); // valor de base
            b = Convert.ToInt32(Console.ReadLine());
            area = (b * a) / 2;
            Console.WriteLine("El area es: " + area);
            perimetro = b + b + b;
            Console.WriteLine("El perimetro es: " + perimetro);
        }
    }
}
