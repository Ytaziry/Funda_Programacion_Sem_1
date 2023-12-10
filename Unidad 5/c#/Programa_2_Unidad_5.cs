using System;

namespace Programa_2_Uni_5

{
    internal class Programa
    {

        static void Main(string[] args)
        {
            int opcion;
            Console.WriteLine("Elige el tipo de conversion a realizar: ");
            Console.WriteLine("1 Temperatura de °C a °F");
            Console.WriteLine("2 Temperatura °F a °C");
            Console.WriteLine("3 Medida pulgadas a metros");
            Console.WriteLine("4 Tiempo hrs a segundos");
            opcion = Convert.ToInt32(Console.ReadLine());
            switch (opcion)
            {
                case 1:
                    double c;
                    Console.WriteLine("Escribe los grados a convertir: ");
                    c = Convert.ToInt32(Console.ReadLine());
                    break;
                case 2:
                    Console.WriteLine("Opcion 2");
                    break;
                case 3:
                    Console.WriteLine("Opcion 3");
                    break;
                case 4:
                    Console.WriteLine("Opcion 4");
                    break;
                default:
                    Console.WriteLine("La opcion es incorrecta");
                    break;
            }
        }
    }
    public static double TempraturaCf(double c)
    {
        double resultado = (c * 1.8) + 32;
        return resultado;
    }
    public static double TemperaturaFk(); 
    
}