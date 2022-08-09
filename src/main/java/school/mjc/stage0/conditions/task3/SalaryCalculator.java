package school.mjc.stage0.conditions.task3;

public class SalaryCalculator 

{
    public void calculateSalary(int salary) 
    
    {
            double temp;
            double salaryAfterTax;
    
    if (salary >0 && salary < 2147483647 )
   
    {
        if(salary > 0 && salary < 10000)
        {
            temp = salary * 0.15;
            salaryAfterTax= salary-temp;
            System.out.println(salaryAfterTax);
        }
        
        if(salary >= 10000 && salary < 20000)
        {
            temp = salary * 0.18;
            salaryAfterTax= salary-temp;
            System.out.println(salaryAfterTax);
        }
        
        
        if(salary >= 20000 )
        {
            temp = salary * 0.20;
            salaryAfterTax= salary-temp;
            System.out.println(salaryAfterTax);
        }
    }
    
    else
    {
        System.out.println("wrong input!");
    }
    }
}
