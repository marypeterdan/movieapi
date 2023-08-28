// write a program to calculate the tax based on salary - bug/debug,chunk
// salary<10000 - 5%
// salary<20000 - 10%
// salary<30000 - 15%

package com.stackroute.movieapi.model;
class Sample
{
    public static void main(String[] args) {
        int salary=20000;
        System.out.println("Salary is : "+salary);
        if(salary<10000 ) //change to >
        {
            System.out.println("Tax is 5%");
        }
        else if(salary<20000 && salary<30000)
        {
            System.out.println("Tax is 10%");
        }
        else if(salary<30000 && salary<40000)
        {
            System.out.println("Tax is 15%");
        }
        else
        {
            System.out.println("Tax is 20%");
        }
    }

    public static void calculateTax(int salary) {
      
    }
}