using System;
using System.ComponentModel.Design;

namespace Prog_1_Uni_4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[] edades = new int[] { 17, 19, 18, 18, 17 };
            int[] edades2 = new int[] { 17, 19, 18, 18, 18 };

            for (int i = 0; i < edades.Length; i++) 
            {
                if (edades[i] >= 18)
                    Console.WriteLine("Eres mayor!!!!");
                else
                    Console.WriteLine("Eres menor!!!!!");
            } 
        }
    }
}
