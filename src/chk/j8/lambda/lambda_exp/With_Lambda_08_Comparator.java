package chk.j8.lambda.lambda_exp;

import java.util.Collections;
import java.util.List;

import static chk.j8.lambda.util.CommonUtil.getEmployeeList;

public class With_Lambda_08_Comparator {

    List<Employee> listEmployee;

    public With_Lambda_08_Comparator() {
        comparatorCodeWithoutLambda();
        comparatorCodeWithLambda();
    }


    private void comparatorCodeWithLambda() {


        System.out.println("comparatorCodeWithLambda syntax-1");
        listEmployee = getEmployeeList();
        System.out.println("Data in the List : " + listEmployee);
        Collections.sort(listEmployee, (Employee e1, Employee e2) -> {
            return e1.salary - e2.salary;
        });
        System.out.println("Data in the List after sort based on salary: " + listEmployee);


        System.out.println("comparatorCodeWithLambda syntax-2");
        listEmployee = getEmployeeList();
        System.out.println("Data in the List : " + listEmployee);
        Collections.sort(listEmployee, (chk_data_emp1, chk_data_emp2) -> {
            return chk_data_emp1.salary - chk_data_emp2.salary;
        });
        System.out.println("Data in the List after sort based on salary: " + listEmployee);


        System.out.println("comparatorCodeWithLambda syntax-3");
        listEmployee = getEmployeeList();
        System.out.println("Data in the List : " + listEmployee);
        Collections.sort(listEmployee, (chk_data_emp1, chk_data_emp2) -> chk_data_emp1.salary - chk_data_emp2.salary);
        System.out.println("Data in the List after sort based on salary: " + listEmployee);
    }

    private void comparatorCodeWithoutLambda() {
        listEmployee = getEmployeeList();
        System.out.println("Data in the List : " + listEmployee);
        Collections.sort(listEmployee, new SalaryComparator());
        System.out.println("Data in the List after sort based on salary: " + listEmployee);
    }
}


