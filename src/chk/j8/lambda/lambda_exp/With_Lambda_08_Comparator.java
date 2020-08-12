package chk.j8.lambda.lambda_exp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class With_Lambda_08_Comparator {

    List<Employee> listEmployee;

    public With_Lambda_08_Comparator() {
        comparatorCodeWithoutLambda();
        comparatorCodeWithLambda();
    }

    private void prepareDataSet() {

        listEmployee = new ArrayList<Employee>();
        listEmployee.add(new Employee("aaa", 10));
        listEmployee.add(new Employee("bbb", 100));
        listEmployee.add(new Employee("ccc", 5));
        listEmployee.add(new Employee("ddd", 1));
    }

    private void comparatorCodeWithLambda() {


        System.out.println("comparatorCodeWithLambda syntax-1");
        prepareDataSet();
        System.out.println("Data in the List : " + listEmployee);
        Collections.sort(listEmployee, (Employee e1, Employee e2) -> {
            return e1.salary - e2.salary;
        });
        System.out.println("Data in the List after sort based on salary: " + listEmployee);


        System.out.println("comparatorCodeWithLambda syntax-2");
        prepareDataSet();
        System.out.println("Data in the List : " + listEmployee);
        Collections.sort(listEmployee, (chk_data_emp1, chk_data_emp2) -> {
            return chk_data_emp1.salary - chk_data_emp2.salary;
        });
        System.out.println("Data in the List after sort based on salary: " + listEmployee);


        System.out.println("comparatorCodeWithLambda syntax-3");
        prepareDataSet();
        System.out.println("Data in the List : " + listEmployee);
        Collections.sort(listEmployee, (chk_data_emp1, chk_data_emp2) -> chk_data_emp1.salary - chk_data_emp2.salary);
        System.out.println("Data in the List after sort based on salary: " + listEmployee);
    }

    private void comparatorCodeWithoutLambda() {
        prepareDataSet();
        System.out.println("Data in the List : " + listEmployee);
        Collections.sort(listEmployee, new SalaryComparator());
        System.out.println("Data in the List after sort based on salary: " + listEmployee);
    }
}


class Employee {

    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

class SalaryComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.salary - e2.salary;
    }
}


