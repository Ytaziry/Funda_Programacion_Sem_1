using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int edad;
            Console.WriteLine("Escribe tu edad");
            edad = Convert.ToInt32(Console.ReadLine());
            if (edad >= 18)
                Console.WriteLine("Eres mayor de edad!!!");
            else
                Console.WriteLine("Eres menor se edad :( "); 
        }
    }
}