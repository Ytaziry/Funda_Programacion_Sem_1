using System;

namespace Prog_7 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int C, F;
            float GradosC, GradosF;
            Console.WriteLine("Escribe valor de C");
            C = Convert.ToInt32(Console.ReadLine());
            GradosC = (C * 9 / 5) + 32 - F;
            Console.WriteLine("El resultado es: " + GradosC);
            Console.WriteLine("Escribe valor de F");
            F = Convert.ToInt32(Console.ReadLine());
            GradosF = (F - 32) * 5 / 9 - C;
            Console.WriteLine("Tu resultado es: " + GradosF);
        }
    }
}