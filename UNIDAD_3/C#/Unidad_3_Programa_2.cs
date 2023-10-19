using System;

namespace Unidad_3_Programa_2 // Note: actual namespace depends on the project name.
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int cal1, cal2, cal3, cal4, cal5, cal6, promedio;

            Console.WriteLine("Escribe cal 1: ");
            cal1 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe cal 2: ");
            cal2 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe cal 3: ");
            cal3 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe cal 4: ");
            cal4 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe cal 5: ");
            cal5 = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Escribe cal 6: ");
            cal6 = Convert.ToInt32(Console.ReadLine());
            promedio = (cal1 + cal2 + cal3 + cal4 + cal5 + cal6) / 6;
            Console.WriteLine("Tu promedio es: " + promedio);
            if (promedio >= 70)
                Console.WriteLine("Aprovado");
            else
                Console.WriteLine("Reprovado");
        }
    }
}