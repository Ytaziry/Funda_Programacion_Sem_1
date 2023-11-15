using System;

namespace Prog_12_Uni_4 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int[,] calif ={{5,7,9},
                         {6,8,7},
                         {10,3,1}};
            Console.Write(calif[0, 0] + ",");
            Console.Write(calif[0, 1] + ",");
            Console.WriteLine(calif[0, 2] + ",");
            Console.Write(calif[1, 0] + ",");
            Console.Write(calif[1, 1] + ",");
            Console.WriteLine(calif[1, 2] + ",");
            Console.Write(calif[2, 0] + ",");
            Console.Write(calif[2, 1] + ",");
            Console.Write(calif[2, 2] + ",");
        }
    }
}
