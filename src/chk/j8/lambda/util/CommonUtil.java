package chk.j8.lambda.util;

import chk.j8.lambda.lambda_exp.Employee;

import java.util.ArrayList;
import java.util.List;

public class CommonUtil {

    public static List<Employee> getEmployeeList() {

        List<Employee> listEmployee = new ArrayList<Employee>();
        listEmployee.add(new Employee("aaa", 10));
        listEmployee.add(new Employee("bbb", 100));
        listEmployee.add(new Employee("ccc", 5));
        listEmployee.add(new Employee("ddd", 1));

        return listEmployee;
    }
}
