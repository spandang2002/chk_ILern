package chk.j8.lambda_exp;

import chk.j8.util.CommonUtil;

import java.util.List;
import java.util.stream.Stream;

public class With_Lambda_09_FilterCollectionData {


    List<Employee> listEmployee;

    public With_Lambda_09_FilterCollectionData() {

        filterUsingLambdaBasedOnSalary();
    }

    private void filterUsingLambdaBasedOnSalary() {

        listEmployee = CommonUtil.getEmployeeList();

        /***
         * Filter the employee whose salary is less than 20.
         */
        Stream<Employee> employeeStream = listEmployee.stream().filter(empChk -> empChk.salary < 20);
        System.out.println("List of all employee");
        listEmployee.forEach(emp -> System.out.println(emp));

        System.out.println("List of employee whose salary is less than 20.");
        employeeStream.forEach(employee -> System.out.println(employee));
    }
}
