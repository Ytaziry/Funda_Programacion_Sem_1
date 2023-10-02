using System;

namespace MyApp // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string nombre = "Yatziry", apellidos = "Escobar Rostro", completo;
            completo = nombre + apellidos;
            int a = 46, b = 87, suma;
            suma = a + b;
            Console.WriteLine("* * Bienvenido * * " + completo + " * * ");
            Console.WriteLine("La operación de suma de A = " + a + "B = " + b);
            Console.WriteLine($"Tu resultado es  {suma}");
            Console.WriteLine("  Gracias :)");
        }
    }
}