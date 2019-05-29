﻿using System;
namespace Account_Balance
{
    class Program
    {
        static void Main()
        {
            int count = int.Parse(Console.ReadLine());

            decimal totalMoney = 0;
            decimal inputMoney = 0;

            while(count > 0)
            {
                inputMoney = decimal.Parse(Console.ReadLine());
                if(inputMoney < 0)
                {
                    Console.WriteLine("Invalid operation!");
                    break;
                }
                totalMoney += inputMoney;
                Console.WriteLine($"Increase: {inputMoney:F2}");
                count--;
            }
            Console.WriteLine($"Total: {totalMoney:F2}");
        }
    }
}
