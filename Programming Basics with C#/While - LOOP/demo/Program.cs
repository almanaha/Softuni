﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace demo
{
    class Program
    {
        static void Main(string[] args)
        {
            int number = int.Parse(Console.ReadLine());

            while(number < 1 || number > 100)
            {
                Console.WriteLine("Invalid number");
                number = int.Parse(Console.ReadLine());
            }

            Console.WriteLine(number);
        }
    }
}
