﻿using System;

namespace Prog_113_Uni_4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] calf = { { 5, 7, 9, 5 }, { 6, 8, 7, 5 }, { 10, 3, 1, 5 } };

            int fila = calf.GetLength(0);
            int columna = calf.GetLength(0);
            for (int f = 0; f < fila; f++)
            {
                for (int c = 0; c <= columna; c++)
                {
                    Console.Write(calf[f, c] + ",");
                }
                Console.WriteLine();
            }
        }
    }
}
