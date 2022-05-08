package com.mycompany.abstractdemo;

public class AbstractMain {
    public static void main(String[] args)
    {
        //Employee e1 = new Employee();//Object instantiation/creation is not allowed
        /*Employee e1 = new Employee() {
            @Override
            public double calculateSalary() {
                return 0;
            }
        }*/
        PermanentEmployee permanentEmployee = new PermanentEmployee();
        ContractEmployee contractEmployee = new ContractEmployee();

        String companyName = permanentEmployee.getCompanyName();
        double salaryOfPermanentEmployee = permanentEmployee.calculateSalary("permanent");
        double salaryOfContractEmployee = contractEmployee.calculateSalary("contractual");

        System.out.println("Company name is "+companyName);
        System.out.println("Salary of Permanent Employee is "+salaryOfPermanentEmployee);
        System.out.println("Salary of Contract Employee is "+salaryOfContractEmployee);
    }
}
