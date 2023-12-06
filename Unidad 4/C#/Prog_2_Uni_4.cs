using System;

namespace Prog_2_Uni_4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            double[] calificaciones = new double[10];

            for (int i = 0; i < 10; i++)
            {
                Console.Write($"Ingrese la calificación {i + 1}: ");
                calificaciones[i] = double.Parse(Console.ReadLine());
            }

            double suma = 0;
            for (int i = 0; i < 10; i++)
            {
                suma += calificaciones[i];
            }

            double promedio = suma / 10;

            Console.WriteLine($"El promedio de las calificaciones es: {promedio}");
        }
    }
}
