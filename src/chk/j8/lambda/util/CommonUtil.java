package chk.j8.lambda.util;

import chk.j8.lambda.lambda_exp.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class CommonUtil {

    public static final String singlePatternRegEx = "[a-zA-Z]";

    public static List<Employee> getEmployeeList() {

        List<Employee> listEmployee = new ArrayList<Employee>();
        listEmployee.add(new Employee("aaa", 10));
        listEmployee.add(new Employee("bbb", 100));
        listEmployee.add(new Employee("ccc", 5));
        listEmployee.add(new Employee("ddd", 1));

        return listEmployee;
    }

    public static char getCharInput()
    {
        Scanner scanner = new Scanner(System.in);
        char ch  = scanner.next().charAt(0);
        return ch;
    }
}
