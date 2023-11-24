using System;

namespace Prog_12_Uni_4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] calif = { { 5, 7, 9, 6 },
                         {6, 8, 7, 6 },
                         {10, 3, 1, 6} };

            int Fila = calif.GetLength(0);
            int Columna = calif.GetLength(1);
            for (int f = 0; f < Fila; f++) 
            {
                for (int c = 0; c < Columna; c++)
                {
                    Console.Write(calif[f, c] + ",");
                }
                Console.WriteLine();
            }
            
        }
    }
}