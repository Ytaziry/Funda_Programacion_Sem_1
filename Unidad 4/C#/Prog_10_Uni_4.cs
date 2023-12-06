using System;

namespace Prog_10_Uni_4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string[] paises = { "Canadá", "México", "Brazil", "Argentina" };

            double longitud_Prom = Calcular_Longitud(paises);

            Console.WriteLine($"La longitud promedio de las palabras de los países es: {longitud_Prom:F2}");
        }

        static double Calcular_Longitud(string[] arreglo)
        {
            int total_Letras = 0;
            int total_Palabras = 0;

            foreach (var pais in arreglo)
            {
                total_Letras += pais.Replace(" ", "").Length;

                total_Palabras += pais.Split(' ').Length;
            }

            double longitud_Promedio = (double)total_Letras / total_Palabras;

            return longitud_Promedio;
        }
    }
}